package cm.ime.projet.test;
import cm.ime.projet.api.Rectangle;

public class TestRectangle{
    public static void main(String[] args){
        if(args.length==2){
            int longueur=Integer.parseInt(args[0]);
            int largeur=Integer.parseInt(args[1]);
            System.out.println("Surface: "+Rectangle.surface(longueur,largeur));
        }else{
            System.exit(0);
        }
    }
}