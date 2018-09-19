package spring.project.domain;


public class city  {

	private Long city_id;

	private String city;

	private Long country_id;

	private String last_update;

// City id
	public Long getCityId() {
		return this.city_id;
	}

	public void setCityId(Long id) {
		this.city_id = id;
	}
// City
	public String getCity() {
		return this.city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
// Country id
	public Long getCountryId() {
		return this.country_id;
	}
	public void setCountryId(Long country_id) {
		this.country_id = country_id;
	}
// Last update
	public String getLast_update() {
		return this.last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
}