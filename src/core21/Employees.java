package core21;



import java.util.Scanner;

public class Employees {
    private int EmpId;
    private String EmpName;
    private String EmpDesignation;
    Employees(int id , String Name , String Designation)
    {
        EmpId = id;
        EmpName = Name;
        EmpDesignation = Designation;
    }
    public int getEmpId()
    {
        return EmpId;
    }
    public String  getEmpName()
    {
        return EmpName;
    }
    public String  getEmpDesignation()
    {
        return EmpDesignation;
    }
    public void showData(){
        System.out.print("EmpId = "+EmpId + "  " + " Employee Name = "+EmpName);
        System.out.println();
    }
}
