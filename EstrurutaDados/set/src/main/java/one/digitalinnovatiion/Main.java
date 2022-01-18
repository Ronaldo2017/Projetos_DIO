package one.digitalinnovatiion;


import java.util.*;

public class Main {
    public static void main(String[] args) {

      Set<Carro> hashSetCarros = new HashSet<>();

      hashSetCarros.add(new Carro("VW"));
      hashSetCarros.add(new Carro("Ford"));
      hashSetCarros.add(new Carro("Fiat"));
      hashSetCarros.add(new Carro("BMW"));
      hashSetCarros.add(new Carro("Zip"));
      hashSetCarros.add(new Carro("Alpha Romeo"));

      System.out.println(hashSetCarros);

      //set = arvore
      Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("VW"));
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("BMW"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alpha Romeo"));

        System.out.println(treeSetCarros);
    }
}
