package PracticeTeam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB8 {
	public static void main(String[] args) {
		
		

		int age = 44;
		if (age == 45) {
			System.out.println("true");
		}else {
			System.out.println("false");
			
		}
		System.out.println("************************************");
			String[] names = {"Abdul", "Farid", "Ebad", "Farhad", "Milad", "Nargis"};
			for (String name : names) {
				System.out.println(name.toUpperCase());
		}
		    System.out.println("*******************************************");
		List<String> str = new ArrayList<>();
		str.add("فرهاد");
		str.add("نرگس");
		str.add("عبدل");
		for (String name : str) {
		    System.out.println(name);
		
		    
		}
		
		
	}
}
