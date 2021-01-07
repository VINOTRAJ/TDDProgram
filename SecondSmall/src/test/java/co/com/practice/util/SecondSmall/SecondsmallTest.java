package co.com.practice.util.SecondSmall;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SecondsmallTest {
	
	private Secondsmall secondsmallnum;
	
        @Before
        public void setup()
        {
        	secondsmallnum=new Secondsmall();
        }
        
	@Test
	public void getArrayof_integerElementsAsEmptyArray_Andreturn0asInteger() {
		
		int str[]= {};
		int arr=secondsmallnum.getSecondSmallest(str);
		assertEquals(0,arr);
	
	}
	
	@Test
	public void getArrayof_integerElementsAs1Array_Andreturn1asInteger() {
		
		int str[]= {1};
		int arr=secondsmallnum.getSecondSmallest(str);
		assertEquals(str[0],arr);
	}
		@Test
		public void getArrayof_integerElementsAs_morethan2Array_AndreturnSecondsmallestasInteger() {
			
			int str[]= {25,3};
			int arr=secondsmallnum.getSecondSmallest(str);
			assertEquals(25,arr);
		
		}


}
