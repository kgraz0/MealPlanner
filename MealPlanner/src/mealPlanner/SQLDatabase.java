package mealPlanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class SQLDatabase {
	
	SQLDatabase() {
	}
	
    public void connectDB() {
   
    try {
    	ResourceBundle reader = ResourceBundle.getBundle("dbConfig");
    Connection connection = DriverManager.getConnection(reader.getString("url"), reader.getString("username"), reader.getString("password"));
    
    String sql = "SELECT * from current_stock";
    
    Statement statement = connection.createStatement();
    statement.executeUpdate("INSERT INTO current_stock (item_name, quantity, food_group)"
+ " VALUES ('Banana', 2, 'Fruit')");

    ResultSet rs = statement.executeQuery(sql);
    while (rs.next()) {
    	System.out.println(rs.getString(4));
    }
    //System.out.println(rs.getString("id"));
    connection.close();
    //System.out.println(statement.executeUpdate(sql));
    //System.out.println("Successfully connected.");
    } catch (SQLException e) {
    	System.out.println("Something went wrong with the database connection.");
    	e.printStackTrace();
    }
    }
    }
