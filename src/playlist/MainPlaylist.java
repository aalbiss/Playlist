package playlist;

import java.util.Scanner;

public class MainPlaylist {

	public static void main(String[] args) {
		
		Scanner KB = new Scanner(System.in);
		int dim;
		
		do {
			System.out.println("Inserire la dimensione della playlist");
			dim = KB.nextInt();
			KB.nextLine();
		}while(dim<0);

		Playlist pl =  new Playlist(dim);
		int selezione=0;
		do {
			Utility.selezioneGenerale();
			selezione = KB.nextInt();
			KB.nextLine();
			switch(selezione) {
				case 1:
					pl.inserimento();
					break;
				case 2:
					pl.visualizza();
					break;
				case 3:
					pl.casuale();
					break;
				case 4:
					pl.cercaCantante();
					break;
				case 5:
					pl.cercaCanzone();
					break;
				case 6:
					pl.eliminazione();
					break;
				case 9:
					System.out.println("Fine programma");
					break;
			}
		}while(selezione!=9);
		
		
	}

}
