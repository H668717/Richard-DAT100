package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {

		// Trinnskatt i desimal
		double trinn1 = 0.017;
		double trinn2 = 0.040;
		double trinn3 = 0.134;
		double trinn4 = 0.164;
		double trinn5 = 0.174;

		// input fra bruker
		int bruttoInntekt = parseInt(showInputDialog("Bruttoinntekt: "));
		double trinnSkatt;

		// Hvis negativt tall
		while (bruttoInntekt < 0) {
			showMessageDialog(null, "Skriv et positivt tall");
			bruttoInntekt = parseInt(showInputDialog("Bruttoinntekt: "));
		}

	
		
		

		if (bruttoInntekt < 190350 && bruttoInntekt >= 0) {
			showMessageDialog(null, "Du har ingen trinnskatt");
		}
		// Trinn 1: 190 350 – 267 899 kroner
		if (bruttoInntekt >= 190350 && bruttoInntekt <= 267899) {
			trinnSkatt = bruttoInntekt * trinn1;
			showMessageDialog(null, "Trinn 1: " + trinnSkatt);
		}

		// Trinn 2: 190 350 – 267 899 kroner
		if (bruttoInntekt >= 267900 && bruttoInntekt <= 643799) {
			trinnSkatt = bruttoInntekt * trinn2;
			showMessageDialog(null, "Trinn 2: " + trinnSkatt + "kr");
		}

		// Trinn 3: 190 350 – 267 899 kroner
		if (bruttoInntekt >= 643800 && bruttoInntekt <= 969199) {
			trinnSkatt = bruttoInntekt * trinn3;
			showMessageDialog(null, "Trinn 3: " + trinnSkatt);
		}

		// Trinn 4: 190 350 – 267 899 kroner
		if (bruttoInntekt >= 969200 && bruttoInntekt <= 1999999) {
			trinnSkatt = bruttoInntekt * trinn4;
			showMessageDialog(null, "Trinn 4: " + trinnSkatt);
		}

		// Trinn 5: 190 350 – 267 899 kroner
		if (bruttoInntekt > 2000000) {
			trinnSkatt = bruttoInntekt * trinn5;
			showMessageDialog(null, "Trinn 5: " + trinnSkatt);
		}

	}

}
