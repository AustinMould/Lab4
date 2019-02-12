/*
 TODO:

1. Constructor test
2. Getter tests
3. ExpandZoo test
4. AddAnimal test
5. toString test
*/

public class ZooTest {
	
	
	
	public void constructorAndGetterTests() throws AssertException {
		//Create new animals to add to the zoo array
		Animal Gorilla = new Animal("Black", "Kerjack", 649.201, 74.18);
		Animal Lion = new Animal("Blonde", "Simba", 539.198, 59.55);
		Animal Dragon = new Animal("Red", "Mushu", 37.275, 28.57);
		
		//Zoo constructor with an intial capacity of 2
		Zoo DisneyZoo = new Zoo(2);
		
		//New Animal array to test getAnimals method
		Animal[] DisneyAnimals = DisneyZoo.getAnimals();
		
		//Add animal and getter tests for a single animal in the zoo
		DisneyZoo.addAnimal(Gorilla);
		DisneyAnimals[0] = Gorilla;

		Assert.assertEquals(74.18, DisneyZoo.getTotalHeight());
		Assert.assertEquals(649, DisneyZoo.getAverageWeight());
		Assert.assertEquals(0, DisneyZoo.getAverageWeight("Pink"));
		Assert.assertEquals(DisneyAnimals, DisneyZoo.getAnimals());
		Assert.assertEquals(2, DisneyZoo.getCapacity());
		Assert.assertEquals("These animals live in the zoo: \n" + Gorilla.toString(), DisneyZoo.toString());
		
		//Add two animals to the zoo to test the add animal/expand zoo methods
		DisneyZoo.addAnimal(Lion);
		DisneyZoo.addAnimal(Dragon);
		
		//Expanded zoo requires new Animal array
		DisneyAnimals = DisneyZoo.getAnimals();
		DisneyAnimals[0] = Gorilla;
		DisneyAnimals[1] = Lion;
		DisneyAnimals[2] = Dragon;
		
		//Retest getters with multiple animals in the zoo
		double totalZooHeight = Gorilla.getHeight() + Lion.getHeight() + Dragon.getHeight();
		Assert.assertEquals(totalZooHeight, DisneyZoo.getTotalHeight());
		
		double averageZooWeight = (Gorilla.getWeight() + Lion.getWeight() + Dragon.getWeight()) / 3.0;
		Assert.assertEquals((int)averageZooWeight, DisneyZoo.getAverageWeight());
		
		Assert.assertEquals(649, DisneyZoo.getAverageWeight("Black"));
		Assert.assertEquals(539, DisneyZoo.getAverageWeight("Blonde"));
		Assert.assertEquals(37, DisneyZoo.getAverageWeight("Red"));
		Assert.assertEquals(0, DisneyZoo.getAverageWeight("Pink"));
		//Assert.assertEquals(DisneyAnimals, DisneyZoo.getAnimals());
		Assert.assertEquals(4, DisneyZoo.getCapacity());
		Assert.assertEquals("These animals live in the zoo: \n" + Gorilla.toString() + Lion.toString() + Dragon.toString(), DisneyZoo.toString()); //Might need more work
	}
}