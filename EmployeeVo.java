
public class EmployeeVo {
int empid;
public EmployeeVo(int empid, String name, double annualincome) {
	super();
	this.empid = empid;
	this.name = name;
	this.annualincome = annualincome;
	this.incometax = incometax;
}
String name;
double annualincome;
double incometax=0;
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empid+" "+this.name+" "+this.annualincome+" "+this.incometax;
	}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	EmployeeVo other = (EmployeeVo) obj;
	if (Double.doubleToLongBits(annualincome) != Double.doubleToLongBits(other.annualincome))
		return false;
	if (empid != other.empid)
		return false;
	if (Double.doubleToLongBits(incometax) != Double.doubleToLongBits(other.incometax))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(annualincome);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + empid;
	temp = Double.doubleToLongBits(incometax);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getAnnualincome() {
	return annualincome;
}
public void setAnnualincome(double annualincome) {
	this.annualincome = annualincome;
}
public double getIncometax() {
	return incometax;
}
public void setIncometax(double incometax) {
	this.incometax = incometax;
}


}
