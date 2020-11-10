public class Knoten{
  private Person inhalt;
  private Knoten nachfolger;

  //Konstruktor
  public Knoten(Person pPerson){
      this.inhalt = pPerson;
  }

  //get/set Methoden
  public Person getInhalt(){
      return inhalt;
  }

  public Knoten getNachfolger(){
      return nachfolger;
  }

  public void setNachfolger(Knoten nachfolger) {
      this.nachfolger = nachfolger;
  }

  public void setInhalt(Person pInhalt){
      inhalt = pInhalt;
  }

}