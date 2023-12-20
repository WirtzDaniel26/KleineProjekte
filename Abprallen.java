import pm.gamewindow.*;
import java.util.Random;
/*
 * Bildschirmschoner: Sprites titschen im Fenster hin und her
 * (Name, Datum)
 */
public class Abprallen
{
    private GameWindow window;
    private GameImage img1, img2, img3, img4, img5, img6, img7, img8;
    private Sprite[] spListe;
    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     * for (int i = 0; i < spListe.length; i++)
        {
            if(i < 6){
                spListe[i] = new Sprite(img1);
            } 
            if(i >= 6 && i < 12){
                spListe[i] = new Sprite(img2);
            } 
            if(i >= 12 && i < 18){
                spListe[i] = new Sprite(img3);
            } 
            if(i >= 18 && i < 14){
                spListe[i] = new Sprite(img4);
            } 
            if(i >= 24 && i < 30){
                spListe[i] = new Sprite(img4);
            }
        }
     */
    public Abprallen()
    {
        img1   = new GameImage("images/ghost red 100x100.png");
        img2   = new GameImage("images/ghost pink 100x100.png");
        img3   = new GameImage("images/ghost cyan 100x100.png");
        img4   = new GameImage("images/ghost yellow 100x100.png");
        img5   = new GameImage("images/ghost blue 100x100.png");
        img6   = new GameImage("images/pacman 100x100.png");
        img7   = new GameImage("images/bubble 100x100.png");
        img8   = new GameImage("images/ghost white 100x100.png");
        
        spListe = new Sprite[30];
        
        window = new GameWindow(50, 50, 900, 700, "Array Referenzen");
        
        Random rand = new Random();
        for(int i = 0;i < 6;i++){
            int min = 1;
            int max = 9;

            int tempR1 = rand.nextInt(max - min) + min;
            
            if(tempR1 == 1){spListe[i] = new Sprite(img1);}
            if(tempR1 == 2){spListe[i] = new Sprite(img2);}
            if(tempR1 == 3){spListe[i] = new Sprite(img3);}
            if(tempR1 == 4 ){spListe[i] = new Sprite(img4);}
            if(tempR1 == 5 ){spListe[i] = new Sprite(img5);}
            if(tempR1 == 6 ){spListe[i] = new Sprite(img6);}
            if(tempR1 == 7){spListe[i] = new Sprite(img7);}
            if(tempR1 == 8){spListe[i] = new Sprite(img8);}
            
            tempR1 = rand.nextInt(max - min) + min;
            if(tempR1 == 1){spListe[i+6] = new Sprite(img1);}
            if(tempR1 == 2 ){spListe[i+6] = new Sprite(img2);}
            if(tempR1 == 3){spListe[i+6] = new Sprite(img3);}
            if(tempR1 == 4){spListe[i+6] = new Sprite(img4);}
            if(tempR1 == 5){spListe[i+6] = new Sprite(img5);}
            if(tempR1 == 6 ){spListe[i+6] = new Sprite(img6);}
            if(tempR1 == 7 ){spListe[i+6] = new Sprite(img7);}
            if(tempR1 == 8 ){spListe[i+6] = new Sprite(img8);}
            
            tempR1 = rand.nextInt(max - min) + min;
            if(tempR1 == 1){spListe[i+12] = new Sprite(img1);}
            if(tempR1 == 2 ){spListe[i+12] = new Sprite(img2);}
            if(tempR1 == 3 ){spListe[i+12] = new Sprite(img3);}
            if(tempR1 == 4 ){spListe[i+12] = new Sprite(img4);}
            if(tempR1 == 5 ){spListe[i+12] = new Sprite(img5);}
            if(tempR1 == 6 ){spListe[i+12] = new Sprite(img6);}
            if(tempR1 == 7 ){spListe[i+12] = new Sprite(img7);}
            if(tempR1 == 8 ){spListe[i+12] = new Sprite(img8);}
            
            tempR1 = rand.nextInt(max - min) + min;
            if(tempR1 == 1){spListe[i+18] = new Sprite(img1);}
            if(tempR1 == 2 ){spListe[i+18] = new Sprite(img2);}
            if(tempR1 == 3){spListe[i+18] = new Sprite(img3);}
            if(tempR1 == 4 ){spListe[i+18] = new Sprite(img4);}
            if(tempR1 == 5 ){spListe[i+18] = new Sprite(img5);}
            if(tempR1 == 6 ){spListe[i+18] = new Sprite(img6);}
            if(tempR1 == 7){spListe[i+18] = new Sprite(img7);}
            if(tempR1 == 8){spListe[i+18] = new Sprite(img8);}
            
            tempR1 = rand.nextInt(max - min) + min;
            if(tempR1 == 1){spListe[i+24] = new Sprite(img1);}
            if(tempR1 == 2 ){spListe[i+24] = new Sprite(img2);}
            if(tempR1 == 3){spListe[i+24] = new Sprite(img3);}
            if(tempR1 == 4 ){spListe[i+24] = new Sprite(img4);}
            if(tempR1 == 5){spListe[i+24] = new Sprite(img5);}
            if(tempR1 == 6 ){spListe[i+24] = new Sprite(img6);}
            if(tempR1 == 7 ){spListe[i+24] = new Sprite(img7);}
            if(tempR1 == 8 ){spListe[i+24] = new Sprite(img8);}
        }    
    }
        
       
    
    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        double x, y;
        for (int i = 0; i < spListe.length;i++){
            spListe[i].setSpeed(10.0);
             spListe[i].setRichtung(x = Math.random() * 360);
            x = Math.random() * 800;
            y = Math.random() * 600;
            spListe[i].setPosition(x, y);
        }
        
        while (true)
        {
            for (int i = 0; i < spListe.length;i++){
                spListe[i].bewege();
                if (spListe[i].berührtOben(window)  || spListe[i].berührtUnten(window)){
                    spListe[i].pralleAbHorizontal();
                }
                if (spListe[i].berührtLinks(window) || spListe[i].berührtRechts(window)){
                    spListe[i].pralleAbVertikal();
                }
            }
            window.clear();
            for(int i = 0; i < spListe.length;i++){
                spListe[i].draw(window);
            }
            window.paintFrame();
        }
    }
}
