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
    //method
    public String speak()
    {
        return super.speak() + " "+ super.speak();
    }
}