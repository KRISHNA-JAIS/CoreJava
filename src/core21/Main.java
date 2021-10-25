package core21;

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        int i,num,id;
        String  Name,Designation;
        Employees empObj[] = new Employees[4];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Employees");
        num = in.nextInt();
        for(i=0 ; i<=num-1 ; i++){
            System.out.println("Enter EmployeeId");
            id = in.nextInt();
            System.out.println("Enter EmployeesName");
            Name = in.next();
            System.out.println("Enter EmployeeDesignation");
            Designation = in.next();
            empObj[i] = new Employees(id , Name , Designation);
        }
        for(i=0 ; i<=num-1 ; i++)
        {
            System.out.println("The " + i + 1 + " EmployeeId is " + empObj[i].getEmpId());
            System.out.println("The " + i + 1 + " EmployeeName is " + empObj[i].getEmpName());
            System.out.println("The " + i + 1 + " EmployeeDesignation is " + empObj[i].getEmpDesignation());
        }

    }
}
