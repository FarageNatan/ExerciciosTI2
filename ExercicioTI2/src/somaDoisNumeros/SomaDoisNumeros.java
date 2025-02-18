package somaDoisNumeros;
import java.util.*;

class ExercicioTI01 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Declaracao variaveis
		int num1, num2, soma = 0;
		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();
		
		//Somar
		soma = num1 + num2;
		
		//Mostrar na tela
		System.out.println("Soma:" + soma);
	}
}
