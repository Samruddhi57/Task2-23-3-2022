class encapsulation
{
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter method
    public int getEmpSSN()
    {
        return ssn;
    }
    public String getEmpName()
    {
        return empName;
    }
    public int getEmpAge()
    {
        return empAge;
    }
    public void setEmpSSN(int newValue)
    {
        ssn = newValue;
    }
    public void setEmpAge(int newValue)
    {
        empAge = newValue;
    }
    public void setEmpName(String newValue)
    {
        empName = newValue;
    }

}

public class encapsulationDemo
{
    public static void main(String[] args) 
    {
        encapsulation obj = new encapsulation();
        obj.setEmpName("Samruddhi");
        obj.setEmpAge(21);
        obj.setEmpSSN(1001);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee Age: " + obj.getEmpAge());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
    }
}
