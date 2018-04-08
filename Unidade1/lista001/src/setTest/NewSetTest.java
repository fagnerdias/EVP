package setTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import set.NewSet;

class NewSetTest {

	@SuppressWarnings("deprecation")
	@Test
	public void newInsertTest() {
		
		NewSet test = new NewSet();
		int[] result = new int[1];
		result[0] = 3;
		test.insert(3);
		Assert.assertEquals(true, java.util.Arrays.equals(result, test.toArray()));
		
		test.insert(3);
		Assert.assertEquals(true, java.util.Arrays.equals(result, test.toArray()));
		
		test.insert(2);
		int[] result2 = {2,3};
		Assert.assertEquals(true, java.util.Arrays.equals(result2, test.toArray()));
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void memberTest() {
		NewSet test = new NewSet();
		test.insert(2);
		test.insert(4);
		test.insert(3);
		test.insert(10);
		test.insert(21);
		
		Assert.assertEquals(true, test.member(3));
		
		Assert.assertEquals(true, test.member(10));
		
		Assert.assertEquals(false, test.member(22));
		
		Assert.assertEquals(false, test.member(1));
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void sectionTest() {
		NewSet test = new NewSet();
		NewSet del = new NewSet();
		test.insert(2);
		test.insert(4);
		test.insert(3);
		test.insert(10);
		test.insert(21);
		
		del.insert(10);
		del.insert(3);
		del.insert(30);
		del.insert(1);
		test.section(del);
		int[] result = {2,4,21};
		Assert.assertEquals(true, java.util.Arrays.equals(result, test.toArray()));
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void contemArithTripleTest() {
		NewSet test = new NewSet();
		test.insert(2);
		test.insert(4);
		test.insert(6);
		test.insert(10);
		Assert.assertEquals(true, test.containsArithTriple());
		NewSet test2 = new NewSet();
		test2.insert(3);
		test2.insert(2);
		Assert.assertEquals(true, test2.containsArithTriple());
		NewSet test3 = new NewSet();
		test3.insert(1);
		Assert.assertEquals(false, test3.containsArithTriple()); 
	}
	/*
*/	

}
