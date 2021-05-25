
package zoologico;

public class Zoologico {

    
    public static void main(String[] args) {
       Cachorro c1 = new Cachorro ();
       Lobo l1 = new Lobo();
       
       l1.emitirSom();
        System.out.println();
       c1.emitirSom();
       c1.reagir("ola");
       c1.reagir("cahorro teimoso");
       c1.reagir(11, 45);
       c1.reagir(true);
    }
    
}
