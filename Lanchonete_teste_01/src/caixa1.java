import java.util.Scanner;

public class caixa1 {

	public static void main(String[] args) {
		
		Scanner caixa = new Scanner(System.in);
		
		int codigoproduto = caixa.nextInt();
		int quantidadeproduto = caixa.nextInt();
		
		
		double total;
		if (codigoproduto == 1) {
			total = quantidadeproduto * 4.0;
		}
		else if (codigoproduto == 2) {
			total = quantidadeproduto * 4.5;
		}
		else if (codigoproduto == 3) {
			total = quantidadeproduto * 5.0;
		}
		else if (codigoproduto == 4) {
			total = quantidadeproduto * 2.0;
		}
		else {
			total = quantidadeproduto * 1.5;
		}

		System.out.printf("Total: R$ %.2f%n", total);
		
		caixa.close();
		
		
	}

}
