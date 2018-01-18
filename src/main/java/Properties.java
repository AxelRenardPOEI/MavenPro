import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// @JsonIgnoreProperties(ignoreUnknown=true)

public class Properties {
	public String housenumber;
	public String score;
	public String street;
	public String postcode;
	public String city;
	
	public Properties(String housenumber, String street, String postcode, String city, String score) {
		this.housenumber=housenumber;
		this.score=score;
		this.street=street;
		this.postcode=postcode;
		this.city=city;
	}
	
 	public Properties() {
		
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
	
	public String AdresseAffiche2()
	{
		String AdresseRecherche2 = this.getHousenumber() + " " + this.getStreet() + " " + this.getPostcode() + " " + this.getCity() + " " + this.getScore();
		return AdresseRecherche2;
		
	}
	
	

}
