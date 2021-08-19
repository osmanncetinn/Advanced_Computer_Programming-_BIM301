package tr.edu.halic.work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FileProject {

	public static void main(String[] args) throws IOException {

		ArrayList<String> lineList = null;
		FileInputStream in = null;
		BufferedReader input = null;
		File file = null;
		String line = null;
		String filePath = "C:\\Users\\HÝLAL\\Desktop\\File\\homework.txt";
		int count = 0;

		 try {

			while (true) {
				in = new FileInputStream(file);
				input = new BufferedReader(new InputStreamReader(in));
				lineList = new ArrayList<String>();
				line = input.readLine();
				while (line != null) {
					lineList.add(line);
				}
				
				if(lineList.size() != 0) {	
						for(int i = 0; i < lineList.size() - 1;i++)
					    {    
					        if(lineList.get(i).substring(i,i+1).equalsIgnoreCase(Words.TEKNOLOJI.getWord())) {
					            count++;
					    }
					    
							
						}
						
						System.out.println(Words.TEKNOLOJI.getWord() + ":" + count + "adet");
					}
				

					}
				}
			
		 finally {
			if (input != null) {
				input.close();
			}
		}

	}

	private static void print(String[] LineList) {

		for (int i = 0; i < LineList.length; i++)
			System.out.println(LineList[i]);

	}
	
	private static void display(Collection<String> L1) {
		for (String x : L1)
			System.out.println(x);
	}


}
