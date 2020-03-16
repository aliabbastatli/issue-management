package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data //kodun sade kalmasını sağlıyor.
@MappedSuperclass
@Getter 
@Setter
public abstract class BaseEntity implements Serializable {//Bu nesnenin diske yazılması için.
	
	@Column(name="created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;
	
	@Column(name="created_by",length=100)
	private String createdBy;
	
	@Column(name="update_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;
	
	@Column(name="updated_by",length=100)
	private String updatedBy;
	
	@Column(name="status")
	private Boolean status;
	
	

}
