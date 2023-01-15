package PracticeTeam;

import java.util.ArrayList;

public class Abdul {

	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();

		city.add("Knoxville");
		city.add("Nashville");
		city.add("Ashville");
		city.add("New York City");
		city.add("Virginia");

		for (String str : city) { // Enhanced for loop
			System.out.println(str);
		}
		System.out.println("+++++++++++++++++++");
		for (int i = 0; i < city.size(); i++) { // regular for loop
			System.out.println(city);
		}
		System.out.println("+++++++++++++++++++");
		int j = 0; // while loop
		while (j < city.size()) {
			System.out.println(city.get(j));

		}
		System.out.println("+++++++++++++++++++");

		int k = 0; // do- while loop
		do {
			System.out.println(city.get(k));
			k++;
		} while (k < city.size());
	}
}
