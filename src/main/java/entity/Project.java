package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="project")
@Data  //getter setter için.
@NoArgsConstructor //boş bi constructor oluşturuyor.
@AllArgsConstructor //dolu constructor oluşturur.
@ToString   //nesnenin bi ToString metodunu ovveride ediyo!.
@EqualsAndHashCode  //equals ve hashcode metodunu ovveride ediyo!.
@Getter 
@Setter

public class Project extends BaseEntity {
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public User getManager() {
		return manager;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="project_code",length=30,unique=true)
	private String projectCode;
	
	@Column(name="project_name",length=300)
	private String projectName;
	
	@JoinColumn(name="manager_user_id")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private User manager;

}
