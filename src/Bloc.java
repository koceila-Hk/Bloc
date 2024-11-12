import enums.Couleur;

public abstract class Bloc implements IBloc {

    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    public Bloc(final int longueur, final int largeur, final int hauteur) {
        if (longueur < MIN_LONGUEUR || largeur < MIN_LARGEUR || hauteur < MIN_HAUTEUR) {
            throw new IllegalArgumentException();
        }
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

}
