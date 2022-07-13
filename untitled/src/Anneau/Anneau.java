package Anneau;

public class Anneau {
    private int x;
    private int y;

    public Anneau(int x, int y) {
        sePlacer(x,y);
    }

    public void sePlacer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void dessiner(char[][] tab) {
        tab[x][y] = 'a';
    }

    public int getX() {
        return x;
    }

    public int getY()  {
        return y;
    }

}
