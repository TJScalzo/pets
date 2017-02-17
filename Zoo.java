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
        theZoo = new Pet[40];
        theZoo[0] = new Snake("Mark");
        theZoo[1] = new Pet("boring pet");
        theZoo[2] = new Pet("boring pet");
        theZoo[3] = new Pet("boring pet");
        theZoo[4] = new Pet("boring pet");
        theZoo[5] = new Pet("boring pet");
        theZoo[6] = new Pet("boring pet");
        theZoo[7] = new Pet("boring pet");
        theZoo[8] = new Pet("boring pet");
        theZoo[9] = new Pet("boring pet");
        theZoo[11] = new Pet("boring pet");
        theZoo[12] = new Pet("boring pet");
        theZoo[13] = new Pet("boring pet");
        theZoo[14] = new Pet("boring pet");
        theZoo[15] = new Pet("boring pet");
        theZoo[16] = new Pet("boring pet");
        theZoo[17] = new Pet("boring pet");
        theZoo[18] = new Pet("boring pet");
        theZoo[19] = new DireWolf();
        theZoo[20] = new Macaw("Gerald");
        theZoo[21] = new Pet("boring pet");
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
        for(int i = 0; i < numPets; i++) {
            System.out.print("Area " + (i+1) + ": ");
            if(theZoo[i] != null)
                System.out.println(theZoo[i].eat());
            else
                System.out.println("There is no animal in this area of the Zoo.");
        }
    }
}
