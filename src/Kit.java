import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Kit {
    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> motsCles = new LinkedHashSet<String>();

    public Kit() {
        blocs.add(new Mur(3, 2, 2, true));
        blocs.add(new Mur(3, 2, 2, true));
        blocs.add(new Mur(2, 1, 2, false));
        blocs.add(new Mur(2, 1, 2, false));
        blocs.add(new Porte(1, 2, 2, true));

        motsCles.add("Cabane");
        motsCles.add("Muraille");
    }

    public void afficherKit() {
        System.out.println("Nombre de blocs: " + blocs.size());

        System.out.println("Liste des mots clés: ");
        for (String motCle : motsCles) {
            System.out.println(motCle + " ");
        }
    }

}
