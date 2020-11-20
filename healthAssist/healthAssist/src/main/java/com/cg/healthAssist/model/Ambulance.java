package com.cg.healthAssist.model;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity

public class Ambulance {
	@Id
	
	private Long id;
	private String vechno;
    private String Drivername;
   
	
	public Ambulance(Long id, String vechno, String drivername) {
		super();
		this.id = id;
		this.vechno = vechno;
		this.Drivername = drivername;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getVechno() {
		return vechno;
	}
	public void setVechno(String vechno) {
		this.vechno = vechno;
	}
	public String getDrivername() {
		return Drivername;
	}
	public void setDrivername(String drivername) {
		Drivername = drivername;
	}
	@Override
	public String toString() {
		return "Ambulance [id=" + id + ", vechno=" + vechno + ", Drivername=" + Drivername + "]";
	}
	
	
}
