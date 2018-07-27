import java.util.Comparator;

 public class EmployeeSort implements Comparator
{
public int compare(Object o1, Object o2)
{
	EmployeeVo e1=(EmployeeVo)o1;
	EmployeeVo e2=(EmployeeVo)o2;
	int retValue=0;
	if(e1.getIncometax()<e2.getIncometax())
	{
	retValue=1;
	}
	else
	{
		if(e1.getIncometax()>e2.getIncometax())
		{
		retValue=-1;
		}	
		else
		{
			retValue=0;
		}}
	return retValue;
	}
}
