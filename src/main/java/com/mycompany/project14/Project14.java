package com.mycompany.project14;
import java.util.Scanner;

public class Project14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe seu ano de nascimento: ");
        int nascimento = in.nextInt();
        System.out.println("Informe o ano atual: ");
        int atual = in.nextInt();
        int idade = atual - nascimento;
        if(nascimento < atual){
            System.out.println("Idade do usuário: " + idade);
        }else{
            System.out.println("Dados incorretos!");
        }
    }
}
