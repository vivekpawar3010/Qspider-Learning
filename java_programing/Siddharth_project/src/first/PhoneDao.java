package first;
//package com.jsp.phonecrud.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PhoneDao {

	// DAO== Data Access Object
	// dao consist of database logic in real time application
	// DAO is also called as repoClass

	private static Scanner sc = new Scanner(System.in);
	private static Connection conn;
	static {
		String url = "jdbc:postgresql://localhost:5432/phonecrud";
		String user = "postgres";
		String pass = "Kartik12";
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Class Loaded....");

			// create Connection
			conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void savePhone() {

		String sql = "Insert into phone values(?,?,?,?,?)";
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Phone Id : ");
			int id = sc.nextInt();
			System.out.println("Enter Name : ");
			String name = sc.next();
			System.out.println("Enter color : ");
			String color = sc.next();
			System.out.println("Enter Price : ");
			double price = sc.nextDouble();
			System.out.println("Enter Ram : ");
			int ram = sc.nextInt();
			// set value to the table
			st.setInt(1, id);
			st.setString(2, name);
			st.setString(3, color);
			st.setDouble(4, price);
			st.setInt(5, ram);

			st.execute();

			System.out.println("Data inserted Successfully ....");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void displayPhoneData() 
	{
	try {
		
		Statement st=conn.createStatement();
		String sql="select * from phone";
		st.execute(sql);
		ResultSet rs = st.getResultSet();an
		while(rs.next())an
			{
			System.out.println("Mobile Id is : "+ rs.getInt(1));
			System.out.println("Moblie Name is : "+rs.getString(2));
			System.out.println("Mobile Color is :" +rs.getString(3));
			System.out.println("Moblie Price is :"+rs.getDouble(4));
			System.out.println("Mobile Ram is :"+rs.getInt(5));
			
			System.out.println("----------------------");
			
			}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

	public static void updatePhoneName() {

		try {
			String sql = "update phone set name=? where id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			System.out.println("Enter the new Name : ");
			String name = sc.next();
			System.out.println("Enter the id ");
			int id = sc.nextInt();

			st.setString(1, name);
			st.setInt(2, id);
			st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updatePhoneColor() {

		try {
			String sql = "update phone set color=? where id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			System.out.println("Enter the new Color : ");
			String color = sc.next();
			System.out.println("Enter the id ");
			int id = sc.nextInt();

			st.setString(1, color);
			st.setInt(2, id);
			st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updatePhonePrice() {

		try {
			String sql = "update phone set price=? where id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			System.out.println("Enter the new Price : ");
			double price = sc.nextDouble();
			System.out.println("Enter the id ");
			int id = sc.nextInt();

			st.setDouble(1, price);
			st.setInt(2, id);
			st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updatePhoneRam() {

		try {
			String sql = "update phone set ram=? where id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			System.out.println("Enter the new ram : ");
			int ram = sc.nextInt();
			System.out.println("Enter the id ");
			int id = sc.nextInt();

			st.setInt(1, ram);
			st.setInt(2, id);
			st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void deletePhoneDetails() {

		try {
			String sql = "delete from phone where id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			System.out.println("Enter the id : ");
			int id = sc.nextInt();
			st.setInt(1, id);
			st.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readPhoneDetailsOnId() {

		try {
			String sql = "select * from phone where id=?";
			PreparedStatement st = conn.prepareStatement(sql);
			System.out.println("Enter the id : ");
			int id = sc.nextInt();
			st.setInt(1, id);
			st.execute();

			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				System.out.println("Mobile Id is : " + rs.getInt(1));
				System.out.println("Moblie Name is : " + rs.getString(2));
				System.out.println("Mobile Color is :" + rs.getString(3));
				System.out.println("Moblie Price is :" + rs.getDouble(4));
				System.out.println("Mobile Ram is :" + rs.getInt(5));

				System.out.println("----------------------");

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}