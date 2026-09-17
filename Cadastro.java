// Kauan Stipp Pedroso

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        try {
            validarIdade(idade);
        } catch (ExcecaoIdade ex) {
            System.out.println("Entrada negada");
            System.out.println("Motivo: " + ex.getMessage());
        }
    }

    public static void validarIdade(int idade) {

        if (idade < 18) {
            throw new ExcecaoIdade("Entrada proibida é necessario mais de 18 anos");
        } else {
            System.out.println("Você foi liberado");
        }
    }
}

/* Vem da classe criada excecao idade
    Envia a mensagem para classe principal
    Ela herda automaticamente de uma classe "Mãe"
   Usamos Throw
 */