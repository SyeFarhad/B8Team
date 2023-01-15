package PracticeTeam;

import java.util.ArrayList;
import java.util.List;

public class PracticeB8 {
	public static void main(String[] args) {

		System.out.println("************************************");
		String[] names = { "Abdul", "Farid", "Ebad", "Farhad", "Milad", "Nargis", "Reyahana", "Lesly" };
		for (String name : names) {
			System.out.println(name.toUpperCase());
		}
		List<String> str = new ArrayList<>();
		str.add("فرهاد");
		str.add("فرید");
		str.add("نرگس");
		str.add("ریحانه");
		str.add("عبدل");
		for (String name : str) {
			System.out.println(name);
		}
		int time = 8;
		if (time < 8)
			System.out.println(" give me double coffee + redbul");
		else
			System.out.println(" work to exit ticket");

		int[] myArray = new int[] { 1, 2, 3, 4, 5 };
		myArray[0] = 42;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}

		System.out.println(" work to exit ticket");

	}
}
