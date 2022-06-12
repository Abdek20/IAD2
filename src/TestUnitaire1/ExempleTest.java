package TestUnitaire1;

import junit.framework.TestCase;

public class ExempleTest extends TestCase{

	public void testCalculer()throws Exception {
		Exemple mc =new Exemple(0,0);
		assertEquals(0,mc.calculer());
		
	}

}
