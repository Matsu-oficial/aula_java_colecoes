import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste01 {
    public static void main(String[] args) {

        List<Aluno> lista = new ArrayList<>();
        /* lista.add(new Aluno(85000, "Renato Nivaldex", "SI"));
        lista.add(new Aluno(15000, "Ismael Ligeirinho", "ADM"));
        lista.add(new Aluno(35000, "Patricia Arvore Binaria", "Engenharia"));
        lista.add(new Aluno(10000, "Ana Maria", "SI"));
        lista.add(new Aluno(20000, "Ana Maria", "ADM")); */

        lista.add(new Aluno(1, "Selmini", "CSX46"));
        lista.add(new Aluno(1, "Selmini", "CSX13"));
        lista.add(new Aluno(1, "Selmini", "CSX6"));

        lista.forEach(aluno -> System.out.println(aluno));

        lista.sort(Comparator.comparing(Aluno::getNome)
                .thenComparing(Aluno::getCurso));

        System.out.println();

        lista.forEach(aluno -> System.out.println(aluno));

        lista.sort(Comparator.comparing(Aluno::getNome).reversed());
    }
}
