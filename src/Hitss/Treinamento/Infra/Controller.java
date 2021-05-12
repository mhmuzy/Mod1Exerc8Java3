package Hitss.Treinamento.Infra;

public class Controller {
	public static void Play() {
		int[] Voto = new int[4];
		Voto[1] = 3;
		Voto[2] = 5;
		Voto[3] = 5;
		
		int count = 0;
		int countNulo = 0;
		int countBranco = 0;

		System.out.println("");
		System.out.println("      Hitss Treinamento");
		System.out.println("");
		System.out.println("-------------------------------------------------------");
		System.out.println("");
		System.out.println("...");
		System.out.println("");
		System.out.println("Resultado das Pesquisas");
		System.out.println("");
		System.out.println("-------------------------------------------------------");
		System.out.println("");
		System.out.println("Respecttivos Candidatos: " + 1);
		for (int i = 0; i < Voto.length; i++) {
			if (Voto[i] == 5) {
				countNulo += 1;
				if (countNulo == 2) {
					System.out.println("Nulo: " + countNulo);
				}
				if (Voto[i] == 3) {
					count +=1;
					if (count == 1) {
						System.out.println("Respectivos Candidatos: " + count);
					}
					
				}
			}
		
		}
		System.out.println("");
		System.out.println("-------------------------------------------------------");
		System.out.println("");
	}
	/*
	public static void dataFolha(int voto, int count, int countNulo, int countBranco) {
				
		if (voto >= 1 && voto <= 4) {
			count += 1;
			System.out.println("Votos Para os Respectivos Candidatos: " + count);
		} else if (voto == 5) {
			countNulo += 1;
			System.out.println("Nulos: " + countNulo);
		} else {
			countBranco += 1;
			System.out.println("Voto em Branco: " + countBranco);
		}
	}*/
}
