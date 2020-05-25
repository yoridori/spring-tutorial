package mrs.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usr")
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String userId;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private RoleName roleName;

	public String getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public RoleName getRoleName() {
		return roleName;
	}

}
