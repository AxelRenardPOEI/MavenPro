import java.util.Scanner;

public class AdresseNote {
	public String numero;
	public String rue;
	public String codepostal;
	public String ville;
	
	public AdresseNote(String numero, String rue, String codepostal, String ville) {
		this.numero = numero;
		this.rue=rue;
		this.codepostal=codepostal;
		this.ville=ville;
	}

	public AdresseNote(Scanner sc6) {
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodepostal() {
		return codepostal;
	}

	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String AdresseAffiche()
	{
		String AdresseRecherche = this.getNumero() + "%20" + this.getRue() + "%20" + this.getCodepostal() + "%20" + this.getVille();
		return AdresseRecherche;
		
	}
	
	

}
