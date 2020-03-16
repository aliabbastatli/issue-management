package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="issue_history")
@Data  //getter setter için.
@NoArgsConstructor //boş bi constructor oluşturuyor.
@AllArgsConstructor //dolu constructor oluşturur.
@ToString   //nesnenin bi ToString metodunu ovveride ediyo!.
@EqualsAndHashCode  //equals ve hashcode metodunu ovveride ediyo!.

public class IssueHistory extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="description",length=1000)
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date")
	private Date date;
	
	@JoinColumn(name="issue_id")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private Issue issue;
	
	@Column(name="issue_status")
	@Enumerated(EnumType.STRING)
	private IssueStatus issueStatus;
	
	@Column(name="details",length=4000)
	private String details;
	
	
	@JoinColumn(name="assigne_user_id")
	@ManyToOne(optional=true,fetch=FetchType.LAZY)
	private User assignee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public IssueStatus getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(IssueStatus issueStatus) {
		this.issueStatus = issueStatus;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public User getAssignee() {
		return assignee;
	}

	public void setAssignee(User assignee) {
		this.assignee = assignee;
	}
	

}
