package LearnFakeObjects;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.*;

public class TestCalculator {
	
//	CalService ser=new FakeCalservice();
	
	
	
//	Calculator c= new Calculator(mock);
	
	@Test
	public void test() {
		 CalService mock= Mockito.mock(CalService.class);
		 Calculator c= new Calculator(mock);
//		 int performadd=mock.performadd(10, 10);
		 
//		System.out.println(c.add(10,15));
//		assertEquals(20,performadd);
		 
//		 int add= c.add();
//		 System.out.println(add);
		 
		 when(mock.inputX()).thenReturn(10);
		 when(mock.inputY()).thenReturn(10);
		 
		 assertEquals(20,c.add());
		 
	}

}
