import java.util.Scanner;

public class enteros {
	public static void main(String args[]) {
		//numeros enteros 
		Scanner introducir=new Scanner(System.in);
		int numero1,numero2;
		int resultado,suma,div;
		System.out.println("operaciones con numeros flotantes");
		System.out.println("dame el primer numero");
		numero1=introducir.nextInt();
		System.out.println("dame otro numero");
		numero2=introducir.nextInt();
		resultado=numero1*numero2;
		System.out.println("el resultado de la multiplicasion es");
		System.out.println(resultado);
		suma=numero1+numero2;
		System.out.println("la suma de los dos nuemeros es ");
		System.out.println(suma);
		System.out.println("y la division de tus numero es ");
		div=numero1/numero2;
		System.out.println(div);
	}

}
