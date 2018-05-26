package TestExample1;

public class EmpBusinessLogic 
{
	//Calculate the yearly salary of employee
	public double  calculateYearlySalary(EmployeeDetails employeeDetails)
	{
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary()*12;
			
		return yearlySalary;
	}
	
	// Calculate the appraisal amount of employee
	public double calculateAppraisal(EmployeeDetails employeeDetails)
	{
		double apprisal = 0;
		if (employeeDetails.getMonthlySalary() < 10000)
			apprisal = 500;
		else
			apprisal = 1000;
		
		return apprisal;
		
	}

}
