import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int termo=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o termo para a série fibonacci: ");
		termo = entrada.nextInt();
		int anterior = 1, atual = 1, proximo;
		for (int i = 0; i < termo; i++) {
			if((i==0)||(i == 1))
				System.out.println(" 1 ");
			else {				
				proximo = anterior +atual;
				System.out.println(" "+ proximo);
				anterior = atual;
				atual = proximo;				
			}
		}
	}

}
