package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int heltall = parseInt(showInputDialog("Heltall: : "));
		int fakultet = heltall;

		
		//Spørr om nytt tall hvis heltall er negativ
		while (heltall < 0) {
			showMessageDialog(null, "Skriv et positivt heltall");
			heltall = parseInt(showInputDialog("Heltall: "));
		}

		
		//Regner om heltall til fakultet
		if (heltall > 0) {
			System.out.print(heltall + "! = " + heltall + "*");

			for (int i = heltall - 1; i > 0; i--) {
				fakultet = fakultet * i;

				System.out.print(i + "*");
			}

			System.out.print(" = " + fakultet);
		}
		
		
		// 0 fakultet blir 1
		if (heltall == 0) {
			System.out.println("0! = 1");
		}

	}

}
