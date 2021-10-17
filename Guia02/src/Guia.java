import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

/**
*
* @author Luana Campos Takeishi
* @version 1.01 2021/9/02
* Guia 2 - ACI
* 
*/

public class Guia {
	
	/**
	 * Função recursiva para converter um número inteiro decimal recebido 
	 * por parâmetro e retornar seu binário correspondente.
	 * @param dec
	 * @return bin 
	 */
	public static int dec2bin(int dec) {
		int bin = 0;
		//função recursiva
		if (dec == 0)
			bin = 0;
		else
			bin = dec2bin(dec/2)*10 + dec%2;
		return bin;
	}
	
	/**
	 * Função recursiva para converter um número inteiro binário recebido 
	 * por parâmetro e retornar seu decimal correspondente.
	 * @param bin
	 * @return dec 
	 */
	public static int bin2dec(int b) {
		String bin = Integer.toString(b);
		int dec = 0;
		for(int n = bin.length()-1, pos = 0; n >= 0; n--, pos++)
			if (bin.charAt(pos) == '1') 
				dec += Math.pow(2, n);
		return dec;
	}
	
	/**
	 * Função recursiva para converter um número inteiro decimal recebido 
	 * por parâmetro e retornar seu hexadecimal correspondente.
	 * @param dec
	 * @return hex 
	 */
	public static String dec2hex(int dec) {
		String hex = new String();
		//função recursiva
		if(dec != 0) 
			hex = dec2hex(dec/16) + hexadec(dec%16);
		
		return hex;
	}
	
	/**
	 * Função que converte o valor decimal (int)
	 * para hexadecimal correspondente (String).
	 * @param dec
	 * @return hexa
	 */
	public static String hexadec(int dec) {
		String hexa = "";
		switch (dec) {
			case 10: hexa = "A"; break;
			case 11: hexa = "B"; break;
			case 12: hexa = "C"; break;
			case 13: hexa = "D"; break;
			case 14: hexa = "E"; break;
			case 15: hexa = "F"; break;
			default: hexa = Integer.toString(dec);
		}
		return hexa;
	}
	
	/**
	 * Função recursiva para converter um número inteiro hexadecimal
	 * recebido por parâmetro e retornar seu decimal correspondente.
	 * @param hex
	 * @return dec
	 */
	public static int hex2dec(String hex) {
		int dec = 0;
		for(int n = hex.length()-1, pos = 0; n >= 0; n--, pos++)
			 dec += (dec(hex.charAt(pos)) * Math.pow(16, n));
		return dec;
	}
	
	/**
	 * Função que converte o valor hexadecimal (char)
	 * para decimal correspondente (int).
	 * @param hex
	 * @return dec 
	 */
	public static int dec(char hex) {
		int dec = 0;
		switch (hex) {
			case 'A': dec = 10; break;
			case 'B': dec = 11; break;
			case 'C': dec = 12; break;
			case 'D': dec = 13; break;
			case 'E': dec = 14; break;
			case 'F': dec = 15; break;
			default: dec =  Character.getNumericValue(hex);
		}
		return dec;
	}
	
	/**
	 * Função que recebe um texto ASCII e converte
	 * para caracteres hexadecimais correspondentes.
	 * @param ASCII
	 * @return hex
	 */
	public static String ASCII2hex(String ASCII) {
	    String hex = new String();
	    for (int i = 0; i < ASCII.length(); i++)
	        hex += Integer.toHexString((int) ASCII.charAt(i));
	    return hex;
	}
	
	/**
	 * Função que recebe caracteres hexadecimais
	 * e converte para texto ASCII correspondente.
	 * @param hex
	 * @return ASCII
	 */
	public static String hex2ASCII(String hex) {
		String ASCII = new String();
	    for (int i = 0; i < hex.length(); i += 2) {
	        String aux = hex.substring(i, i + 2);
	        ASCII += (char) Integer.parseInt(aux, 16);
	    }
	    return ASCII;
	}
	
	
	/**
	 * Função Principal
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner (System.in);
		
		/*/Conversão Decimal->Binário
		System.out.println("Decimal para Binário");
		int[] decimais = {27, 51, 713, 312, 360};
		for(int n = 0; n < decimais.length; n++) 
			System.out.println(decimais[n] + "(10 = " + dec2bin(decimais[n]) + "(2");
		
		//Conversão Binário->Decimal
		System.out.println("Binário para Decimal");
		int[] binarios = {10101, 11010, 101001, 111001, 100011};
		for(int n = 0; n < binarios.length; n++)
			System.out.println(binarios[n] + "(2 = " + bin2dec(binarios[n]) + "(10");
		
		//Conversão Decimal->Hexadecimal
		System.out.println("Decimal para Hexadecimal");
		int[] decimais = {73, 47, 61, 157, 171};
		for(int n = 0; n < decimais.length; n++)
			System.out.println(decimais[n] + "(10 = " + dec2hex(decimais[n]) + "(16");
		
		//Conversão Hexadecimal->Decimal
		System.out.println("Hexadecimal para Decimal");
		String[] hexadecimais = {"73", "ABC", "100", "9A8", "1000"};
		for(int n = 0; n < hexadecimais.length; n++) 
			System.out.println(hexadecimais[n] + "(16 = " + hex2dec(hexadecimais[n]) + "(10");
		*/
		
		//Conversão ASCII->Hexadecimal
		System.out.println("ASCII para Hexadecimal");
		String[] ASCII = {"PUC-Minas", "2021-1", "Brasil", "Luana", "b.h.-mg"};
		for(int n = 0; n < ASCII.length; n++) 
			System.out.println(ASCII[n] + "(ASCII = " + ASCII2hex(ASCII[n]) + "(16_ASCII");
		
		//Conversão ASCII->Hexadecimal
		System.out.println("\nASCII para Hexadecimal");
		String[] Hex = {"5055432D4D696E6173", "323032312D31", "42726173696C", "4C75616E61", "622E682E2D6D67"};
		for(int n = 0; n < Hex.length; n++) 
			System.out.println(Hex[n] + "(16_ASCII = " + hex2ASCII(Hex[n]) + "(ASCII");
				
		scan.close();
	}
}
