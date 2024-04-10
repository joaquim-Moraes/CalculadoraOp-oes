/*Crie uma calculadora que solicite 2 numero e apresente o seguinte menu abaixo:
E caso o usuário digite a opção = 9 finaliza a calculadora.
Seu programa deve usar o comando switch e Do While
 */
import java.util.Scanner;
public class CalculadoraOpcoes {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int numero;
    double soma,subtra,primeiron,segundon,mutiplicaçao,divisao;
    System.out.print("1 - Soma\n");
    System.out.print("2 - Subtrair\n");
    System.out.print("3 - Mutiplicaçao\n");
    System.out.print("4 - Divisao\n");
    System.out.print("9 - Sair\n");
    System.out.println("Escolha um número");
    numero = ler.nextInt();
    if(numero == 9){
        System.out.println("Muito obrigada por usar a calculadora inteligente, volte sempre!!");
    }
    System.out.println("Digite o primeiro numero: ");
    primeiron = ler.nextDouble();
    System.out.println("Digite o segundo numero: ");
    segundon = ler.nextDouble();
    soma = primeiron + segundon;
    subtra = primeiron + segundon;
    divisao = primeiron / segundon;
    mutiplicaçao = primeiron * segundon;
    if(numero == 1 ){
    System.out.print("O resultado da soma é: " + soma);
    }
    else if(numero == 2){
        System.out.println("A conta fica: " + subtra);
    }
    else if(numero == 3){
        System.out.println("A conta fica: " + mutiplicaçao);
    }
    else if(numero == 4){
        System.out.println("A conta fica: " + divisao);
    }
    }
}

