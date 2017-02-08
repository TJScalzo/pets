/**
 * The Macaw class - a sub-class of the Pet Inheritance Hierarchy
 */
public class Macaw extends Pet
{
    //constructors
    public Macaw()
    {
        super("Chippy");
    }
    
    public Macaw(String n)
    {
        super(n);
    }
    
    //methods
    public String speak()
    {
        return super.getName() + " wants a cracker!";
    }
    
    public String eat()
    {
        return super.getName() + " eats some bird seed.";
    }
}