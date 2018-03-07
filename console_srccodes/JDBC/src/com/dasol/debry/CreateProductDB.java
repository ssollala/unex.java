package com.dasol.debry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateProductDB {
	public static final String DERBY_DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_DERBYURL = "jdbc:derby:products;create=true";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName(DERBY_DRIVER);
		Connection connection = DriverManager.getConnection(JDBC_DERBYURL);
		
		createTable(connection);
		populateTable(connection);
		
		System.out.println("products table created and records inserted successfully");
	}
	
	private static void populateTable(Connection con) throws SQLException {
		try{
			con.createStatement().execute("insert into products values "
				+ "(1, 'MacBook Air', 1250.50, 10), "
				+ "(2, 'MacBook Pro', 1700.00, 8), "
				+ "(3, 'iMac', 2200.50, 5)");	
	
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}

	private static void createTable(Connection con) throws SQLException{
		String createString = "create table products ("
				+ "inventory_id int, item_name varchar(25), "
				+ "item_price decimal(10,2), "
				+ "item_count int)";
	
		try{
			con.createStatement().execute(createString);
		}catch(SQLException e){
			e.printStackTrace();
		}	
	}


}