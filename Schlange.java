import pm.gamewindow.*;

/*
 * Sprites formen eine Schlange, die dem Mauszeiger folgt
 * (Name, Datum)
 */
public class Schlange
{
    private GameWindow window;
    private GameImage image;
    Sprite[] spList;

    /*
     * Erzeugt Grafikfenster, lädt Bilder, erzeugt Sprites
     */
    public Schlange()
    {
        image = new GameImage("images/bubble 100x100.png");
        window = new GameWindow(100, 100, 1200, 800, "Schlange");
        
        spList = new Sprite[100];
        
        for(int i = 0;i < spList.length;i++){
            spList[i] = new Sprite(image);
        }
    }

    /*
     * Ablauf des Spiels
     */
    public void main()
    {
        for(int i = 0;i < spList.length;i++){
            spList[i].setPosition(window.getWidth()/2-spList[i].getWidth()/2, window.getHeight()/2-spList[i].getHeight()/2);
            spList[i].setSpeed(5.0);
        }   
        
        while(true){
            double x = (double) window.getMouseX(),y = (double) window.getMouseY();
            
            spList[0].dreheZu(x, y);
            spList[0].bewege();
            
             for(int i = 1; i < spList.length;i++){
                    spList[i].dreheZu(spList[i-1].getX(), spList[i-1].getY());
                    if(15 <spList[i].getAbstand(spList[i-1])){
                        spList[i].bewege();
                    }
            }
            
            window.clear();
            for(int i = 0; i < spList.length;i++){
                    spList[i].draw(window);
            }
            window.paintFrame();
        }
    }
}
