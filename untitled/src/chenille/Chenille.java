package chenille;

import Anneau.Anneau;
import Anneau.Tête;


public class Chenille {
    private Tête tete;
    private Anneau[] anneaux;
    public Chenille(int nbAnneaux, int x, int y) {
        this.tete = new Tête(x,y);
        this.anneaux = new Anneau[nbAnneaux];
        for (int i = 0; i< anneaux.length; ++i)
            anneaux[i] = new Anneau(x-i -1 , y);
    }

    public void dessiner(char[][] t) {
        for (Anneau a : anneaux)
            a.dessiner(t);
        tete.dessiner(t);
    }

    public void déplacer(int xMax, int yMax) {
        for (int i = anneaux.length -1; i >0;--i)
            anneaux[i].sePlacer(anneaux[i-1].getX(), anneaux[i-1].getY());
        anneaux[0].sePlacer(tete.getX(), tete.getY());
        tete.déplacer(xMax, yMax);
    }
}


