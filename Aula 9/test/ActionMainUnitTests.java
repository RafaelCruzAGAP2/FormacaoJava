import org.junit.Assert;
import org.junit.Test;;

public class ActionMainUnitTests {
	
	@Test
	public void shouldTestActionActionManInstances(){
		Assert.assertEquals("String", "String");
		
		ActionMan actionMan = new ActionMan(1, "ActionMan", 50.0f, 3, "Comando");
		Assert.assertTrue(actionMan instanceof ActionMan);
		
		Toy actionManToy = new ActionMan(1, "ActionMan", 50.0f, 3, "Comando");
		Assert.assertTrue(actionManToy instanceof ActionMan);
		Assert.assertTrue(actionManToy instanceof Toy); //True por causa da heran�a. Qlq um das heran�as d� sempre true
		
		//Toy toy = new Toy(1, "ActionMan", 50.0f, 3);
		//Assert.assertTrue(toy instanceof ActionMan); //Um ActionMan � um Toy mas um Toy n�o � um actionMan
		//Assert.assertTrue(toy instanceof Toy);
		
		System.out.println(actionManToy);
	}

}
