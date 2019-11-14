package models;

import java.sql.*;
import java.util.ArrayList;

public class City{
			private Integer cityId;
			private String city;

			public City(){

			}
			public City(Integer cityId,String city){
						this.cityId=cityId;
						this.city=city;
			}

		public static String getDetails(int cityId){
		String details = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pracdb?user=root&password=1234");
			
			String query = "select details from cities where city_id=?";

			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setInt(1,cityId);

			ResultSet rst = pst.executeQuery();

			if(rst.next()){
				details = rst.getString(1);
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return details;
	}



			public static ArrayList<City> collectCities(String ct){
					ArrayList<City> cities = new ArrayList<City>();
					try{
							Class.forName("com.musql.jdbc.Driver");

							Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pracdb?user=root&password=1234");

							String query = "select city_id,city from cities where city like '"+ct+"%'";

							PreparedStatement pst = con.prepareStatement(query);

							ResultSet rs = pst.executeQuery();

							while(rs.next()){
									City city = new City();
									city.cityId = rs.getInt(1);
									city.city = rs.getString(2);

									cities.add(city);
							}
							con.close();
					}catch(ClassNotFoundException | SQLException e){
								e.printStackTrace();
					}
					return cities;
			}

			public void setCityID(Integer cityId){
					this.cityId = cityId;
			}
			public Integer getCityID(){
					return cityId;
			}
			public void setCityId(String city){
					this.city = city;
			}
			public String getCityId(){
					return city;
			}
	}
