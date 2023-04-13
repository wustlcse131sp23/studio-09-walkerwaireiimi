package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many people?");
		int N = in.nextInt();
		
		Map <String, Integer> nameHeight = new HashMap <String, Integer>();
		
		for (int i =0; i < N; i++) {
			System.out.println("Name:");
			String name = in.next();
			
			System.out.println("Height:");
			int height = in.nextInt();
			
			nameHeight.put(name, height);
		}
		System.out.println("look up name:");
		String lookUp = in.next();
		while (lookUp.equals("quit")== false) {
		

		boolean init= false;
		for (String i : nameHeight.keySet()) {
			if (i.equals(lookUp)) {
				System.out.println("height=" + nameHeight.get(i));
				init = true;
			}
		}
		if (init == false) {
			System.out.println("not in set");
		}
		System.out.println("look up name:");
		lookUp = in.next();
		}

	}
}
