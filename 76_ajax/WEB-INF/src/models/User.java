package models;

import java.util.ArrayList;
import java.sql.*;

public class User{
	private Integer userId;
	private String userName;
	private String email;
	private String password;

	public User(){

	}

	public User(Integer userId,String userName,String email,String password){
			this.userId=userId;
			this.userName=userName;
			this.email=email;
			this.password=password;
	}

	public User(String userName,String email,String password){
			this.userName=userName;
			this.email=email;
			this.password=password;
	}

	public boolean saveUser(){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","1234");
			
			String query = "insert into users (user_name,email,password) value (?,?,?)";

			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1,userName);
			pst.setString(2,email);
			pst.setString(3,password);
			
			int res = pst.executeUpdate();
			if(res==1){
				flag = true;
			}
			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}

		return flag;
	}

	public static ArrayList<User> collectUser(){
		ArrayList<User> users = new ArrayList<User>();
				try{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","1234");
					String query= "select * from users";
					PreparedStatement pst = con.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					while(rs.next()){
							users.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
					}
					con.close();
				}catch(ClassNotFoundException | SQLException e){
						e.printStackTrace();
				}
				return users;
	}

	public void setUserName(String userName){
			this.userName=userName;
	}

	public String getUserName(){
			return userName;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getEmail(){
		return email;
	}

	public void setPassword(String password){
			this.password=password;
	}

	public String getPassword(){
		return password;
	}

	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return userId;
	}
}