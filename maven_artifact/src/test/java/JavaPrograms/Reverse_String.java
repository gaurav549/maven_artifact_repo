package JavaPrograms;

public class Reverse_String {
	
	public static void main (String args[])
	{
		
		String str1 = "GAURAV";
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb= sb.reverse();
		System.out.println(sb);
	}

}
