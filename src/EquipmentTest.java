public class EquipmentTest {
	
	
	public void constructorTest() throws AssertException
    {
		//full constructor method
		Equipment equipment = new Equipment("Heat vision/2, 0.0, 0.0 - Really hot lazer beams from the eyes");
		
		//getter tests
		Assert.assertEquals("Heat vision", equipment.getName());
        Assert.assertEquals(2, equipment.getCount());
        Assert.assertEquals(0.0, equipment.getTotalWeight());
        Assert.assertEquals(0.0, equipment.getTotalPrice());
        Assert.assertEquals("Really hot lazer beams from the eyes", equipment.getDescription());

        //toString test
        Assert.assertEquals("Name: Heat vision, Number: 2, Weight: 0.00 lbs, Price: $0.00 - Really hot lazer beams from the eyes", equipment.toString());
    }
}