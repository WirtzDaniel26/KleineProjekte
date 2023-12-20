import pm.gamewindow.*;

/*
 * Bildschirmschoner: Sprites bewegen sich auf Kreisbahnen
 * (Name, Datum)
 */
public class Drehen
{
    private GameWindow window;
    private Sprite[][] spriteList;
    int zeilen = 7, spalten = 7;     // Anzahl Zeien / Spalten des 2D-Arrays
    private GameImage img1;
    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Drehen()
    {
        img1   = new GameImage("images/ghost white 100x100.png");
        img1.setScale(0.3);
        
        window = new GameWindow(50,50, 700, 700, "Array Referenzen Dreen");
        
        spriteList = new Sprite[zeilen][spalten];
        for(int i = 0;zeilen > i;i++){
            for(int j = 0;spalten > j;j++){
                 spriteList[i][j] = new Sprite(img1);
            }
        }
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        double x = 20, y = 0;
        for(int i = 0;zeilen > i;i++){
            for(int j = 0;spalten > j;j++){
                 spriteList[i][j].setPosition(x,y);
                 spriteList[i][j].setSpeed(5.0);
                 x += 100;
            }
            x = 20;
            y += 100;
        }
        
        double richtung = 18;
        while (true)
        {
            for(int i = 0;zeilen > i;i++){
              for(int j = 0;spalten > j;j++){
                 spriteList[i][j].setRichtung(richtung);
                 spriteList[i][j].bewege();
              }
            
            }
            richtung += 18;
            
            if( richtung > 360){richtung = 18; } 
            
            window.clear();
            for(int i = 0;zeilen > i;i++){
              for(int j = 0;spalten > j;j++){
                 spriteList[i][j].draw(window);
                 
              }
           
            }
             window.paintFrame();
        }
    }
}
