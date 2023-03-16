package aula_02;

public class Cadeias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Generation Br";
		String s2 = "GENERATION BR";
		String s3 = "Generation Br";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(7, 10));
		System.out.println(s1.contains("Generation"));

	}

}
