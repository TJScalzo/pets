/**
 * This class represent a collection of Pet objects
 * including objects of any class which IS-A Pet
 */
public class Zoo
{
    //fields
    private Pet[] theZoo;
    private int numPets;
    
    //constructors
    public Zoo()
    {
        numPets = 10;
        theZoo = createZoo(numPets);
    }
    
    public Zoo(int numPets)
    {
        this.numPets = numPets;
        theZoo = createZoo(numPets);
    }
    
    //methods
    private Pet[] createZoo(int numPets)
    {
        Pet[] zoo = new Pet[numPets];
        for(int i = 0; i < numPets; i++) {
            if(Math.random() < 0.5)
                zoo[i] = new loudMacaw("Gerald");
            else
                zoo[i] = new Macaw();
        }
        return zoo;
    }
    
    public void soundOff()
    {
        for(int i = 0; i < numPets; i++) {
            System.out.print("Area " + (i+1) + ": ");
            if(theZoo[i] != null)
                System.out.println("\"" + theZoo[i].speak() + "\" says " + theZoo[i].getName() + ".");
            else
                System.out.println("There is no animal in this area of the Zoo.");
        }
    }
    
    public void feedPets()
    {
        for(int i = 0; i < numPets; i++)
            theZoo[i].eat();
    }
}
