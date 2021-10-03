package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String resultat = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			resultat = resultat + tabell[i];
			if (i + 1 != tabell.length) {
				resultat = resultat + ",";
			}
		}
		
		return resultat + "]";
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}
				
		return sum;
	}
	
	// Oppgave c.) med while løkke løsning.
	public static int summerWhile (int[] tabell) {
		int i = 0;
		int sum = 0;
		
		while (i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		
		
		return sum;
	}

	// Oppgave c.) med utvidet for løkke løsning.
	public static int summerFor (int[] tabell) {
		int sum = 0;
		
		for (int i : tabell) {
			sum = sum + i;
		}
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean result = false;
		
		for (int i : tabell) {
			if (i == tall) {
				result = true;
			}
		}
		
		return result;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}

		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];

		for (int i = tabell.length - 1, j = 0; 0 <= i; i--, j++) {
			nyTabell[j] = tabell[i];
		}
		
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean result = true;

		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i - 1]) {
				result = false;
			}
		}

		return result;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		
		for (int i = 0, j = tabell1.length; i < tabell2.length; i++, j++) {
			nyTabell[j] = tabell2[i];
		}

		return nyTabell;
	}
}
