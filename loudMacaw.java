/**
 * The loudMacaw class - a sub-class of Macaw in the Pet Inheritance Hierarchy
 */
public class loudMacaw extends Macaw
{
    //constructors
    public loudMacaw()
    {
        super("CHIRPY");
    }
    
    public loudMacaw(String n)
    {
        super(n.toUpperCase());
    }
    
    //methods
    public String speak()
    {
        return super.speak() + " "+ super.speak();
    }
    
    public String eat()
    {
        return super.getName() + " eats all of the bird seed.";
    }
}