package poo.main;

import poo.model.Cliente;
import poo.model.Endereco;


public class Main {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        //dados do endereco

        Cliente cliente = new Cliente();
        //daddos do cliente

        //       if (cliente.enderecos == null){
//            cliente.enderecos = new ArrayList<>();
        //      }

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Adicionou");

        } catch (Exception e) {
            System.out.println("Erro ao adicionar o endereço: " + e.getMessage());
        }
    }
}
