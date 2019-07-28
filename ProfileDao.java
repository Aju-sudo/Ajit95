//java package(ajit95)
package com.maren.project1.dao;

import java.sql.Connection;//importing all the classes from the packages(ajit95)
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.maren.demosecb.model.Profile;

public class ProfileDao {

	public static Connection getConnection()throws ClassNotFoundException,SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
	}
	//save is the method for class profile(ajit95)
	public int save(Profile profile) {
		//connection and statement has been kept null(ajit95)
		Connection con = null;
		Statement st = null;
		int res = 0;
		//exception handling(ajit95)
		try {
			//getting connection with database(ajit95)
			con = getConnection();
			//creating statement(ajit95)
			st = con.createStatement();
			//executing queries9ajit95)
			res = st.executeUpdate("INSERT INTO test.profile (userid, name, email, mobile) VALUES ('"+profile.getUserid()+"', '"+profile.getName()+"', '"+profile.getEmail()+"', "+profile.getMobile()+")"); 
		}catch (ClassNotFoundException | SQLException e) {
			//this method prints a stack twice for this throwable obj on the standard error output stream(ajit95)
			e.printStackTrace();
		}finally {
			try {
				st.close();//closing the statement above(ajit95)
				con.close();//closing the connection above(ajit95)
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return res;
	}
	//fetches all remaining row in the result set (ajit95)
	public List<Profile> fetchAll() {
		//conn and statement has been kept null(ajit95)
		List<Profile> list=null;
		Connection con = null;
		Statement st = null;
		//exception handling(ajit95)
		try {
			//getting connection with database(ajit95)
			con = getConnection();
			//creating statement(ajit95)
			st = con.createStatement();
			//executing queries(ajit95)
			ResultSet rs = st.executeQuery("SELECT * FROM test.profile");
			if(rs != null)
				//creating a new obj profile of the class(ajit95)
				list = new ArrayList<>();
			while(rs.next()) {
				Profile pr = new Profile();
				//set method would the set the value and get method would return the variable(ajit95)
				pr.setUserid(rs.getString("userid"));
				pr.setName(rs.getString("name"));
				pr.setEmail(rs.getString("email"));
				pr.setMobile(rs.getLong("mobile"));
				list.add(pr);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				//this method print a stack trace for this throwable obj on the standard error output stream(ajit95)
				e.printStackTrace();
			}
			
		}
		return list;
	}
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
			st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM test.profile");
			while(rs.next()) {
				String id = rs.getString("userid");
				String name = rs.getString("name");
				String email = rs.getString("email");
				long mobile = rs.getLong("mobile");
				System.out.println("Id : " +id + "\tName : "+ name+ "\tEmail : " +email + "\tMobile : " +mobile );
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
