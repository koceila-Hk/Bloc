import enums.Couleur;

public class Porte extends Bloc {

    private boolean verrouillee;

    public Porte(final int longueur, final int largeur, final int hauteur, final boolean verrouillee) {
        super(longueur, largeur, hauteur);
        this.verrouillee = verrouillee;
        this.couleur = Couleur.BLEU;
    }

    public boolean estVerrouillee() {
        return verrouillee;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Je suis une porte !");
    }


    public void verrouiller() throws PorteVerrouilleException {
        if (verrouillee) {
            throw new PorteVerrouilleException();
        } else {
            System.out.println("Porte vérrouillée");
            verrouillee = true;
        }
    }

}