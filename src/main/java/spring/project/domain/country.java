package spring.project.domain;


public class country  {

	private Long country_id;

	private String country;

	private String last_update;

// Country id
	public Long getCountryId() {
		return this.country_id;
	}

	public void setCountryId(Long id) {
		this.country_id = id;
	}
// Country
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
// Last update
	public String getLast_update() {
		return this.last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
}