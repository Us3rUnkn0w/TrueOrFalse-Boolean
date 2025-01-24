package tech.buildandrun.aula8;

import java.util.Scanner;

public class verificador {
    public static void main(String[] args) {
        System.out.println("##########################\n# Sistema Contra Fraudes #\n##########################\n");
        // verificar se é True ou False
        System.out.println("Digite True ou False abaixo\n>");

        Scanner sc = new Scanner(System.in);
        boolean checagem = sc.nextBoolean();

        if (checagem == true){
            System.out.println("O Valor verificado é VERDADEIRO: "+checagem);
        }else {
            System.out.println("O Valor verificado é FALSO: "+checagem);
        }
    }
}