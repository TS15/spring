package spring.project.domain;


public class category  {

	private Long category_id;

	private String name;
	
	private String last_update;
// Category id
	public Long getCategoryId() {
		return this.category_id;
	}

	public void setCategoryId(Long id) {
		this.category_id = id;
	}
// Name
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
//Last update
	public String getLast_update() {
		return this.last_update;
	}

	public void setLast_update(String last_update) {
		this.last_update = last_update;
	}
	
}