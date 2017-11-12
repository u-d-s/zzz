package test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.IOException;

public class Alo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Path p = Paths.get("C:\\Users\\utaka\\eclipse-workspace\\javatest\\text_files\\test.txt");
		System.out.format(";->  %s%n", p.toString());
		
		Charset charset = Charset.forName("UTF-8");
		try (BufferedReader reader = Files.newBufferedReader(p, charset)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
			System.out.format(";->  %s%n",line);
		    }
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

	}

}
