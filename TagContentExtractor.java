import java.util.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String restricoes = null;
		if (testCases <= 1 && testCases > 100) {
			restricoes = "N está fora da faixa";		
		}
		System.out.println();
		int totalCaracteres = 0;
		while(testCases > 0){
			String line = in.nextLine();
			totalCaracteres += line.length();
			if (line.length() > Math.pow(10, 4)) {
				restricoes += "A quantidade de caracteres do caso " + testCases + " excedeu o limite de 10^4.";		
			}
			Pattern pattern = Pattern.compile("([<]{1}[ |a-zA-Z|0-9]*[>])([ 0-9a-zA-Z]*)([<]{1}[\\\\/][ |a-zA-Z|0-9]*[>])");
		    Matcher matcher = pattern.matcher(line);
		    while (matcher.find()) {
		        if (matcher.group(3).replaceAll("</([ |a-zA-Z|0-9]+)>", "<$1>").equals(matcher.group(1))) {
		        	System.out.println(matcher.group(2));
		        } else {
		        	System.out.println("None");
		        }
		    }
			testCases--;
		}
		if (totalCaracteres > Math.pow(10, 6)) {
			restricoes += "A quantidade total de caracteres nos casos excedeu o limite de 10^6.";		
		}
		System.out.println("\nRestrições: " + restricoes);
		in.close();
	}
}
