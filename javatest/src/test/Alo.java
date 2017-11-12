package test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.IOException;

public class Alo {

	public static void main(String[] args) {
		Path tmp = Paths.get(".");
		System.out.format("> %s%n", tmp.toAbsolutePath());
	
		Path p = Paths.get("text_files\\test.txt");
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
