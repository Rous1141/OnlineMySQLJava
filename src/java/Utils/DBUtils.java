/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hendrix
 */
public class DBUtils {
    private final static String serverName = "mysql-33a48e28-blazehendrix007-9343.a.aivencloud.com";
    private final static String dbName = "Test02";
    private final static String portNumber = "28956";
    private final static String instance = "";//LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
    private final static String userID = "avnadmin";
    private final static String password = "AVNS_bshtLjih_Fz-5HKLiOm";
    public static Connection getConnection() {
        try {
                //String url = "jdbc:mysql://" + serverName +"/" + dbName;
                String url = "jdbc:mysql://" + serverName + ":" + portNumber + "/" + dbName;
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, userID, password);
        } catch (SQLException ex) {
            System.out.println("Connection error! " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Connection error! " + ex.getMessage());
        }
        return null;
    }
}
