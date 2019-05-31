package morse;

import java.util.Scanner;

public class Logic {
	
	public void translation() {
		String count="";
		boolean state=true;
		Scanner s=new Scanner(System.in);
		while(state==true) {
			String userInput=s.next();
			if (userInput.equals("stop")) {
				System.out.println(count);
				state=false;
				break;
			}
			else if (userInput.equals("/")) {
				count=count+" ";
			}
			else if (userInput.equals(".-")) {
				count=count+"A";
			}
			else if (userInput.equals("-...")) {
				count=count+"B";
			}
			else if (userInput.equals("-.-.")) {
				count=count+"C";
			}
			else if (userInput.equals("-..")) {
				count=count+"D";
			}
			else if (userInput.equals(".")) {
				count=count+"E";
			}
			else if (userInput.equals("..-.")) {
				count=count+"F";
			}
			else if (userInput.equals("--.")) {
				count=count+"G";
			}
			else if (userInput.equals("....")) {
				count=count+"H";
			}
			else if (userInput.equals("..")) {
				count=count+"I";
			}
			else if (userInput.equals(".---")) {
				count=count+"J";
			}
			else if (userInput.equals("-.-")) {
				count=count+"K";
			}
			else if (userInput.equals(".-..")) {
				count=count+"L";
			}
			else if (userInput.equals("--")) {
				count=count+"M";
			}
			else if (userInput.equals("-.")) {
				count=count+"N";
			}
			else if (userInput.equals("---")) {
				count=count+"O";
			}
			else if (userInput.equals(".--,")) {
				count=count+"P";
			}
			else if (userInput.equals("--.-")) {
				count=count+"Q";
			}
			else if (userInput.equals(".-.")) {
				count=count+"R";
			}
			else if (userInput.equals("...")) {
				count=count+"S";
			}
			else if (userInput.equals("-")) {
				count=count+"T";
			}
			else if (userInput.equals("..-")) {
				count=count+"U";
			}
			else if (userInput.equals("...-")) {
				count=count+"V";
			}
			else if (userInput.equals(".--")) {
				count=count+"W";
			}
			else if (userInput.equals("-..-")) {
				count=count+"X";
			}
			else if (userInput.equals("-.--")) {
				count=count+"Y";
			}
			else if (userInput.equals("--..")) {
				count=count+"Z";
			}
			else if (userInput.equals(".----")) {
				count=count+"1";
			}
			else if (userInput.equals("..---")) {
				count=count+"2";
			}
			else if (userInput.equals("...--")) {
				count=count+"3";
			}
			else if (userInput.equals("....-")) {
				count=count+"4";
			}
			else if (userInput.equals(".....")) {
				count=count+"5";
			}
			else if (userInput.equals("-....")) {
				count=count+"6";
			}
			else if (userInput.equals("--...")) {
				count=count+"7";
			}
			else if (userInput.equals("---..")) {
				count=count+"8";
			}
			else if (userInput.equals("----.")) {
				count=count+"9";
			}
			else if (userInput.equals("-----")) {
				count=count+"0";
			}
		}
	}
}
