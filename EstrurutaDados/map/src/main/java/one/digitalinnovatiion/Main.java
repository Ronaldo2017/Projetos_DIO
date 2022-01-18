package one.digitalinnovatiion;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

      Map<String, String> aluno = new HashMap<>();

      aluno.put("Nome", "Ronaldo");
      aluno.put("Idade", "38");
      aluno.put("Media", "8.5");

      System.out.println(aluno);

      //retorna o grupo das chaves
      System.out.println(aluno.keySet());
      //retorna os valores correspondentes as chaves
      System.out.println(aluno.values());


      //lista de aluno
      List<Map<String, String> > listaAlunos = new ArrayList<>();


      Map<String, String> aluno2 = new HashMap<>();

      aluno2.put("Nome", "Joana");
      aluno2.put("Idade", "38");
      aluno2.put("Media", "8.5");
      aluno2.put("Turma", "3A");

      listaAlunos.add(aluno2);

      System.out.println(listaAlunos);

      //contains key = tem um determinada chave
      System.out.println(aluno.containsKey("Nome"));

    }
}
