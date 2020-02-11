public class EmployeeDetails 
{
	int empId;
	String empName;
	float empSal;

	public EmployeeDetails(){}
	public EmployeeDetails(int empId, String empName, float empSal)
	{
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public void calulateSalary()
	{
		System.out.println("Employee Salary :"+(empSal+2000));
	}

	public static void main(String[] args) 
	{
		EmployeeDetails ed = new EmployeeDetails();
		ed.calculateSalary();

		EmployeeDetails ed1 = new EmployeeDetails(1001, "Raju", 25000.50f);
		ed1.calculateSalary();
	}
}
