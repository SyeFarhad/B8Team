package PracticeTeam;

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
		List<String> names = new ArrayList<>();
		names.add("فرهاد");
		names.add("فرید");
		names.add("نرگس");
		for (String name : names) {
		    System.out.println(name);
		}
	}
}
