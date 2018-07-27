
public class EmployeeBo {
	public void calincomeTax(EmployeeVo ee)
	{
	double incomeTax=ee.getAnnualincome()*0.3;
	ee.setIncometax(incomeTax);
	
	}

}
