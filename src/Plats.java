
public class Plats {

	
	public static String nom;
	public static double prix;
	
	
	public Plats(String nom, double prix) {
		
		Plats.nom = nom;
		Plats.prix = prix;
	}
	
	
	public String ToString() {
		
		return nom + prix;
	}
	
	public String getNom() {
		return Plats.nom;
	}
	


	public void afficher() {
			
			System.out.println(nom +" "+ prix);
	
	}
	
	
}
