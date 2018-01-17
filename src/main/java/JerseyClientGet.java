

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.util.Scanner;
import org.json.*;
import com.fasterxml.jackson.*;

public class JerseyClientGet {
	
  public static void main(String[] args) {
	  
      AdresseNote an1 = new AdresseNote ("8", "quai%20de%20la%20Verdure", "44400", "Rez�"); // Bouchon de donn�es mais finalement inutile
      AdresseNote an2 = new AdresseNote ("34", "rue%20du%20Camp%20de%20Molle", "37000", "Tours");
      AdresseNote an3 = new AdresseNote ("80", "rue%20des%20Pontreaux", "44340", "Bouguenais");
      AdresseNote an4 = new AdresseNote ("34", "rue%20Julien%20Douillard", "44400", "Rez�");
      AdresseNote an5 = new AdresseNote ("32", "rue%20Charles%20Rivi�re", "44400", "Rez�");
      
      int recommencer = 0; // D�claration des variable, la boucle en cas d'erreur, les recherche pour instaucier l'objet
      String recherche11 = null;
      String recherche22 = null;
      String recherche33 = null;
      String recherche44 = null;
      
      while (recommencer != 1) // Boucle pour recommencer en cas d'erreur
      {
      
      Scanner sc1 = new Scanner ( System.in); 	// S�paration des diff�rents �lements pour �viter d'imposer un format d'�criture
      System.out.println("Entrez le num�ro de votre adresse. \n");
      String recherche1 = sc1.nextLine();
      recherche11 = recherche1.replace(" ", "%20"); // On remplace les espaces pour le caract�re qu'attends l'API
      
      Scanner sc2 = new Scanner ( System.in); 	
      System.out.println("Entrez la rue avec son type. \n");
      String recherche2 = sc2.nextLine();
      recherche22 = recherche2.replace(" ", "%20");

      Scanner sc3 = new Scanner ( System.in); 	
      System.out.println("Entrez le code postal. \n");
      String recherche3 = sc3.nextLine();
      recherche33 = recherche3.replace(" ", "%20");
      
      Scanner sc4 = new Scanner ( System.in); 	
      System.out.println("Entrez la ville. \n");
      String recherche4 = sc4.nextLine();
      recherche44 = recherche4.replace(" ", "%20");
      
      System.out.println("Du coup, votre adresse est " + recherche1 + " " + recherche2 + " " + recherche3 + " " + recherche4 + ". \n"); // Rappel des donn�es not�es
      
      System.out.println("Cette adresse est correct? Tapez 1 pour passer � la suite. \n"); // Confirmation demand�e
      Scanner sc5 = new Scanner (System.in);
      recommencer = sc5.nextInt();
      
      sc1.close(); // Fermeture pour �viter les fuites de m�moires
      sc2.close();
      sc3.close();
      sc4.close();
      sc5.close();
      
      }
      
      AdresseNote an6 = new AdresseNote(recherche11,recherche22,recherche33,recherche44); // On instance l'object
      

	try {

		Client client = Client.create();

		WebResource webResource = client
		   .resource("https://api-adresse.data.gouv.fr/search/?q=" + an6.AdresseAffiche() + "&limit=5"); // Envoi de la requ�te avec utilisation de l'objet + 
																										// utilisation de la m�thode pour mettre l'adresse sur une ligne +
																										// d�limitation du nombre de r�sultat max

		ClientResponse response = webResource.accept("application/json")
                   .get(ClientResponse.class);

		if (response.getStatus() != 200) {
		   throw new RuntimeException("Failed : HTTP error code : "
			+ response.getStatus());
		}

		String output = response.getEntity(String.class); // R�cup�ration du JSON dans un String

		System.out.println("Output from Server .... \n");
//		System.out.println(output);
		
		JSONObject AdresseCori = new JSONObject(output); // On instance l'objet
		
		System.out.println(AdresseCori); //Affichage du Json
//		System.out.println(AdresseCori.get("type").toString());
		
		
		AdresseCor ac1 = objectMapper.readValue(AdresseCori, AdresseCor.class);
		
		
// 		System.out.println(getKeys("features"));
	}
		
		
		catch (Exception e) 
		
		{

		e.printStackTrace();

	  }

	}

}