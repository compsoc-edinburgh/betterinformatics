import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Beads {
	public static Set<Integer> sums(ArrayList<Integer> beads, int toSum) {
		if (beads.size() == 0 || toSum == 0) {
//			System.out.println("Empty list");
			return new HashSet<Integer>();
		}
		
		HashSet<Integer> nums = new HashSet<Integer>();
		
		ArrayList<Integer> line = new ArrayList<>(beads);
		
		while (line.size() < (beads.size() + toSum)) {
			line.addAll(beads);
		}
		
		for (int start = 0; start < beads.size(); start++) {
			int end = start + toSum;
			
			int sum = 0;
//			System.out.print("(");
			for (int i = start; i < end; i++) {
//				System.out.printf("%d,", line.get(i));
				sum += line.get(i);
			}
//			System.out.printf(")+");
			nums.add(sum);
		}
//		System.out.println();
		
		return nums;
	}
	
	public static Set<Integer> allSums(ArrayList<Integer> beads) {
		if (beads.size() == 0) {
			System.out.println("Empty list");
			return new HashSet<>();
		}

		HashSet<Integer> nums = new HashSet<>();
		for (int i = 1; i <= beads.size(); i++) {
			nums.addAll(sums(beads, i));
		}
		
		return nums;
	}
	
	public static int findMax(Set<Integer> ints) {
		int maximum = 0;
		
		for (int n : ints) {
			if (maximum > n) {
				continue;
			}
			
			boolean success = true;
			for (int i = 1; i <= n; i++) {
				if (!ints.contains(i)) {
					success = false;
				}
			}
			
			if (success) {
				maximum = n;
			}
		}
		
		return maximum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		for (String s: args) {
			nums.add(Integer.parseInt(s));
		}
		
		System.out.println(findMax(allSums(nums)));
	}
}
