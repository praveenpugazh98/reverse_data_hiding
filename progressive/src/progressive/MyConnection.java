/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package progressive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 *
 * @author Administrator
 */
public class MyConnection {
    
    public Connection con;
    public Statement st;
    public static String  jdbcDriver = "";
    public static String  dbURL = "";
    public static String  username = "";
    public static String  password = "";
    public static String  imagePath = "";
    public static String  wavPath = "";
    
    public Statement dbConnection()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
        st=con.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
         return st;
    }
    
     }
