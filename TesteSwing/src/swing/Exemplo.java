package swing;
import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		 try (Scanner ler = new Scanner(System.in)) {
			String CPF;

			 System.out.printf("Informe um CPF: ");
			 CPF = ler.next();

			 System.out.printf("\nResultado: ");
			     // usando os metodos isCPF() e imprimeCPF() da classe "ConfeirCPF"
			 if (ConferirCPF.isCPF(CPF) == true)
			    System.out.printf("%s\n", ConferirCPF.imprimeCPF(CPF));
			 else System.out.printf("Erro, CPF invalido !!!\n");
		}
         }
     }
