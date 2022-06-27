
import java.util.Scanner;
public class ExerciciosOhata {

	public static void main(String[] args)
	{
	//usando o scanner para receber o numero do usuario
	  Scanner ler = new Scanner(System.in);
	// criando as variaveis e as condiçoes delas  
	  int num, num1 = 1, num2 = 2, num3 = 3;
	//print do enunciado para o usuario   
	  System.out.println("Bom dia se identifique em qual condição se encontra para estacionar na vaga:");
	//print do enunciado para o usuario ver qual condição esta 
	  System.out.println("1. Gestante");
	//print do enunciado para o usuario ver qual condição esta  
	  System.out.println("2. Deficiente fisico");
	//print do enunciado para o usuario ver qual condição esta  
	  System.out.println("3. Idoso");
	//print do enunciado para o usuario ver qual condição esta  
	  System.out.print("digite a sua condição: ");
	 // recebendo a condição do usuario 
	  num = ler.nextInt();
	 //usando o "se" para comparar a condição para ver se esta autorizado
	  if (num == num1 || num == num2 || num == num3)
	  {
	  // mostrando na tela que esta autorizado 
		  System.out.printf("Voce esta autorizado a estacionar na vaga");
	  }
	 // usando o " se não" para caso ele nao esteja na condição necessaria 
	  else
	  {
	  // mostrando ao usuario que nao esta autorizado
		  System.out.printf("Voce não esta autorizado a estacionar na vaga"); 
	  }

	}

}
