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
    //method
    public String speak()
    {
        return super.getName() + " wants a cracker!";
    }
}