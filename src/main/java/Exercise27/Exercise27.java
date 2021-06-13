package Exercise27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Andres Gacitua
 */

import java.util.regex.Pattern;

public class InputValidator
{

    private String firstName;
    private String lastName;
    private String employeeId;
    private String zipCode;
    private String errorMessage;

    public InputValidator(String firstName, String lastName, String employeeId, String zipCode)
    {

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.zipCode = zipCode;
        errorMessage = "";
    }

    public String validateInput()
    {
        if (isNotNullOrEmpty(firstName))
            isValidLength(firstName);
        if(isNotNullOrEmpty(lastName))
            isValidLength(lastName);
        if(isNotNullOrEmpty(employeeId))
            hasEmployeeIdFormat(employeeId);
        if(isNotNullOrEmpty(zipCode))
            isNumeric(zipCode);
        return errorMessage;
    }

    private boolean isNotNullOrEmpty(String value)
    {
        if(value == null || value.isEmpty())
        {
            errorMessage += "Blank or null values are not allowed.\n";
            return false;
         }
         return true;
    }

    private void isValidLength(String aName)
    {
        if (aName.length() < 2)
            errorMessage += "First name nor last name can't be shorter than 2 characters.\n";
    }

    private void hasEmployeeIdFormat(String employeeId)
    {
        if(! Pattern.matches("[a-zA-Z]{2}[-][0-9]{4}", employeeId))
            errorMessage += "Employee ID must be have 2 letters and 4 numbers like AB-1234.\n";
    }

    private void isNumeric(String value)
    {
        if (! Pattern.matches("^[0-9]+$",value))
            errorMessage += "Zip code must be a number.\n";
    }
}
