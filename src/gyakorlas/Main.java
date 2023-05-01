package gyakorlas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
static FajlKezeles f = new FajlKezeles();
	public static void main(String[] args) {
		
		f.lineNumberWriteToConsole();
		new Main().run();
	}
	
	
	private void run() {
		getDataByName();
	}
	
	
	private void getDataByName() {
		String userName = "";
		
		int countUser=0;
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("Név?: ");
			userName=br.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<Kolcsonzes> lista = f.readFile();
		for(Kolcsonzes item:lista) {
			if(item.getNev().equalsIgnoreCase(userName)) {
				System.out.print("Az adott user ekkor bérelte: "+item.getTakeHour()+":"+((item.getTakeMinute()<10)?"0"+item.getTakeMinute():item.getTakeMinute()));
				System.out.print(" eddig "+item.getComeHour()+":");
				System.out.print((item.getComeMinute()<10)?"0"+item.getComeMinute():item.getComeMinute());
				countUser++;
			}
		}
		if(countUser<1) {
			System.out.println("Nem volt ilyen nevû kölcsönzõ");
		}
	}

}
