package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] i : matrise) {
			for (int j : i) {
				System.out.println(j);
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String result = "";

		for (int[] i : matrise) {
			for (int j : i) {
				result = result + j + " ";
			}
			result = result + "\n";
		}		

		return result;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}

		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik = true;
		
		if (a.length != b.length) {
			erLik = false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				erLik = false;
			}
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					erLik = false;
				}
			}
		}

		return erLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
