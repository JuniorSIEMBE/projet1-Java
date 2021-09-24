package cm.ime.projet.api;

public class Rectangle{

    private int origineX;

    private int origineY;

    private int longueur;

    private int largeur;

    //getter
    public int getOrigineX(){
        return this.origineX;
    }

    //setter
    public void setOrigineX(int x){
        this.origineX= x;
    }

        //getter
    public int getOrigineY(){
        return this.origineY;
    }

    //setter
    public void setOrigineY(int y){
        this.origineY= y;
    }

        //getter
    public int getLongueur(){
        return this.longueur;
    }

    //setter
    public void setLongueur(int l){
        this.longueur= l;
    }

        //getter
    public int getLargeur(){
        return this.largeur;
    }

    //setter
    public void setLargeur(int l){
        this.largeur= l;
    }

    //calcul de la surface
    public static int surface(int lon, int large){
        return lon*large;
    }
    
}