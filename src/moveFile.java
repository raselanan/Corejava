import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;

public class moveFile {

	public static void main(String[] args) {
		File fromFile = new File("C:\\Users\\raselanan\\slenium-workspace\\CoreJava\\test-output\\index.html");
		String NewFileName = "C:\\results\\index.html";//TSSAutoResult"+uniqueDate()+".html";		
		File toFile = new File(NewFileName);
		System.out.println(NewFileName);
		//File toFile = new File("C:\\Users\\raselanan\\slenium-workspace\\CoreJava\\test-output\\index2.html");
		
		try {
			FileUtils.copyFileToDirectory(fromFile, toFile);//.copyDirectory(fromFile, toFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		try {
			Files.copy(fromFile, toFile, StandardCopyOption.REPLACE_EXISTING);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if (fromFile.renameTo(toFile)) {
			System.out.println("Successful");
			
		} else {
			System.out.println("Not Successful");

		}
*/
	}
	
	public static String uniqueDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY_MM_DD_MM_SS");
		LocalDateTime now = LocalDateTime.now();
		String uniqueDate = dtf.format(now);
		return uniqueDate;
	}

}
