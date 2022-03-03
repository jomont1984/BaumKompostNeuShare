

public class Woerterbuch{

     private Binbaum woerterbuch;


    public Woerterbuch()
    {
        woerterbuch = new Binbaum();
        einfuegen("clip","Klammer, abschneiden, anstecken" );
        einfuegen("car","Auto, Fahrzeug, Waggon" );
        einfuegen("cat","Katze" );
        einfuegen("care","Fuersorge, Sorgfalt" );
        einfuegen("cave","Hoehle, aushoehlen, einbrechen" );
        einfuegen("crab","Krabbe, Krebs, Griesgram" );
        einfuegen("coin","Muenze, auspraegen, erfinden" );
        einfuegen("cube","Wuerfel, dritte Potenz, in die dritte Potenz heben, in Wuerfel schneiden" );
        einfuegen("crow","Kraehe, Freudenschrei, frohlocken, kraehen" );
        
    
    }


    public void einfuegen(String wort, String bedeutung)
    {
        Woerterbucheintrag neuerWoerterbucheintrag;
        neuerWoerterbucheintrag = new Woerterbucheintrag(wort, bedeutung);
        woerterbuch.einfuegen(neuerWoerterbucheintrag);
    }
    

    public Datenelement suchen(String gesuchtesWort)
    {
         return woerterbuch.suchen(gesuchtesWort);
    }
    
 

    public void bedeutungSetzen(String gesuchtesWort, String bedeutungNeu){
        Woerterbucheintrag woerterbucheintrag;
        woerterbucheintrag = (Woerterbucheintrag) suchen(gesuchtesWort);
        if (woerterbucheintrag == null)
        {
            System.out.println("Eintrag existiert nicht!");
        }
        else
        {
            woerterbucheintrag.setBedeutung(bedeutungNeu);
        }
        
    }
    
    public void inorderAusgeben(){
        woerterbuch.inorderAusgeben();
    }
  
   public void preorderAusgeben(){
       woerterbuch.preorderAusgeben();
  }
  
  public void postorderAusgeben(){
      woerterbuch.postorderAusgeben();
  }
  
  public void strukturAusgeben(){
      woerterbuch.strukturAusgeben();
  }
}
