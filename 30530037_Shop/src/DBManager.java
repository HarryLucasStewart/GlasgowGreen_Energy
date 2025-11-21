
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30530037
 */
public class DBManager {
    
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String connectionString = "jdbc:ucanaccess://Data\\ShopDB.accdb";
    
    public ArrayList<Customer> loadCustomers()
    {
        ArrayList<Customer> allCustomers = new ArrayList();
                
        try
        {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");
            
            while(rs.next())
            {
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String addressLine1 = rs.getString("AddressLine1");
                String addressLine2 = rs.getString("AddressLine2");
                String town = rs.getString("Town");
                String postcode = rs.getString("Postcode");
                
                Customer c = new Customer(username, password, firstName, lastName, addressLine1, addressLine2, town, postcode);
                
                allCustomers.add(c);
            }
        
    
        }
        catch (Exception ex)
        {
            System.out.println("Error loading Customers: " + ex.getMessage());
            
        }
        finally
        {
            return allCustomers;
        }
    
    }
    
    public ArrayList<Staff> loadStaff()
    {
        ArrayList<Staff> allStaff = new ArrayList();
        
        try
        {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");
            
            while(rs.next())
            {
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String position = rs.getString("Position");
                double salary = rs.getDouble("Salary");
                
                Staff s = new Staff(username, password, firstName, lastName, position, salary);
                
                allStaff.add(s);
            }   
        }
        catch (Exception ex)
        {
            System.out.println("Error loading Staff: " + ex.getMessage());
        }
        finally
        {
            return allStaff;
        }
    }
            
    
    
}
