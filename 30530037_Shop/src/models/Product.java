package models;

/**
 *
 * @author 30530037
 */
public class Product {
    
    @Override
    public String toString()
    {
        String productOutput = ProductName + " £" + Price;
        return productOutput;
    }
    
    //Attributes
    private int ProductId;
    private String ProductName;
    private double Price;
    private int StockLevel;
    
    //Constructor - 0 input parameter
    //Used to make objects
    
    public Product()
    {
        ProductId = 001;
        ProductName = "Solar Panel";
        Price = 200;
        StockLevel = 4;
        
    }
    
    //Overloaded Methods
    //Constructor - 4 input parameters
    public Product(int ProductIdIn, String ProductNameIn, double PriceIn, int StockLevelIn)
    {
        ProductId = ProductIdIn;
        ProductName = ProductNameIn;
        Price = PriceIn;
        StockLevel = StockLevelIn; 
        
    }
    
    //Overloaded Methods
    //Contructor - 3 input parameters ALL EXCEPT ProductId
    public Product(String ProductNameIn, double PriceIn, int StockLevelIn)
    {
        ProductId = 0;
        ProductName = ProductNameIn;
        Price = PriceIn;
        StockLevel = StockLevelIn;
        
    }
    
    // Methods
    // accessModifier returnType methodsName(input parameters)
    // Getter methods
    public int getProductId()
    {
        return ProductId;
    }
    
    public String getProductName()
    {
        return ProductName;
    }
    
    public double getPrice()
    {
        return Price;
    }
    
    public int getStockLevel()
    {
        return StockLevel;
    }
    
    //Setter Methods
    
    public void setProductId (int ProductIdIn)
    {
        ProductId = ProductIdIn;
    }
    
    public void setProductName (String ProductNameIn)
    {
        ProductName = ProductNameIn;
    }
    
    public void setPrice (double PriceIn)
    {
        Price = PriceIn;
    }
    
    public void setStockLevel (int StockLevelIn)
    {
        StockLevel = StockLevelIn;
    }
}
