package Exercise40;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

import Excerise39.Employee;
import Excerise39.RecordSorter;
import java.util.ArrayList;

public class RecordFilter
{

    ArrayList<Employee> employees;

    public RecordFilter(ArrayList<Employee> employees)
    {
        this.employees = employees;
    }

    public StringBuilder find(String whatToSearch)
    {

        StringBuilder sb = new StringBuilder();
        RecordSorter rs = new RecordSorter();

        sb.append(rs.getHeader());

        for(Employee employee : employees)
        {
            if(employee.getFullName().toLowerCase().contains(whatToSearch.toLowerCase()))
            {
                sb.append(rs.getEmployeeData(employee));
            }
        }
        return sb;
    }
}