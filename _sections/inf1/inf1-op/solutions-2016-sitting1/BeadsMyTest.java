import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class BeadsMyTest {

	@Test
	public void testSums_a_1() {
		System.out.println("2(a) (1/4)\n--");
		

		ArrayList<Integer> arg = new ArrayList<>(Arrays.asList(1,2,3,4));
		Set<Integer> s = Beads.sums(arg, 2);

		List<Integer> expected = Arrays.asList(3,5,7);
		
		assertTrue(s.containsAll(expected));
		assertEquals(expected.size(), s.size());
		
		System.out.println();
	}
	
	@Test
	public void testSums_a_2() {
		System.out.println("2(a) (2/4)\n--");
		

		ArrayList<Integer> arg = new ArrayList<>(Arrays.asList(1,1,1));
		Set<Integer> s = Beads.sums(arg, 4);

		List<Integer> expected = Arrays.asList(4);
		
		assertTrue(s.containsAll(expected));
		assertEquals(expected.size(), s.size());
		
		System.out.println();
	}
	
	@Test
	public void testSums_a_3() {
		System.out.println("2(a) (3/4)\n--");
		

		ArrayList<Integer> arg = new ArrayList<>(Arrays.asList(6,1,3));
		Set<Integer> s = Beads.sums(arg, 1);

		List<Integer> expected = Arrays.asList(6,1,3);
		
		assertTrue(s.containsAll(expected));
		assertEquals(expected.size(), s.size());
		
		System.out.println();
	}
	
	@Test
	public void testSums_a_4() {
		System.out.println("2(a) (4/4)\n--");
		

		ArrayList<Integer> arg = new ArrayList<>(Arrays.asList(6,1,3));
		Set<Integer> s = Beads.sums(arg, 0);

		List<Integer> expected = Arrays.asList();
		
		assertTrue(s.containsAll(expected));
		assertEquals(expected.size(), s.size());
		
		System.out.println();
	}

	//////////////
	
	@Test
	public void testSums_b_1() {
		System.out.println("2(b) (1/3)\n--");
		

		ArrayList<Integer> arg = new ArrayList<>(Arrays.asList(1,2,3,4));
		Set<Integer> s = Beads.allSums(arg);

		List<Integer> expected = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		assertTrue(s.containsAll(expected));
		assertEquals(expected.size(), s.size());
		
		System.out.println();
	}
	@Test
	public void testSums_b_2() {
		System.out.println("2(b) (2/3)\n--");
		

		ArrayList<Integer> arg = new ArrayList<>(Arrays.asList(1,1,1));
		Set<Integer> s = Beads.allSums(arg);

		List<Integer> expected = Arrays.asList(1,2,3);
		
		assertTrue(s.containsAll(expected));
		assertEquals(expected.size(), s.size());
		
		System.out.println();
	}
	@Test
	public void testSums_b_3() {
		System.out.println("2(b) (3/3)\n--");
		

		ArrayList<Integer> arg = new ArrayList<>(Arrays.asList(6,1,3));
		Set<Integer> s = Beads.allSums(arg);

		List<Integer> expected = Arrays.asList(1,3,4,6,7,9,10);
		
		assertTrue(s.containsAll(expected));
		assertEquals(expected.size(), s.size());
		
		System.out.println();
	}
	///////////////

	@Test
	public void testSums_c_1() {
		System.out.println("2(c) (1/3)\n--");
		

		Set<Integer> arg = new HashSet<>(Arrays.asList(1,2,4));
		int s = Beads.findMax(arg);

		assertEquals(2, s);
		
		System.out.println();
	}
	@Test
	public void testSums_c_2() {
		System.out.println("2(c) (2/3)\n--");
		

		Set<Integer> arg = new HashSet<>(Arrays.asList(6));
		int s = Beads.findMax(arg);

		assertEquals(0, s);
		
		System.out.println();
	}

	@Test
	public void testSums_c_3() {
		System.out.println("2(c) (3/3)\n--");
		

		Set<Integer> arg = new HashSet<>(Arrays.asList(1,3,4,6,7,9,10));
		int s = Beads.findMax(arg);

		assertEquals(1, s);
		
		System.out.println();
	}
	
}
