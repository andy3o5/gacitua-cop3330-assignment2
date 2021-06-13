package Exercise39;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

import java.util.ArrayList;
import java.util.Collections;

public class RecordSorter
{

    public static ArrayList<Employee> sort(ArrayList<Employee> list)
    {
        Collections.sort(list);
        return list;
    }

    public static StringBuilder getReadyForPrinting(ArrayList<Employee> list)
    {
        StringBuilder sb = new StringBuilder();

        sb.append(getHeader());

        for(Employee employee : list){
            sb.append(getEmployeeData(employee));
        }

        return sb;
    }

    public static String getEmployeeData(Employee employee)
    {
        return String.format("%-25s| %-30s| %s\n", employee.getFullName(), employee.getPosition(),
                (employee.getSeparationDate()== null ? "" : employee.getSeparationDate()));
    }

    public static String getHeader()
    {
        return (String.format("%-25s| %-30s| %s\n" +
                "-----------------------------------------------------------------------------\n",
                "Name", "Position", "Separation Date"));
    }
}