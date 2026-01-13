package models;


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
    
    public ArrayList<Customer> loadCustomer()
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
    
    public ArrayList<Product> loadProduct()
    {
        ArrayList<Product> allProducts = new ArrayList();
        
        try
        {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
            
            while(rs.next())
            {
                int ProductId = rs.getInt("ProductId");
                String ProductName = rs.getString("ProductName");
                double Price = rs.getDouble("Price");
                int StockLevel = rs.getInt("StockLevel");
                
                Product p = new Product(ProductId, ProductName, Price, StockLevel);
                
                allProducts.add(p);
            }    
        }
        catch (Exception ex)
        {
            System.out.println("Error loading Products: " + ex.getMessage());
        }
        finally
        {
            return allProducts;
        }
    }
    
    public Customer CustomerLogin(String username, String password)
    {
        ArrayList<Customer> allCustomers = loadCustomer();
        
        for(Customer cs : allCustomers)
        {
            if(cs.getUsername().equals(username) && cs.getPassword().equals(password))
            {
                return cs;
            }
           
        }
        return null;
    }
        
    
        
            
    
}
            
    
    

