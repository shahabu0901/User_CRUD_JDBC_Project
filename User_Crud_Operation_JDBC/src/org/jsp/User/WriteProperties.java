package org.jsp.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
	public static void main(String[] args) {
		try {
			FileOutputStream stream = new FileOutputStream("userapp.properties");
			Properties p = new Properties();
			p.setProperty("url", "jdbc:mysql://localhost:3306/user_app");
			p.setProperty("user", "root");
			p.setProperty("password", "admin");
			p.setProperty("driverClass", "com.mysql.jdbc.Driver");
			p.store(stream, "Storing JDBC properties");
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
