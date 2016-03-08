package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReading {

	public static void main(String[] args) {
		System.out.println(getText());
		outPutPage(1);
	}
	
	private static String getText(){
		FileReader reader = null;
		String allText = "";
		try {
			reader = new FileReader("text.txt");
			BufferedReader bReader = new BufferedReader(reader);
			
			String line;
		
			while((line=bReader.readLine()) != null){
				allText +=line +"\n";
			}
			
			return allText;	
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
		
	}
	
	public static void outPutPage(int pageNumber){
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(new FileWriter("outPut.txt"));
			
			writer.println(pageNumber);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(writer != null){
				writer.close();
			}
		}
	}
}
