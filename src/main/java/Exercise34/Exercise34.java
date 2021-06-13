package Exercise34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

public class EmployeeList
{
    private String[] employees;
    private int totalEmployees;

    public EmployeeList()
    {
        employees = new String[8];
        employees[0] ="Elon Musk";
        employees[1] = "Angelina Jolie";
        employees[2] = "Benny Blanco";
        employees[3] = "Dave Portnoy";
        employees[4] = "Scarlett Johansson";
        employees[5] = "Samuel L. Jackson";
        employees[6] = "John Travolta";
        employees[7] = "Ellen Degeneres";
       totalEmployees = employees.length;
    }

    public String getEmployeeList()
    {
        String list = "";

        for(int i = 0; i < totalEmployees; i++)
        {
            list += employees[i] + '\n';
        }
        return list;
    }

    public void removeEmployee(String employeeName)
    {
        boolean found = false;

        for(int i = 0; i < totalEmployees && ! found; i++)
        {
            if(employees[i].equals(employeeName))
            {
                found = true;
                copyArrayWithoutEmployee(i);
            }
        }

        if (! found)
        {
            throw new IllegalArgumentException("That employee does not exist.");
        }
    }

    private void copyArrayWithoutEmployee(int employeeIndexToRemove)
    {
        int numberOfElementsToCopy = totalEmployees - (employeeIndexToRemove + 1);
        System.arraycopy(employees, employeeIndexToRemove + 1, employees, employeeIndexToRemove, numberOfElementsToCopy);
        totalEmployees--;
    }
}