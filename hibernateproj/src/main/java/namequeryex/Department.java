package namequeryex;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.Query;

@Entity
@NamedQueries({
	@NamedQuery(name="findDepartmentByName",query="from Department d where d.Dname=:Dname")
})
public class Department {

	@Id
	private int Id;
	private String Dname;
	private String Dlocation;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public String getDlocation() {
		return Dlocation;
	}
	public void setDlocation(String dlocation) {
		Dlocation = dlocation;
	}
	public Department(int id, String dname, String dlocation) {
		super();
		Id = id;
		Dname = dname;
		Dlocation = dlocation;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Department [Id=" + Id + ", Dname=" + Dname + ", Dlocation=" + Dlocation + "]";
	}
	
}
