package no.hvl.data102.klient;

import no.hvl.dat102.*;
import no.hvl.dat102.adt.FilmarkivADT;

public class Meny {
	private Tekstgrensesnitt tekstgr;  
	private FilmarkivADT filmarkiv;  
	  
	 public Meny(FilmarkivADT filmarkiv){ 
		 tekstgr = new Tekstgrensesnitt();  
		 this.filmarkiv = filmarkiv; 
	 } 
	  
	 public void start(){ 
		 Film f1 = new Film(1, "David Heyman", "Harry Potter og de vises stein", 2001, Sjanger.FANTASY, "Warner Bros");
		 Film f2 = new Film(2, "Martin Scorsese", "The Wolf of Wall Street", 2013, Sjanger.DRAMA, "Leonardo DiCaprio");
		 Film f3 = new Film(3, "Robert Zemeckis", "Forest gump", 1994, Sjanger.DRAMA, "Wendy Finerman");
		 
		 filmarkiv.leggTilFilm(f1);
		 filmarkiv.leggTilFilm(f2);
		 filmarkiv.leggTilFilm(f3);
		 
		 int brukerFilmNr = tekstgr.lesFilm();
		 Film bruker = filmarkiv.finnFilm(brukerFilmNr);
		 tekstgr.visFilm(bruker);
		 
		 tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, "Wolf");
		 System.out.println();
		 tekstgr.skrivUtFilmProdusent(filmarkiv, "Leonardo");
		 System.out.println();
		 tekstgr.skrivUtStatistikk(filmarkiv);
	 }

}
