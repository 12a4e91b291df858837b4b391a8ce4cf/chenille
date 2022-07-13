package Anneau;

import Anneau.Anneau;
import géométrie.Direction;

public class Tête extends Anneau {
    Direction cap;

    public Tête(int x, int y, Direction cap) {
        super(x,y);
        this.cap = cap;
    }

    public Tête(int x, int y) {
        this(x,y,Direction.EST);
    }

    @Override
    public void dessiner(char[][] t) {
        t[getX()][getY()] = 't';
    }

    public void déplacer(int xMax, int yMax){
        if(getX() == 0 || getX() == xMax || getY() == 0 || getY() == yMax) {
            cap.inverser();
        }
        else {
            cap.dériver(1);
        }
        sePlacer(getX() + cap.getDx(), getY() + cap.getDy());
    }
}
