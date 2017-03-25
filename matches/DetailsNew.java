package matches;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DetailsNew {
	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Elexie\\Desktop\\data\\matches\\all\\match_details_new.txt"));
		String line="";
		String newLine="";
		FileWriter fw=new FileWriter("C:\\Users\\Elexie\\Desktop\\data\\matches\\all\\noCommaNewDetails.txt");
		
		while ((line = br.readLine()) != null) {
			newLine=removeComma(line);
			fw.write(newLine);
		}
		
	}
	
	public static String removeComma(String line){
		line=line.trim().replaceAll(",","");
		
		return line.replace('|', ',');
	}
}
