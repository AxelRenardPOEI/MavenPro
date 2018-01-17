
public class AdresseCor {
	public String housenumber;
	public String street;
	public String postcode;
	public String city;
	public String score;
	
	public AdresseCor(String housenumber, String street, String postcode, String city, String score) {
		this.housenumber=housenumber;
		this.street=street;
		this.postcode=postcode;
		this.city=city;
		this.score=score;
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
	
	

}
