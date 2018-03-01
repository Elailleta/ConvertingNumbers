import java.util.Scanner;

public class SolvingConversions {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int base;
		int x;

		do{
			System.out.println("Let's convert numbers!");
			System.out.println("Choose a base to start with:");
			System.out.println("1. Decimal");
			System.out.println("2. Binary");
			System.out.println("3. Hex");
			System.out.println("4. Octal");
			base=in.nextInt();
		}while((base!=1)&&(base!=2)&&(base!=3)&&(base!=4));

		if (base==1){
			System.out.println("Please enter a decimal number:");
			try {
				x=in.nextInt();
				String y;
				y = Integer.toBinaryString(x);
				System.out.println("Your Binary number is: "+y);
				String z=Integer.toOctalString(x);
				System.out.println("Your Octal number is: "+z);
				String w=Integer.toHexString(x);
				System.out.println("Your Hex value is: "+w);
			} catch (java.util.InputMismatchException err) {
				System.out.println("That is an invalid response.");
			}

		}if (base==2){
			System.out.println("Please enter a binary number:");
			in.nextLine();
			String y;
			try {
				y = in.nextLine();
				x=Integer.parseInt(y, 2);
				System.out.println("Your Deciaml number is: "+x);
				String z=Integer.toOctalString(x);
				System.out.println("Your Octal number is: "+z);
				String w=Integer.toHexString(x);
				System.out.println("Your Hex value is: "+w);
			} catch (java.lang.NumberFormatException err){
				System.out.println("That is an invalid response.");
			}

		}if (base==3){
			System.out.println("Please enter a Hex value: ");
			in.nextLine();
			String y;
			try {
				y = in.nextLine();
				x=Integer.parseInt(y, 16);
				System.out.println("Your decimal number is: "+x);
				String z=Integer.toOctalString(x);
				System.out.println("Your Octal number is: "+z);
				String b=Integer.toBinaryString(x);
				System.out.println("Your Binary number is: "+b);
			} catch (java.lang.NumberFormatException err) {
				System.out.println("That is an invalid response.");
			}

		}if (base==4){
			System.out.println("Please enter an octal value: ");
			in.nextLine();
			String y;
			try {
				y = in.nextLine();
				x=Integer.parseInt(y, 8);
				System.out.println("Your decimal number is: "+x);
				String b=Integer.toBinaryString(x);
				System.out.println("Your Binary number is: "+b);
				String w=Integer.toHexString(x);
				System.out.println("Your Hex value is: "+w);
			} catch ( java.lang.NumberFormatException err) {
				System.out.println("That is an invalid response.");
			}
		}
	}
}
