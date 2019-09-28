package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/hb-01-one-to-one-uni?useSSL=false&serverTimeZone=UTC";
		String user = "hbstudent";
		String password = "hbstudent";
		try {
			System.out.println("Connecting to database: " + jdbcUrl);
			Connection myConnection = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connection sucessful!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}