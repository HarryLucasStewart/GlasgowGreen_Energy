

/**
 *
 * @author 30530037
 */
public class User {
    
    //Attributes
    private String Username;
    private String Password;
    private String firstName;
    private String lastName;
    
    //Constructor - 0 input parameters
    //Used to make objects
    public User()
    {
        Username = "HarryLucasStewart";
        Password = "password12345";
        firstName = "Harry";
        lastName = "Stewart";
        
    }
    
    //Overloaded Methods
    //Constructor - 4 input parameters
    public User(String UsernameIn, String PasswordIn, String firstNameIn, String lastNameIn)
    {
        Username = UsernameIn;
        Password = PasswordIn;
        firstName = firstNameIn;
        lastName = lastNameIn;
        
    }
    
    // Methods
    // accessModifier returnType methodsName(input parameters)
    // Getter methods
    public String getUsername()
    {
        return Username;
    }
    
    public String getPassword()
    {
        return Password;
    }
    
    public String getfirstName()
    {
        return firstName;
    }
    
    public String getlastName()
    {
        return lastName;
    }
    
    //Setter Methods
    
    public void setUsername (String UsernameIn)
    {
        Username = UsernameIn;
    }
    
    public void setPassword (String PasswordIn)
    {
        Password = PasswordIn;
    }
    
    public void setfirstName (String firstNameIn)
    {
        firstName = firstNameIn;
    }
    
    public void setLastName (String lastNameIn)
    {
        lastName = lastNameIn;
    }

    //@Override
    //public SourceVersion getSupportedSourceVersion() {
        //return SourceVersion.RELEASE_24;
    }
/*}*/
