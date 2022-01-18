package one.digitalinnovatiion;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //fila de carro
        Queue<Carro> queueCarros = new LinkedList<>();


        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("VW"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Jetta")));
        System.out.println(queueCarros);

        //retorna falso se nao executar. adiona tbm
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);

        //pega o primeiro elemento da fila, se tiver vazia retorna nulo
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //remove o primeiro elemento
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        //vazio
        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros);

        //tamanho da fila
        System.out.println(queueCarros.size());
        System.out.println(queueCarros);
    }
}
