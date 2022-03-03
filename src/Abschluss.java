
public class Abschluss extends Baumelement{
  
  public Abschluss(){ 
     super();
  }

  public Datenelement suchen(String suchSchluessel){
    return null;
  }
  
  public boolean istVorhanden(String suchSchluessel){
    return false;
  }
  
  public Baumelement einfuegen(Datenelement dNeu){
      Knoten kNeu = new Knoten(dNeu);
      return kNeu;
  }
  
  public Datenelement getDaten(){
    return null;
  }
  
  public void setDaten(Datenelement dNeu){
  }
  
  public void inorderAusgeben(){   
  }
  
   public void preorderAusgeben(){   
  }
  
  public void postorderAusgeben(){   
  }
  
  public void strukturAusgeben(int tiefe){
  }
  

}
