package spring.project.domain;


public class address  {

	private Long address_id;

	private String address;
	
	private String address2;
	
	private String district;
	
	private String postal_code;
	
	private String phone;

	private String last_update;
// Address id
	public Long getAddressId() {
		return this.address_id;
	}

	public void setId(Long id) {
		this.address_id = id;
	}
// Address
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
// Address 2
	public String getAddress2() {
		return this.address2;
	}
		
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
// District 
		public String getDistrict() {
			return this.district;
		}
		
		public void setDistrict(String district) {
			this.district = district;
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

//Last update
	public String getLast_update() {
		return this.last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
}