package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.List;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.FileItem;

public class UploadServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
		boolean flag = ServletFileUpload.isMultipartContent(request);
		if(flag){
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);
			try{
				List<FileItem> fileItems = sfu.parseRequest(request);
				ServletContext context = getServletContext();
				String basePath = context.getRealPath("/");

				for(FileItem fileItem: fileItems){
						if(fileItem.isFormField()){
								String fieldName =	fileItem.getFieldName();
								if(fieldName.equals("uname")){
									System.out.println(fileItem.getString()+" ~~~##################~~~~");
								}else if(fieldName.equals("email")){
									System.out.println(fileItem.getString()+" ~~~$$$$$$$$$$$$$$$$$$~~~~");
								}
						}else{
								String FileName = fileItem.getName();
								File file = new File(basePath,FileName);
								try{
										fileItem.write(file);
								}catch(Exception e){
										e.printStackTrace();
								}
						}
				}
			}catch(FileUploadException e){
				e.printStackTrace();
			}
		}
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}