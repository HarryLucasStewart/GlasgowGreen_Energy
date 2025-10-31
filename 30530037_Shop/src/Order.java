
import java.util.Date;
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 30530037
 */
public class Order {
    
 //Atributes
    private int orderId;
    private Date orderDate;
    private String status;
    private double orderTotal;
    //HashMap<Date_Type_of_Key>
    //Integer - orderLineId
    private HashMap<Integer, OrderLine> orderLines;
    
    //Getters and Setters
    
    //Getter for orderLines
    public HashMap<Integer, OrderLine> GetOrderLines()
    {
        return orderLines;
    }
    
    //Setter for orderLines
    public void setOrderLines(HashMap<Integer, OrderLine> orderLinesIn)
    {
        orderLines = orderLinesIn;
    }
    
    //Constructors - 0 input parameter
    public Order()
    {
        orderId = 0;
        orderDate = new Date();
        status = "Ongoing";
        orderTotal = 0;
        orderLines = new HashMap();
    }
    
    //Constructors - 4 input parameters
    public Order(int orderIdIn, Date orderDateIn, String statusIn, double orderTotalIn)
    {
        orderId = orderIdIn;
        orderDate = orderDateIn;
        status = statusIn;
        orderTotal = orderTotalIn;
    }
    
}   
          
            
        
    
            
    

    
    

