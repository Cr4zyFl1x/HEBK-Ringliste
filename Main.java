import java.util.Scanner;

class Main {
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Person[] personen = {
			new Person("Titus Ellertmann", 17),
			new Person("Anton Sack", 150),
			new Person("Kanye West", 10),
      new Person("Tonald Drump", 44),
      new Person("Doe Jiden", 1000),
      new Person("Mangela Aerkel", 33),
      new Person("Coolio", 69),
      new Person("Siggie Balls", 5),
      new Person("3Pac", 89),
      new Person("Host jan Veiden", 292),
      new Person("KING jon un", 332),
      new Person("Axel Schweiß", 45),
      new Person("Fixie Hartmann", 198),
      new Person("Mike Oxlong", 420),
      new Person("Florian KV", 54),
      new Person("Sarek Multe Schesum", 78),
      new Person("Feuerwehrmann Sam", 19),
      new Person("Elias Plöppering", 80),
      new Person("Beton Mischer", 50),
      new Person("Asterix", 12),
			new Person("Wilma Bier", 8),
			new Person("Martin Router King", 66),
			new Person("Alice im WLANd", 9),
      new Person("Mongulu Buschkid", 152),
      new Person("Jesus Christ", 33),
      new Person("Schwanzus Longus", 45),
      new Person("Ser Gey", 30),
		};

		Ringliste r;
		int n;
		while(true) {
			r = new Ringliste(personen);
			System.out.println("Bitte geben Sie eine der natürlichen Zahlen angehörige Zahl ein.	(es gilt Zahl ∈ ℕ)");
			n = sc.nextInt();
			if(n > 0) {
				r.spiel(n);
			}
		}
  }
}