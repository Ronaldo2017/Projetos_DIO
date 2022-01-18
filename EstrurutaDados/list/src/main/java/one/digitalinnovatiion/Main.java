package one.digitalinnovatiion;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("VW"));
        listCarros.add(new Carro("Renault"));

        System.out.println(listCarros.contains(new Carro("Ford")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("VW")));

        System.out.println(listCarros.remove(2));
        System.out.println(listCarros);
    }
}
