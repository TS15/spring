package spring.project.domain;


public class addres  {

	private Long addres_id;

	private String addres;
	
	private String addres2;
	
	private String district;
	
	private Long city_id;
	
	private String postal_code;
	
	private String phone;
	
	private String location;

	private String last_update;
// Addres id
	public Long getAddresId() {
		return this.addres_id;
	}

	public void setId(Long id) {
		this.addres_id = id;
	}
// Addres
	public String getAddres() {
		return this.addres;
	}
	
	public void setAddres(String addres) {
		this.addres = addres;
	}
// Addres 2
	public String getAddres2() {
		return this.addres2;
	}
		
	public void setAddres2(String addres2) {
		this.addres2 = addres2;
	}
// District 
		public String getDistrict() {
			return this.district;
		}
		
		public void setDistrict(String district) {
			this.district = district;
		}
// City id
		public Long getCity_id() {
			return this.city_id;
		}
		
		public void setCity_id(Long city_id) {
			this.city_id = city_id;
		}
// Postal code
		public String getPostal_code() {
			return this.postal_code;
		}
		
		public void setPostal_code(String postal_code) {
			this.postal_code = postal_code;
		}
// Phone
		public String getPhone() {
			return this.phone;
		}
				
		public void setPhone(String phone) {
			this.phone = phone;
		}
// Location
		public String getLocation() {
			return this.location;
		}
						
		public void setLocation(String location) {
			this.location = location;
		}
		
//Last update
	public String getLast_update() {
		return this.last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
}