package com.JavaAdvanced.jpa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2Configuration {

    private static String h2Driver = "org.h2.Driver";
    private static String h2addr = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static String user = "";
    private static String password = "";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection com = getDBConnection();
        if (com != null) {
            System.out.println("Sukces!!");
        } else
        {
            System.out.println("Porażka!!");
        }
    }

    private static Connection getDBConnection () throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Class.forName(h2Driver);

        DriverManager.getConnection(h2addr, user, password);


        return connection;
    }
}
