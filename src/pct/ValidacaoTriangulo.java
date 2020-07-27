package pct;

import java.util.Scanner;

class ValidacaoTriangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\t\t**VALIDANDO TRIANGULO**\n");

        //declaracao de variaveis
        float a, b, c;

        //entradad de dados
        System.out.print("Digite a primeira media: ");
        a = entrada.nextFloat();
        System.out.print("Digite a segunda meida: ");
        b = entrada.nextFloat();
        System.out.print("Digite a terceira medida: ");
        c = entrada.nextFloat();

        //processamento 
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            System.out.println("As medidas " + a +" e "+ b +" e "+ c + " formam triangulo");
            if (a == b && a == c) {
                System.out.println("O Triangulo e equilatero!");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("O trinagulo isoceles!");
            } else {
                System.out.println("O triangulo e escaleno");
            }
        } else {
            System.err.println("As medidas " + a +" e " + b + " e " + c + " nao formam triangulo!");
        }
    }
}
