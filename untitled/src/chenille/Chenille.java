package chenille;

import Anneau.Anneau;
import Anneau.T�te;


public class Chenille {
    private T�te tete;
    private Anneau[] anneaux;
    public Chenille(int nbAnneaux, int x, int y) {
        this.tete = new T�te(x,y);
        this.anneaux = new Anneau[nbAnneaux];
        for (int i = 0; i< anneaux.length; ++i)
            anneaux[i] = new Anneau(x-i -1 , y);
    }

    public void dessiner(char[][] t) {
        for (Anneau a : anneaux)
            a.dessiner(t);
        tete.dessiner(t);
    }

    public void d�placer(int xMax, int yMax) {
        for (int i = anneaux.length -1; i >0;--i)
            anneaux[i].sePlacer(anneaux[i-1].getX(), anneaux[i-1].getY());
        anneaux[0].sePlacer(tete.getX(), tete.getY());
        tete.d�placer(xMax, yMax);
    }
}


