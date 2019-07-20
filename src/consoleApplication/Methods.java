package consoleApplication;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Methods {
	public static final String DATE_FORMAT = "dd.MM.yyyy.";

	public static String enterString(String message) {
		String s;
		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.println(message);
			s = s1.next();
			if (s.trim().length() == 0) {
				System.out.println("Required field");
				continue;
			}
			return s;
		}

	}

	public static int enterInteger(String message) {
		int i;
		while (true) {
			try {
				Scanner s2 = new Scanner(System.in);
				System.out.println(message);
				i = s2.nextInt();
				if (i <= 0) {
					System.out.println("Number needs to be bigger then zero.");
					continue;
				}
				return i;
			} catch (Exception e) {
				System.out.println("Input of number is required.");

			}
		}

	}

	public static Date enterDate(String message) {
		SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT);
		int data;
		while(true) {
		try {
			Scanner s3=new Scanner(System.in);
			data=s3.nextInt();
			return df.parse(message);
			
			
		}catch(Exception e){
			System.out.println(
						"Input must be in format: " + DATE_FORMAT 
						+ "\nExample of todays date:" + df.format(new Date()));
		}
		
	}
	}
}
