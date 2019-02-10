/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void fullConstructorTest() throws AssertException
    {
    	//Declare and initialize values to compare
    	Animal Zebra = new Animal("Striped", "Ziggy", 400.4034, 5.8746);
    	String ZebraColor = "Striped";
    	String ZebraName = "Ziggy";
    	double ZebraWeight = 400.4034;
    	double ZebraHeight = 5.8746;
    	
    	//Compare values with the getter methods
    	Assert.assertEquals(ZebraColor, Zebra.getColor());
    	Assert.assertEquals(ZebraName, Zebra.getName());
    	Assert.assertEquals(ZebraWeight, Zebra.getWeight());
    	Assert.assertEquals(ZebraHeight, Zebra.getHeight());
    	
    	//Print toString method
    	System.out.println(Zebra.toString());
    }
}

