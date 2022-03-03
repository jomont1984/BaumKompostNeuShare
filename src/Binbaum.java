
public class Binbaum{
  Baumelement wurzel;
  
  public Binbaum(){
    wurzel = new Abschluss();
  }
  
  public Datenelement suchen(String suchSchluessel){
       return wurzel.suchen(suchSchluessel);
  }
  
  public boolean istVorhanden(String suchSchluessel){
       return wurzel.istVorhanden(suchSchluessel);
  }
  
  public void einfuegen(Datenelement dNeu){
      wurzel = wurzel.einfuegen(dNeu);
  }
  
  public void inorderAusgeben(){
      wurzel.inorderAusgeben();
  }
  
   public void preorderAusgeben(){
      wurzel.preorderAusgeben(); 
  }
  
  public void postorderAusgeben(){
      wurzel.postorderAusgeben();
  }
  
  public void strukturAusgeben(){
      wurzel.strukturAusgeben(0);
  }
  

}
