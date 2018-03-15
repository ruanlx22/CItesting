package calc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CaculatorTest {
	private static CalculatorMain calc;
	
	@BeforeClass
	public static void setup(){
		calc = new CalculatorMain();
	}
	
	@Test
	public void testAdd() {
		assertEquals(5, calc.add(3,2));
	}
	@Test
	public void testAdd1() {
		assertEquals(1, calc.add(0,1));
	}
	@Test
	public void testSub() {
		assertEquals(1, calc.sub(3,2));
	}
	@Test
	public void testMul() {
		assertEquals(6, calc.mul(3,2));
	}
	@Test
	public void testDiv() {
		assertEquals(1, calc.div(2,2));
	}
	@Test
	public void testDivByZero() {
		assertEquals(0, calc.div(3,0));
	}
	@Test
	public void testPresedence() {
		assertEquals(30, calc.add(calc.mul(5, 5), calc.div(10, 2)));
	}
	@Test
	public void testPresedence1() {
		assertEquals(30, calc.add(calc.mul(5, calc.sub(10, 5)), calc.div(10, 2)));
	}
	@Test
	public void testAbsoluteValue() {
		assertEquals(30, calc.abs(-30));
	}
	@Test
	public void testPower() {
		assertEquals(8,calc.power(2, 3));
	}
	@Test
	public void testPowerByZero() {
		assertEquals(1,calc.power(2, 0));
	}
	@Test
	public void testPowerByMinus() {
		assertEquals(0,calc.power(2, -1));
	}
	@Test
	public void testSquare() {
		assertEquals(9, calc.square(3));
	}
	@Test
	public void testIntegration( ) {
		assertEquals(-2,calc.add(calc.sub(calc.abs(-5), 2),-5));
	}
	@Test
	public void testIntegration1() {
		assertEquals(1, calc.power(calc.sub(calc.div(10, 2), calc.square(2)), 3));//((10/2)-2^2)^3=1
	}
}
