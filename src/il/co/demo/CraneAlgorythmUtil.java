package il.co.demo;

import java.util.Scanner;

public class CraneAlgorythmUtil {
	
	private int a;
	private String d;

	private Scanner scn = new Scanner(System.in);
	// input digit method
		public int inputDigit() {
			while (true) {
				if (scn.hasNextInt()) {
					d = scn.next();
					a = Integer.parseInt(d);
					break;
				} else {
					System.out.println("ERROR INPUT!" + "\n" + "Input a digit again please!");
					d = scn.nextLine();
					d = scn.next();
				}
			}
			return a;
		}
		
		// Java recursive function
		static void craneAlgorythm(int n, char from_rod, char to_rod, char aux_rod)
	    {
	        if (n == 1)
	        {
	            System.out.println("#1 slot_" +  from_rod + " -> slot_" + to_rod);
	            return;
	        }
	        craneAlgorythm(n-1, from_rod, aux_rod, to_rod);
	        System.out.println("#" + n + " slot_" +  from_rod + " -> slot_" + to_rod);
	        craneAlgorythm(n-1, aux_rod, to_rod, from_rod);
	    }
				
}
