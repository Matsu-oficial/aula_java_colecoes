import java.util.HashSet;
import java.util.Set;

public class Teste2 {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno(85000, "Renato Nivaldex", "SI"));
        lista.add(new Aluno(15000, "Ismael Ligeirinho", "ADM"));
        lista.add(new Aluno(35000, "Patricia Arvore Binaria", "Engenharia"));
        lista.add(new Aluno(10000, "Ana Maria", "SI"));
        lista.add(new Aluno(20000, "Ana Maria", "ADM"));
        lista.add(new Aluno(15000, "Ana Maria", "ADM"));

        lista.forEach(aluno -> System.out.println(aluno));
    }
}
