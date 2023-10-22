package playlist;

import java.util.Scanner;

import javax.swing.text.JTextComponent.KeyBinding;

public class Canzone {

	private String titolo;
	private String cantante;
	private int durata;
	
	public Canzone() {
		titolo="";
		cantante="";
		durata=0;
	}
	
	/**
	 * @param titolo
	 * @param cantante
	 * @param durata
	 */
	public Canzone(String titolo, String cantante, int durata) {
		this.titolo = titolo;
		this.cantante = cantante;
		this.durata = durata;
	}

	/**
	 * @return the titolo
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * @param titolo the titolo to set
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * @return the cantante
	 */
	public String getCantante() {
		return cantante;
	}

	/**
	 * @param cantante the cantante to set
	 */
	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	/**
	 * @return the durata
	 */
	public int getDurata() {
		return durata;
	}

	/**
	 * @param durata the durata to set
	 */
	
	public void setDurata(int durata) {
		if(durata<=600) {
			this.durata = durata;
		}
		else {
			this.durata = 0;
		}
	}
	
	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		String titolo;
		String cantante;
		int durata;
		
		System.out.println("Inserisci il titolo della canzone");
		titolo=KB.nextLine();
		setTitolo(titolo);
		
		System.out.println("Inserisci il cantante della canzone");
		cantante=KB.nextLine();
		setCantante(cantante);
		
		do {
			System.out.println("Inserisci la durata della canzone");
			durata=KB.nextInt();
		}while(durata<=0 || durata>600);
		setDurata(durata);

	}
	
	public String toString() {
		return "titolo=" + getTitolo() + ", cantante=" + getCantante() + ", durata=" + getDurata();
	}
	
	

	
	
	
	
}
