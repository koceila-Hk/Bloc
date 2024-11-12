import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws PorteVerrouilleException {
//        IBloc newBloc = new Mur(100, 100, 20, true);
//        newBloc.afficherDescription();

        // Exception
        try {
            Bloc b = new Mur(0,1,1,false);
            b.afficherDescription();
        } catch (IllegalArgumentException e) {
            System.out.println("Valeurs pour construire le bloc invalides");
        }
//        IBloc c = new Mur(0,0,0,false);
//        c.afficherDescription();



        //Exception Porte
        try {
            Porte porte = new Porte(1,1,1, true);
            porte.verrouiller();
        } catch (PorteVerrouilleException e) {
            System.out.println("La porte est déjà vérrouillée");
        }

          Kit kitDeDemarrage = new Kit();
          kitDeDemarrage.afficherKit();
        // Exception
        try {
            int result = kitDeDemarrage.getMotsCles().size();
            System.out.println("Nombre de mots clés: " + result);
        } catch (NullPointerException exception) {
            System.out.println("Liste de mots clés indisponible");
        }





        ///// List example avec doublon
        List<Integer> quantiteBlocsUtilises= new ArrayList<Integer>();
        quantiteBlocsUtilises.add(1);
        quantiteBlocsUtilises.add(3);
        quantiteBlocsUtilises.add(1); // doublon autorisé

        quantiteBlocsUtilises.remove(Integer.valueOf(3));
        for(Integer quantite : quantiteBlocsUtilises) {
            System.out.println(quantite);
        }

        // List Set pas de doublons
        Set<String> motsCles = new LinkedHashSet<String>();
        motsCles .add("Cabane");
        motsCles .add("Cabane");
        motsCles .add("Muraille");

        for(String motCle : motsCles) {
            System.out.println(motCle);
        }

        if (motsCles.contains("Cabane")) {
            System.out.println("Mot clé Cabane présent !");
            motsCles.remove("Cabane");
            System.out.println(motsCles);
        }


        // Manipulation des associations clés valeurs
        Map<Bloc, Integer> quantiteBloc= new HashMap<Bloc, Integer>();
        quantiteBloc.put(new Mur(100,1,1,true), 3);
        quantiteBloc.put(new Porte(1,1,1,false), 4);

        Set<Bloc> cles = quantiteBloc.keySet();
        for(Bloc bloc : cles) {
            Integer valeur = quantiteBloc.get(bloc);
            System.out.println(bloc.getClass().getName() + " : " + valeur);
        }
        //TreeMap
        //Hashtable
        //WeakHashMap
        //ConcurrentHashMap
        //LinkedHashMap
        //IdentityHashMap
        //EnumMap

    }
}