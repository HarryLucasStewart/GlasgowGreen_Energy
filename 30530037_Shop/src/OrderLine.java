/**
 *
 * @author 30530037
 */
public class OrderLine {
    
    //Attributes
    private int orderLineId;
    private Product product;
    private int quantity;
    private double LineTotal;
    
    //Constructors EVERYTHING IN PARAMETERS
    public OrderLine(int orderLineId, Product product, int quantity)
    {
        orderLineId = 0;
        product = new Product();
        quantity = 100;
        LineTotal = 0;
        
    }
    
    //Constructors - 3 input parameters (EVERYTHING EXCEPT LineTotal)
    //Getters
    public int getOrderLineId()
    {
        return orderLineId;
    }
    
    public Product getProduct()
    {
        return product;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    //Setters
    public void setOrderLineId(int OrderLineIdIn)
    {
        orderLineId = OrderLineIdIn;
    }
    
    public void setProduct(Product ProductIn)
    {
        product = ProductIn;
    }
    
    public void setQuantity(int QuantityIn)
    {
        quantity = QuantityIn;
    }

    
            
            
    
}
