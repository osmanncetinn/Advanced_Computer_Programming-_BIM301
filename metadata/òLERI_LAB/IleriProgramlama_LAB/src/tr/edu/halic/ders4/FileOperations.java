package tr.edu.halic.ders4;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FileOperations {

	public static void main(String[] args) throws IOException {

		ArrayList<String> list = new ArrayList<String>();
		FileInputStream in = null;
		BufferedReader input = null;
		File file  = null;
		String filePath = "C:\\Users\\HÝLAL\\Desktop\\File\\names.txt";
		String line;

		try {
			in = new FileInputStream(file);
			input = new BufferedReader(new InputStreamReader(in));
			line = input.readLine();

			while (line != null) {
				list.add(line);
			}
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		display(list);
		sortNames(list);
		System.out.println();
		display(list);
		System.out.println(searchNames(list));

	}

	private static void display(Collection<String> L1) {
		for (String x : L1)
			System.out.println(x);
	}

	private static void sortNames(List<String> L2) {
		Collections.sort(L2);

	}

	private static int searchNames(List<String> L3) {
		return Collections.binarySearch(L3, "Hilal Diler");
	}

}
