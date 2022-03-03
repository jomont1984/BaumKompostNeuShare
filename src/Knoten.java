
public class Knoten extends Baumelement{
  Baumelement linkerNachfolger;
  Baumelement rechterNachfolger;
  Datenelement daten;
  
  public Knoten(Datenelement dNeu){
    daten = dNeu;
    linkerNachfolger = new Abschluss();
    rechterNachfolger = new Abschluss();
  }
  
  public Datenelement suchen(String suchSchluessel){
    if(daten.schluesselIstGleich(suchSchluessel)){
      return daten;
    }
    else{
      if(daten.schluesselIstGroesserAls(suchSchluessel)){  
          return linkerNachfolger.suchen(suchSchluessel);
      }
      else{
          return rechterNachfolger.suchen(suchSchluessel);
      }
        
    }
  }
  
  public boolean istVorhanden(String suchSchluessel){
    if(daten.schluesselIstGleich(suchSchluessel)){
      return true;
    }
    else{
      if(daten.schluesselIstGroesserAls(suchSchluessel)){  
          return linkerNachfolger.istVorhanden(suchSchluessel);
      }
      else{
          return rechterNachfolger.istVorhanden(suchSchluessel);
      }
        
    }
  }
  
  public Baumelement einfuegen(Datenelement dNeu){
    if (daten.istGleich(dNeu)){
      System.out.println("Eintrag schon vorhanden.");
      
    }
    else{
      if(daten.istGroesserAls(dNeu)){
          linkerNachfolger = linkerNachfolger.einfuegen(dNeu);
      }
      else{
          rechterNachfolger = rechterNachfolger.einfuegen(dNeu);
      } 
    }
    return this;
  }
  
  public Datenelement getDaten(){
    return daten;
  }
  
  public void setDaten(Datenelement dNeu){
     daten = dNeu;
  }
  
  public void inorderAusgeben(){
        linkerNachfolger.inorderAusgeben();
        daten.informationAusgeben(); 
        rechterNachfolger.inorderAusgeben();
    }

     

  public void preorderAusgeben(){
        daten.informationAusgeben(); 
        linkerNachfolger.preorderAusgeben();
        rechterNachfolger.preorderAusgeben();
  }
  
  public void postorderAusgeben(){
        linkerNachfolger.postorderAusgeben();
        rechterNachfolger.postorderAusgeben();
        daten.informationAusgeben(); 
  }

  public void strukturAusgeben(int tiefe){
        String s = "";
        for(int i = 1; i<=4*tiefe; i++){
            s = s+" ";
        }
        s=s+(daten.schluesselAlsStringGeben());
        System.out.println(s);
        linkerNachfolger.strukturAusgeben(tiefe+1);
        rechterNachfolger.strukturAusgeben(tiefe+1);
  }
    
    
}
