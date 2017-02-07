/**
 * The loudMacaw class - a sub-class of Macaw in the Pet Inheritance Hierarchy
 */
public class loudMacaw extends Macaw
{
    //constructors
    public loudMacaw()
    {
        super();
    }
    public loudMacaw(String n)
    {
        super(n);
    }
    //method
    public String speak()
    {
        return super.speak() + " "+ super.speak();
    }
}