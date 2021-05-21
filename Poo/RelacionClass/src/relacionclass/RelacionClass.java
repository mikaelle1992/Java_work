
package relacionclass;

/**
 *
 * @author Mikaelle
 */
public class RelacionClass {

   
    public static void main(String[] args) {
       Lutador lut[] = new Lutador [6];
        lut[0] = new Lutador("Pretty Boy", " Portugal", 29, 1.80f, 67.9f, 10, 3, 2);
        lut[1] = new Lutador("Chaves", " México", 33, 1.78f, 75.7f, 8, 2, 4);
        lut[2] = new Lutador("Godzilla", " Grécia", 27, 1.82f, 71.3f, 8, 2, 4);
        lut[3] = new Lutador("Kong", " Brasil", 32, 1.69f, 81.9f, 8, 2, 4);
        lut[4] = new Lutador("Narut", " África", 28, 1.70f, 97.8f, 8, 2, 4);
        lut[5] = new Lutador("Puts", " Paraguai", 28, 1.87f, 102.5f, 8, 2, 4);
       
       for(int i = 0; i <lut.length;i ++){
            lut[i].apresentar();
            lut[i].status();
       }
       
       Luta UEC1 = new Luta();
       UEC1.marcarLuta(lut[1], lut[2]);
       UEC1.lutar();
       
       Luta UEC2 = new Luta();
       UEC2.marcarLuta(lut[1], lut[1]);
       UEC2.lutar();
    }
    
}
