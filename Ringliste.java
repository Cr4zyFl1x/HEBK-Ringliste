public class Ringliste {

	private Knoten first;

	public Ringliste(Person[] pPersonen) {

		// ADD PERSONS
		for (Person p : pPersonen) {
			this.add(p);
		}

		// GET LAST
		Knoten tmp = first;
		while (tmp.getNachfolger() != null) {
			tmp = tmp.getNachfolger();
		}
		tmp.setNachfolger(first);
	}

	// ADD ENTRIES (USE ONLY ONCE)
	private void add(Person pPerson) {
		if (first == null) {
			first = new Knoten(pPerson);
			return;
		}
		Knoten tmp = first;
		while (tmp.getNachfolger() != null) {
			tmp = tmp.getNachfolger();
		}
		tmp.setNachfolger(new Knoten(pPerson));
	}

	// Löscht
	public Knoten remove(Knoten kn1, Knoten kn2) {
		System.out.println(kn2.getInhalt().getName() + " ist raus!");
		kn1.setNachfolger(kn2.getNachfolger());
		return kn1.getNachfolger();
	}

	// spiel
	public void spiel(int pN) {
		Knoten tmp = first;

		// nur noch einer da ist, der sich selbst als Nachfolger hat
		while (tmp.getNachfolger() != tmp) {
			for (int i = 1; i < pN - 1; i++) {
				tmp = tmp.getNachfolger();
			}

			if (pN == 1) {
				while (tmp.getNachfolger() != first) {
					System.out.println(tmp.getInhalt().getName() + " ist raus!");
					tmp = tmp.getNachfolger();
				}
				this.announceWinner(tmp);
				return;
			}

			// this.remove(tmp, tmp.getNachfolger());
			tmp = this.remove(tmp, tmp.getNachfolger());
		}

		// Der Gewinner: (letztes verbl. Elem. (hat sich selbst als Nachfolger))
		this.announceWinner(tmp);
	}

	public void announceWinner(Knoten winner) {
		System.out.println();
		System.out.println("---------------------->> Gewinner <<----------------------");
		System.out.println("Der Gewinner ist... (*Trommelwirbel*)");
		System.out.println(winner.getInhalt().getName() + "!");
		System.out.println("---------------------->> Gewinner <<----------------------");
	}
}