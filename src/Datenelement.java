

public interface Datenelement {

    public void informationAusgeben();
    

    public boolean istKleinerAls(Datenelement dVergleich);
    
    public boolean istGroesserAls(Datenelement dVergleich);
    
    public boolean istGleich(Datenelement dVergleich);
    

    public boolean schluesselIstKleinerAls(String vergleichsSchluessel);
    
    public boolean schluesselIstGroesserAls(String vergleichsSchluessel);


    public boolean schluesselIstGleich(String s);
    
    public String schluesselAlsStringGeben ();
}
