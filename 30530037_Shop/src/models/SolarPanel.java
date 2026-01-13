package models;

/**
 *
 * @author 30530037
 */
public class SolarPanel extends Product {
   
    //Attributes
    private int wattageOutput;
    
    //Constructors
    public SolarPanel()
    {
        //call Product
        super();
        wattageOutput = 100;
    }
    
    //Constructors - 4 input parameters (EVERYTHING EXCEPT productId
    public SolarPanel(String ProductNameIn, double PriceIn, int StockLevelIn)
    {
        wattageOutput = 100;
    }
    
    //Constructors - 5 input parameters (EVERYTHING)
    public SolarPanel(int ProductIdIn, String ProductNameIn, double PriceIn, int StockLevelIn)
    {
        wattageOutput = 100;
    }
    
    //Getters
    public int getWattageOutput()
    {
        return wattageOutput;
    }
    
    //Setters
    public void setWattageOutput(int WattageOutputIn)
    {
        wattageOutput = WattageOutputIn;
    }
}
