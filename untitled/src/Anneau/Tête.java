package Anneau;

import Anneau.Anneau;
import g�om�trie.Direction;

public class T�te extends Anneau {
    Direction cap;

    public T�te(int x, int y, Direction cap) {
        super(x,y);
        this.cap = cap;
    }

    public T�te(int x, int y) {
        this(x,y,Direction.EST);
    }

    @Override
    public void dessiner(char[][] t) {
        t[getX()][getY()] = 't';
    }

    public void d�placer(int xMax, int yMax){
        if(getX() == 0 || getX() == xMax || getY() == 0 || getY() == yMax) {
            cap.inverser();
        }
        else {
            cap.d�river(1);
        }
        sePlacer(getX() + cap.getDx(), getY() + cap.getDy());
    }
}
