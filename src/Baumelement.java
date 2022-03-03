
abstract class Baumelement{
  public abstract Datenelement suchen(String suchSchluessel);

  public abstract boolean istVorhanden(String suchSchluessel);

  public abstract Baumelement einfuegen(Datenelement dNeu);

  public abstract Datenelement getDaten();
  
  public abstract void setDaten(Datenelement dNeu);
  
  public abstract void inorderAusgeben();
  
  public abstract void preorderAusgeben();
  
  public abstract void  postorderAusgeben();
  
  public abstract void strukturAusgeben(int tiefe);

}
