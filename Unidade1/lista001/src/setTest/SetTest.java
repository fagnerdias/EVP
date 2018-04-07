package setTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import set.Set;

class SetTest {

	
	@SuppressWarnings("deprecation")
	@Test
	public void insertTest() {
		
		Set test = new Set();
		int[] result = new int[1];
		result[0] = 3;
		test.insert(3);
		System.out.println("resultado " + result[0] + " test "+ test.toArray()[0] );
		Assert.assertEquals(true, java.util.Arrays.equals(result, test.toArray()));
		System.out.println("Sucess at first");
		test.insert(3);
		Assert.assertEquals(true, java.util.Arrays.equals(result, test.toArray()));
		System.out.println("Sucess at second");
		test.insert(2);
		int[] result2 = {2,3};
		Assert.assertEquals(true, java.util.Arrays.equals(result2, test.toArray()));
		
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void memberTest() {
		Set test = new Set();
		test.insert(2);
		test.insert(4);
		test.insert(3);
		test.insert(10);
		test.insert(21);
		System.out.println("teste do membro");
		
		Assert.assertEquals(true, test.member(3));
		
		Assert.assertEquals(true, test.member(10));
		
		Assert.assertEquals(false, test.member(22));
		
		Assert.assertEquals(false, test.member(1));
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void sectionTest() {
		Set test = new Set();
		Set del = new Set();
		test.insert(2);
		test.insert(4);
		test.insert(3);
		test.insert(10);
		test.insert(21);
		System.out.println("teste do section");
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
	public void contemArithTriple() {
		Set test = new Set();
		test.insert(2);
		test.insert(4);
		test.insert(6);
		test.insert(10);
		Assert.assertEquals(true, test.containsArithTriple());
	}
		
	

}
