package proba;
import java.util.ArrayList;


public class Faculty {
	List<Student>  studenst= new ArrayList<Student>();
	String Name;
	public Faculty(List<Student> studenst, String name) {
		super();
		this.studenst = studenst;
		Name = name;
	}
	public List<Student> getStudenst() {
		return studenst;
	}
	public void setStudenst(List<Student> studenst) {
		this.studenst = studenst;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Faculty [Name=" + Name + "]";
	}
	
	
}
