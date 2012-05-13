package de.nooxi;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		float z1 = Float.valueOf(args[0]).floatValue();
		float z2 = Float.valueOf(args[1]).floatValue();
		
		if (args.length > 1) {
			float e = z1 + z2;
			System.out.println(e);
		}
		

	}

}
