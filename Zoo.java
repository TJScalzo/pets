/**
 * This class represent a collection of Pet objects
 * including objects of any class which IS-A Pet
 */
public class Zoo
{
    //fields
    private Pet[] theZoo;
    
    //constructors
    public Zoo()
    {
        theZoo = new Pet[10];
        theZoo[0] = new Pet("Gerald");
        theZoo[1] = new Macaw();
        theZoo[2] = new Pet("Giblet");
        theZoo[3] = new Macaw("Sandy");
        theZoo[4] = new Pet("Hector");
    }

    public void soundOff()
    {
        for(int i = 0; i < theZoo.length; i++) {
            System.out.print("Area " + (i+1) + ": ");
            if(theZoo[i] != null)
                System.out.println("\"" + theZoo[i].speak() + "\" says " + theZoo[i].getName() + ".");
            else
                System.out.println("There is no animal in this area of the Zoo.");
        }
    }
}
