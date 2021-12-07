
public class StringEx {

	public static void main(String[] args) {

		String name = "fisglobal";// imuttable
		String name1 = "fasglobal";
		name.concat(" india");
		System.out.println(name);
		System.out.println(name.equals(name1));// true will check values
		System.out.println(name == name1);// true well check reference
		System.out.println(name.compareTo(name1));// 0 difference in between the string
		// return + if obj1 has to come after obj2
		// return - if obj1 has to come before obj2
		// return 0

		StringBuilder sb = new StringBuilder("fisglobal");

		StringBuilder sb1 = new StringBuilder("fisglobal");
		
		sb.append("india");
		
		System.out.println(sb);
		
		System.out.println(sb.equals(sb1));// true ==
		System.out.println(sb == sb1);// false

	}

}
