package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO2 {

	public static void main(String[] args) {

		int antallElever = 10;

		for (int i = 1; i <= antallElever; i++) {

			int poengsum = parseInt(showInputDialog("Poengsum: "));

			if (poengsum <= 39 && poengsum >= 0) {
				System.out.println("Elev " + i + ": " + "karakter F");

			}

			if (poengsum <= 49 && poengsum >= 40) {
				System.out.println("Elev " + i + ": " + "karakter E");

			}

			if (poengsum <= 59 && poengsum >= 50) {
				System.out.println("Elev " + i + ": " + "karakter D");

			}

			if (poengsum <= 79 && poengsum >= 60) {
				System.out.println("Elev " + i + ": " + "karakter C");

			}

			if (poengsum <= 89 && poengsum >= 80) {
				System.out.println("Elev " + i + ": " + "karakter B");
				poengsum = parseInt(showInputDialog("Poengsum: "));
			}
			if (poengsum <= 100 && poengsum >= 90) {
				System.out.println("Elev " + i + ": " + "karakter A");

			}
			//Ugyldig poengsum, skriv in ny poengsum
			if (poengsum < 0 || poengsum > 100) {
				showMessageDialog(null, "Skriv et tall mellom 0-100 ");
				i = i - 1;
			}

		}

	}

}
