package src;
import java.util.*;

/**
*
* @author Luana Campos Takeishi
* @version 1.01 2021/10/06
* Exercício Extra - ACI
* 
*/

public class Maquina {

	/**
	 * Função Principal
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Simulação da Máquina - digite 2 para sair");
		int x = 0;
		boolean um = false, dois= false, tres = false, zu = false, trigger = false;
		while (x!=2) {
			int n = 1;
			while(n <= 4 && x!=2) {
				//Ler o valor e mostrar o estado
				System.out.print("Valor: ");
				x = scan.nextInt();
				
				//Verificar o estado
				if (x == 0)
					zu = true;
				if(zu && x == 1)
					zu = false;
				if(x == 1 && !dois)
					n++;
				if(x == 0 && dois)
					n++;
				if(n > 4)
					n = 0;
				System.out.println("-> Estado " + n);
				
				//Testa a sequência
				if(!um && x == 1) {
					um = true;
				} else if(!dois && x == 1 && um) {
					dois = true;
				} else if (um && dois && !tres && x == 0) {
					trigger = true;
					um = false;
					dois = false;
				}
				
				//Mostra o resultado
				if(trigger) {
					System.out.println("Sequência detectada: 110");
					trigger = false;
				}
			}			
		}
		
		
		scan.close();
	}
}
