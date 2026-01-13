package models;

/**
 *
 * @author 30530037
 */
public class HeatPump extends Product {
    
    //Attributes
    private double efficiencyRating;
    
    //Constructors
    public HeatPump()
    {
        //call Product
        super();
        efficiencyRating = 10;
        
    }
    
    //Constructors - 4 input parameters (ALL EXCEPT productId)
    public HeatPump(String ProductNameIn, double PriceIn, int StockLevelIn)
    {
        efficiencyRating = 10;
        
    }
    
    //Constructors - 5 input parameters (EVERYTHING)
    public HeatPump(int ProductIdIn, String ProductNameIn, double PriceIn, int StockLevelIn)
    {
        efficiencyRating = 10;
    }
    
    //Getters
    public double getEfficiencyRating()
    {
        return efficiencyRating;
    }
    
    //Setters
    public void setEfficiencyRating(double efficiencyRatingIn)
    {
        efficiencyRating = efficiencyRatingIn;
        
    }
}
