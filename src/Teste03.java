import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Teste03 {
    public static void main(String[] args) {
        Aluno aluno;
        Map<Integer, Aluno> lista = new HashMap<>();

        lista.put(85000, new Aluno(85000, "Renato Nivaldex", "SI"));
        lista.put(15000, new Aluno(15000, "Ismael Ligeirinho", "ADM"));
        lista.put(15000, new Aluno(15000, "Ismael Ligeirinho", "ADM"));

        System.out.println(lista.get(15000));

        Set<Integer> chave = lista.keySet();

        chave.forEach(c -> System.out.println(lista.get(c)));
    }
}
