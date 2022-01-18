package com.projetono;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteúdo no1");

        No<String> no2 = new No<>("Contudo no2");

        No<String> no3 = new No<>("Contudo no3");

        No<String> no4 = new No<>("Contudo no4");

        no1.setProximoNO(no2);
        no2.setProximoNO(no3);
        no3.setProximoNO(no4);

        System.out.println(no1);
        System.out.println(no2.getProximoNO().getProximoNO());

    }
}
