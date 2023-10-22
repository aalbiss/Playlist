package playlist;

import java.util.Scanner;


public class Playlist {

	private int dim;
	private int nCanzoniInserite;
	private Canzone playlist[];

	public Playlist() {
		dim = 0;
		nCanzoniInserite=0;
		playlist = new Canzone[dim];
	}

	/**
	 * @param dIM
	 */
	public Playlist(int dim) {
		this.dim = dim;
		nCanzoniInserite=0;
		playlist = new Canzone[dim];
	}

	public void inserimento() {
		if(nCanzoniInserite<dim) { 
			System.out.print("Inserire canzone " + (nCanzoniInserite + 1) + ": ");
			System.out.println();

			Canzone c = new Canzone();
			c.inserimento(); 

			playlist[nCanzoniInserite] = c;
			nCanzoniInserite++;
		}else {
			System.out.println("La playlist è piena");
		}
	}

	public void visualizza() {
		if(nCanzoniInserite>0) {
			for(int i=0; i<nCanzoniInserite; i++) {
				System.out.println("Canzone " + (i+1) + ": " + playlist[i]);
			}
		}
		else {
			System.out.println("La playlist è vuota");
		}
	}

	public void casuale() {
		if(nCanzoniInserite>0) {
			int max=nCanzoniInserite-1;
			int min=0;
			int x = (int) (Math.random() * ((max-min)+1)+min);
			System.out.println("Canzone " + (x+1) + ": " + playlist[x]);
		}
		else {
			System.out.println("La playlist � vuota");
		}
	}

	public void cercaCanzone() {
		Scanner KB = new Scanner(System.in);
		
		boolean presente=false;
		System.out.println("Inserire il titolo della canzone da visualizzare");
		String titolo = KB.nextLine();
		for(int i=0; i<nCanzoniInserite; i++) {
			if(playlist[i].getTitolo().contains(titolo)) {
				System.out.println(playlist[i]);
				presente = true;
				break;
			}
		}

		if(!presente)
			System.out.println("Canzone non presente");

	}

	public void cercaCantante() {
		Scanner KB = new Scanner(System.in);
		boolean presente=false;
		System.out.println("Inserire il cantante per vedere la sua canzone");
		String cantante = KB.nextLine();
		for(int i=0; i<nCanzoniInserite; i++) {
			if(playlist[i].getCantante().contains(cantante)) {
				System.out.println(playlist[i]);
				presente = true;
				break;
			}
		}

		if(!presente)
			System.out.println("Canzone non presente");
	}

	public void eliminazione() {
		if(nCanzoniInserite>0) {
			System.out.println("è stata cancellata la canzone: " + playlist[nCanzoniInserite-1]);
			playlist[nCanzoniInserite-1]=null;
			nCanzoniInserite--;
		}
		else {
			System.out.println("Non ci sono più canzoni");
		}
	}







}
