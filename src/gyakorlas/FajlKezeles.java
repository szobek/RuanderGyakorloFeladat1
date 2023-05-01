package gyakorlas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;



public class FajlKezeles {
	static String fileName = "kolcsonzesek.txt";
	static String delimiter = ";";
	public List<Kolcsonzes> readFile() {
		
		List<Kolcsonzes> lista = new ArrayList<Kolcsonzes>();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF-8"))) {
			String str;
			br.readLine();
		      while ((str = br.readLine()) != null) {
		          String[] line = str.split(delimiter);
		          lista.add(new Kolcsonzes(line[0], line[1].charAt(0), Integer.parseInt( line[2]), Integer.parseInt( line[3]), Integer.parseInt( line[4]), Integer.parseInt( line[5])));
		      }	
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return lista;
				
		
		
	}
	
		
	private int countLineNumberReader(String fileName) {

	      File file = new File(fileName);

	      int lines = 0;

	      try (LineNumberReader lnr = new LineNumberReader(new FileReader(file))) {

	          while (lnr.readLine() != null) ;

	          lines = lnr.getLineNumber();

	      } catch (IOException e) {
	          e.printStackTrace();
	      }

	      return lines;

	  }
	
	public void lineNumberWriteToConsole() {
		System.out.println("Az adatok száma: "+(countLineNumberReader(fileName)-1));
	}
	

}
