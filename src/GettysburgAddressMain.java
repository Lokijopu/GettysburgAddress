/**
 * 
 * @author Kevin Guo Period 6 
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GettysburgAddressMain {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		ArrayList<String> words = new ArrayList<String>();
		int result = 0;
		int numWords = 0;
		while (file.hasNext()) {
			String word = file.next();
			words.add(word);
		}
		String longWord = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			result += words.get(i).length();
			numWords++;
		}
		
		for (int i = 1; i < words.size() - 1; i++) {
			if  (words.get(i).length() > longWord.length()) 
				longWord = words.get(i);
		}
		
		System.out.println((double) result / numWords);
		System.out.println(longWord);
		

	}

}
