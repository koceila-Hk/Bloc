import enums.Couleur;

public class Mur extends Bloc {

    private boolean porteur;

    public Mur(final int longueur, final int largeur, final int hauteur, final boolean porteur) {
        super(longueur, largeur, hauteur);
        this.porteur = porteur;
        this.couleur = Couleur.GRIS;
    }

    public boolean estTraversable() {
        return !porteur;
    }

    @Override
    public void afficherDescription() {
        System.out.println("Je suis un mur !");
    }

}