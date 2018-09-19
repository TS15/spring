package spring.project.domain;


public class actor  {

	private Long actor_id;

	private String first_name;

	private String last_name;

	private String last_update;

	public Long getActorId() {
		return this.actor_id;
	}

	public void setId(Long id) {
		this.actor_id = id;
	}

	public String getfirst_Name() {
		return this.first_name;
	}
	
	public void setFirstName(String name) {
		this.first_name = name;
	}
	public String getLastName() {
		return this.last_name;
	}
	public void setLastName(String name) {
		this.last_name = name;
	}
	public String getLast_update() {
		return this.last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
}