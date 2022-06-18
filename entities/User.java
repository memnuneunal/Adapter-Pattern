package entities;

public class User {
	
	Long id;
	String name;
	String surname;
	Long identityNumber;
	
	int birtdate;
	public User() {
		super();
	}
	public User(Long id, String name, String surname, Long identityNumber, int birtdate) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.birtdate = birtdate;
	}
	public User( String name, String surname, Long identityNumber, int birtdate) {
		super();
		
		this.name = name;
		this.surname = surname;
		this.identityNumber = identityNumber;
		this.birtdate = birtdate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Long getidentityNumber() {
		return identityNumber;
	}
	public void setidentityNumber(Long identityNumber) {
		this.identityNumber = identityNumber;
	}
	public int getBirtdate() {
		return birtdate;
	}
	public void setBirtdate(int birtdate) {
		this.birtdate = birtdate;
	}
	
	

}
