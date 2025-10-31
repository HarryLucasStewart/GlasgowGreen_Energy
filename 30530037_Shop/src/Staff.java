/**
 *
 * @author 30530037
 */
public class Staff extends User{
    
    //Attributes
    private String position;
    private double salary;
    
    //Constructors - 6 input parameters
    public Staff()
    {
        //call User
        super();
        position = "Manager";
        salary = 100;
    }
    
    //Getters
    
    public String getPosition()
    {
        return position;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    //Setters  
    
    public void setPosition(String PositionIn)
    {
        position = PositionIn;
    }
    
    public void setSalary(double SalaryIn)
    {
        salary = SalaryIn;
    }
}
