package gyakorlas;

public class Kolcsonzes {

	private String nev;
	private char jarmuAzonosito;
	private int takeHour;
	private int takeMinute;
	private int comeHour;
	private int comeMinute;
	
	public Kolcsonzes(String nev, char jarmuAzonosito, int takeHour, int takeMinute, int comeHour, int comeMinute) {
		super();
		this.nev = nev;
		this.jarmuAzonosito = jarmuAzonosito;
		this.takeHour = takeHour;
		this.takeMinute = takeMinute;
		this.comeHour = comeHour;
		this.comeMinute = comeMinute;
	}
	
	

	public char getJarmuAzonosito() {
		return jarmuAzonosito;
	}

	public void setJarmuAzonosito(char jarmuAzonosito) {
		this.jarmuAzonosito = jarmuAzonosito;
	}

	public int getTakeHour() {
		return takeHour;
	}

	public void setTakeHour(int takeHour) {
		this.takeHour = takeHour;
	}

	public int getTakeMinute() {
		return takeMinute;
	}

	public void setTakeMinute(int takeMinute) {
		this.takeMinute = takeMinute;
	}

	public int getComeHour() {
		return comeHour;
	}

	public void setComeHour(int comeHour) {
		this.comeHour = comeHour;
	}

	public int getComeMinute() {
		return comeMinute;
	}

	public void setComeMinute(int comeMinute) {
		this.comeMinute = comeMinute;
	}

	public String getNev() {
		return nev;
	}
	
	
	
	
}
