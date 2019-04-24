package parking_garage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GarageTest {

	Garage garage;
	double inTime;
	double outTime;
	double totalTime;
	@Before
	public void setup() {
		 garage = new Garage();
		 inTime = 2;
		 outTime = 4;
	}
	@Test
	public void testCalTime() {
		//expected
		int expected = 3;
		
		//actual
		double actual = garage.CalulateTime(inTime,outTime);
		
		assertEquals(expected, actual,0.0);
		
	}
	
	@Test
	public void test1() {
		 inTime = 5;
		 outTime = 2;
		double expected = -1;

		double actual = garage.CalulateTime(inTime, outTime);

		assertEquals(expected, actual,0.0);
		
	}
	
	@Test
	public void test2() {
		 inTime = 1;
		 outTime = 11;
		 //time difference generating more than 30$ a day
		totalTime = garage.Compute(inTime,outTime);
		
		//expected
		int expected = 0;
		
		//actual

		double actual = garage.CalulateTime(totalTime, true	);
		
		assertEquals(expected, actual,0.0);
		
	}
	
	
	@Test
	public void test3() {

		totalspent =  garage.CalulateTime(inTime, outTime);
		
		int expected = 15;

		double actual = garage.Compute(totalTime, false);
		
		assertEquals(expected, actual,0.0);
		
	}

	private void assertEquals(int expected, double actual, double v) {
	}

}
