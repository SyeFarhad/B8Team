package PracticeTeam;

import java.util.ArrayList;
import java.util.List;

public class PracticeB8 {
	public static void main(String[] args) {
		
		

		int age = 44;
		if (age == 45) {
			System.out.println("true");
		}else {
			System.out.println("false");
			
		}
		System.out.println("************************************");
			String[] names = {"Abdul", "Farid", "Ebad", "Farhad", "Milad", "Nargis" , "Reyahana","Lesly"};
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
			if ( time < 8)
			System.out.println (" give me double coffee + redbul") ;
			else
			System.out. println(" work to exit ticket") ;
	}
}
