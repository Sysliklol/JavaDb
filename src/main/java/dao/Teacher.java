package dao;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@NamedQueries({
		@NamedQuery(name = "findPhones", query="SELECT DISTINCT t.cell_phone FROM Teacher t")
})
@Table(name="teachers")
public class Teacher {
	@Id
	@GeneratedValue
	private int teacherId; 
	
	@Column(name="firstname")
	private String firstname;
	     
	@Column(name="lastname")
	private String lastname;
	     
	@Column(name="birth_date")
	private Date birthDate;
	    
	@Column(name="cell_phone")
	private String cellphone;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	
	
	 
}
