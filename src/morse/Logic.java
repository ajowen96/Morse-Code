package morse;

import java.util.Scanner;

public class Logic {
	
	public void translation() {
		String count="";
		boolean state=true;
		Scanner s=new Scanner(System.in);
		while(state==true) {
			String userInput=s.next();
			if (userInput.equals(" / ")) {
				System.out.println(" ");
				count=count+" ";
			}
			if (userInput.equals(".----")) {
				System.out.println("1");
				count=count+"1";
			}
			if (userInput.equals("..---")) {
				System.out.println("2");
				count=count+"2";
			}
			if (userInput.equals("...--")) {
				System.out.println("3");
				count=count+"3";
			}
			if (userInput.equals("....-")) {
				System.out.println("4");
				count=count+"4";
			}
			if (userInput.equals(".....")) {
				System.out.println("5");
				count=count+"5";
			}
			if (userInput.equals("-....")) {
				System.out.println("6");
				count=count+"6";
			}
			if (userInput.equals("--...")) {
				System.out.println("7");
				count=count+"7";
			}
			if (userInput.equals("---..")) {
				System.out.println("8");
				count=count+"8";
			}
			if (userInput.equals("----.")) {
				System.out.println("9");
				count=count+"9";
			}
			if (userInput.equals("-----")) {
				System.out.println("0");
				count=count+"0";
			}
			
			
			if (userInput.equals(".-")) {
				System.out.println("A");
				count=count+"A";
			}
			else if (userInput.equals("-...")) {
				System.out.println("B");
				count=count+"B";
			}
			else if (userInput.equals("-.-.")) {
				System.out.println("C");
				count=count+"C";
			}
			else if (userInput.equals("-..")) {
				System.out.println("D");
				count=count+"D";
			}
			else if (userInput.equals(".")) {
				System.out.println("E");
				count=count+"E";
			}
			else if (userInput.equals("..-.")) {
				System.out.println("F");
				count=count+"F";
			}
			else if (userInput.equals("--.")) {
				System.out.println("G");
				count=count+"G";
			}
			else if (userInput.equals("....")) {
				System.out.println("H");
				count=count+"H";
			}
			else if (userInput.equals("..")) {
				System.out.println("I");
				count=count+"I";
			}
			else if (userInput.equals(".---")) {
				System.out.println("J");
				count=count+"J";
			}
			else if (userInput.equals("-.-")) {
				System.out.println("K");
				count=count+"K";
			}
			else if (userInput.equals(".-..")) {
				System.out.println("L");
				count=count+"L";
			}
			else if (userInput.equals("--")) {
				System.out.println("M");
				count=count+"M";
			}
			else if (userInput.equals("-.")) {
				System.out.println("N");
				count=count+"N";
			}
			else if (userInput.equals("---")) {
				System.out.println("O");
				count=count+"O";
			}
			else if (userInput.equals(".--,")) {
				System.out.println("P");
				count=count+"P";
			}
			else if (userInput.equals("--.-")) {
				System.out.println("Q");
				count=count+"Q";
			}
			else if (userInput.equals(".-.")) {
				System.out.println("R");
				count=count+"R";
			}
			else if (userInput.equals("...")) {
				System.out.println("S");
				count=count+"S";
			}
			else if (userInput.equals("-")) {
				System.out.println("T");
				count=count+"T";
			}
			else if (userInput.equals("..-")) {
				System.out.println("U");
				count=count+"U";
			}
			else if (userInput.equals("...-")) {
				System.out.println("V");
				count=count+"V";
			}
			else if (userInput.equals(".--")) {
				System.out.println("W");
				count=count+"W";
			}
			else if (userInput.equals("-..-")) {
				System.out.println("X");
				count=count+"X";
			}
			else if (userInput.equals("-.--")) {
				System.out.println("Y");
				count=count+"Y";
			}
			else if (userInput.equals("--..")) {
				System.out.println("Z");
				count=count+"Z";
			}
			else if (userInput.equals("stop")) {
				System.out.println(count);
				state=false;
				break;
			}
		}
	}
}
