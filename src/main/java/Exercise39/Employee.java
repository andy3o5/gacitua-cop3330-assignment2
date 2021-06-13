package Exercise39;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

/*
For Exercise 39
*/

import java.time.LocalDate;

public class Employee implements Comparable<Employee>
{
    private String firstName;
    private String lastName;
    private String fullName;
    private String position;
    private LocalDate separationDate;

    public Employee(String firstName, String lastName, String position, LocalDate separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getPosition()
    {
        return position;
    }

    public LocalDate getSeparationDate()
    {
        return separationDate;
    }

    @Override
   public String toString()
   {
        return getClass().getSimpleName() + "[" + firstName + ", " + lastName + ", " + position + ", " + separationDate + "]";
   }

   @Override
    public int compareTo(Employee employee)
    {
        return this.lastName.compareTo(employee.lastName);
   }
}