package IO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ABMfile {
	public static void main(String[] args) {
		
		Path path = Paths.get("C:\\temp\\newFile.txt");
		create(path);
		delete(path);
		create(path);
		move(path);
	}
	
	public static void create(Path path){
		try {
			if(!Files.exists(path)){
				Files.createFile(path);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void delete(Path path){
		try {
			Files.delete(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void move(Path path){
		try {
			Files.move(path,Paths.get("C:\\temp\\newNewFile.txt" ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
