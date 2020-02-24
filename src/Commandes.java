
public class Commandes {

	public String client;
	public String plats;
	public int quantite;
	public double tot;

	public Commandes(String pClient, String pPlats, int pQuantite) {
		super();
		this.client = pClient;
		this.plats = pPlats;
		this.quantite = pQuantite;

	}

	public String getClient() {

		return this.client;

	}

	public void setClient(String client) {

		this.client = client;

	}

	public double prixTotal(int quantite, String plats) {
		double prix = 0;
		double totale;

		switch (plats) {

		case "Poutine":
			prix = 10.50;
			break;
		case "Frites":
			prix = 2.50;
			break;
		case "Repas_Poulet":
			prix = 15.75;
			break;
		}

		totale = prix * quantite;

		return totale;
	}

	public double modif(double nul) {

		tot = nul;
		return tot;
	}

	public void afficher() {
		System.out.print(this.client + " " + prixTotal(quantite, plats) + "$" + "\n");

	}

	public void affichernv() {
		System.out.print(this.client + " " + modif(tot) + "$" + "\n");

	}
}
