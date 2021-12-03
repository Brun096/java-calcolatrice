package org.generation.italy.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
	
	
	//Attributi
	private String titolo;
	private LocalDate data;
	private int totalePosti;
	private int postiPrenotati;
	
	// aggiungere LocalDate data a costruttore
	// Il controllo del totale deo posti > 0 non va in prenota() ma nel costruttore
	// Se un valore non è valido, non stampare errore ma fare throw di Exception
	// nella funzione prenota va controllata la data e se ci sono ancora posti disponibili
	// così come nella funzione disdisci va controllata la data e se ci sono ancora prenotazioni da disdire
	// non cambiare il valore del numeroTotalePosti
	
	//Costruttori
	public Evento(String titolo, int totalePosti, LocalDate data){
		if	(totalePosti < 0) {
			throw new IllegalArgumentException("numero di posti non valido");
		}
		if(!data.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("data non valida");
		}
		this.titolo = titolo;
		this.totalePosti = totalePosti;
		this.data = data;
		this.postiPrenotati = 0;
		
		
		
//		this.titolo = titolo;
//		this.data = LocalDate.now();
//		this.totalePosti=totalePosti;
//		this.postiPrenotati = 0;
			 
	}  
	
	public int prenota() {
		
		if(postiPrenotati<totalePosti) {
			postiPrenotati+=1;
		}
		return postiPrenotati;
		
	}
	
	//getter and setter
	public String getTitolo() {
		return titolo;
	}




	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}




	public LocalDate getData() {
		return data;
	}




	public void setData(LocalDate data) {
		this.data = data;
	}




	public int getTotalePosti() {
		return totalePosti;
	}




	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	


	public String dataFormattata(){
		String dataFormattata;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dataFormattata = data.format(df);
		return dataFormattata;
	}
	
	public String toString() { 
		
		
		return dataFormattata()+" "+getTitolo();
       
	}
	
	
	
	

	
	


	
	
	
	
}
