package ca.nscc;
import java.util.ArrayList;
import javax.swing.*;

public class Main {
    //method for validating Alphabetic input. Checks if the string is empty.
    private static boolean inputValAlpha(String input) {
        if (input.isEmpty()) {
            return false; }
        else { return true; } }

    //method for validating student numeric input. Regex compares first digit to numbers ranging from 1 to 4.
    private static boolean inputValStudentInt(String number) {
        if (number.matches("[1-4]")) {
            return true; }
        else { return false; } }

    //Method for validating staff numeric input. Regex compares first digit to numbers ranging from 1 to 9. OR - It compares the first digit
    //to numbers ranging from 1 to 2 and the second digit for numbers ranging from 0 to 9.  This results in the input being valid only if
    //the number ranges between 0 and 30.
    private static boolean inputValStaffInt(String number) {
        if (number.matches("[1-9]|[1-2][0-9]")) {
            return true; }
        else { return false; } }

    //If the cancel button was pressed, it returns a null. Method returns true flag to break out of do-while loop.
    private static boolean nullCancelSignal(String input) {
        if (input ==  null)
            return true;
        else { return false; } }

    //Shows dialog box when alphabetic input is incorrect.
    private static void AlphaError() { JOptionPane.showMessageDialog(
            null,
            "Please enter Valid Information!",
            "Message",
            JOptionPane.INFORMATION_MESSAGE); }

    //Show dialog box when numeric input is incorrect.
    private static void NumberError() { JOptionPane.showMessageDialog(
            null,
            "Please enter a number!",
            "Message",
            JOptionPane.INFORMATION_MESSAGE); }

    //Method is used to calculate the entire cost of student fees or staff salaries.
    private static double feeSalary(String years, double ratePerYear, double baseNumber) {
        return (Double.parseDouble(years) * ratePerYear) + baseNumber; }

    //Starts here.
    public static void main(String[] args) {
        //Student flat fee.
        double flatFee = 3000.00;
        //Student yearly rate.
        double yearRate = 100.00;
        //Base staff salary.
        double baseSalary = 50000.00;
        //Staff yearly raise.
        double yearRaise = 500.00;

        //Array for custom button options.
        Object[] buttonOptions = {"Student", "Staff", "Finish"};

        //Array list for Staff objects.
        ArrayList<Staff> StaffList = new ArrayList();

        //Array list for student objects.
        ArrayList<Student> StudentList = new ArrayList();

        //Termination Flag.
        boolean terminationFlag = false;

        //While loop keeps program in loop until user chooses finished.
        while (!terminationFlag) {
            //Custom Dialog box. three options - student[0], staff[1], finish[null].
            int personChoice =  JOptionPane.showOptionDialog(
                null,
                "Select Student or Staff.",
                "Accounting App",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                buttonOptions,
                buttonOptions[0]);

            //If statement for Student[0]. The beginning of the process of adding a new student object.
            if (personChoice == 0) {
                //Flags for while-do loops. Changes to true for each input when validation is successful.
                boolean CheckStudentName = false;
                boolean CheckStudentAddress = false;
                boolean CheckStudentYear = false;
                //Pre-initialized empty Strings.
                String StudentName = "";
                String StudentAddress = "";
                String StudentYear = "";

                //Shows input box for student name.
                do { StudentName = JOptionPane.showInputDialog(
                        null,
                        "Enter Student Name",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);
                    //If cancel has been selected will break loop.
                    if (nullCancelSignal(StudentName)) {
                       break; }
                    //Checks if string is empty.
                    if (inputValAlpha(StudentName)) {
                        CheckStudentName = true; }
                    //Shows message box if string IS empty.
                    else {AlphaError();}

                //While loop will continue to gather input if flag remains false.
                } while (!CheckStudentName);
                //Shows input box for student address.
                do { StudentAddress = JOptionPane.showInputDialog(
                        null,
                        "Enter Student Address",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);

                    //If cancel has been selected will break loop.
                    if (nullCancelSignal(StudentAddress)) {
                        break; }
                    //Checks if string is empty.
                    if (inputValAlpha(StudentAddress)) {
                        CheckStudentAddress = true; }
                    //Shows message box if string IS empty.
                    else {AlphaError();}

                //While loop will continue to gather input if flag remains false.
                } while (!CheckStudentAddress);
                //Shows input box for student year.
                do { StudentYear = JOptionPane.showInputDialog(
                        null,
                        "Enter number of year (1-4)",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);

                    //If cancel has been selected will break loop.
                    if (nullCancelSignal(StudentYear)) {
                        break; }
                    //Checks if number is between 1-4, only accepts numbers, all other chars are not accepted.
                    if (inputValStudentInt(StudentYear)) {
                        CheckStudentYear = true; }
                    //Shows message box if string not formatted correctly.
                    else {NumberError();}

                //While loop will continue to gather input if flag remains false.
                } while (!CheckStudentYear);

                //if any of the values are intentionally null, the object will not be created and the loop will repeat.
                if (StudentName == null || StudentAddress == null || StudentYear == null){
                    continue; }

                //Creates new Student object with all attributes. Also adds the appropriate fee to the object as an attribute.
                StudentList.add(new Student(StudentName,
                    StudentAddress,
                    Integer.parseInt(StudentYear),
                    feeSalary(StudentYear, yearRate, flatFee))); }

            //Else if statement for Staff[1]. The beginning of the process of adding a new staff object.
            else if (personChoice == 1) {
                boolean CheckStaffName = false;
                boolean CheckStaffAddress = false;
                boolean CheckStaffYears = false;
                //Pre-initialized empty Strings.
                String StaffName = "";
                String StaffAddress = "";
                String StaffYears = "";

                //Shows input box for staff name.
                do { StaffName = JOptionPane.showInputDialog(
                        null,
                        "Enter Staff Name",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);

                    //If cancel has been selected will break loop.
                    if (nullCancelSignal(StaffName)) {
                        break; }
                    //Checks if string is empty.
                    if (inputValAlpha(StaffName)) {
                        CheckStaffName = true; }
                    //Shows message box if string not formatted correctly.
                    else {AlphaError();}

                //While loop will continue to gather input if flag remains false.
                } while (!CheckStaffName);
                //Shows input box for staff address.
                do { StaffAddress = JOptionPane.showInputDialog(
                        null,
                        "Enter Staff Address",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);

                    //If cancel has been selected will break loop.
                    if (nullCancelSignal(StaffAddress)) {
                        break; }
                    //Checks if string is empty.
                    if (inputValAlpha(StaffAddress)) {
                        CheckStaffAddress = true; }
                    //Shows message box if string not formatted correctly.
                    else {AlphaError();}

                //While loop will continue to gather input if flag remains false.
                } while (!CheckStaffAddress);
                //Shows input box for staff years.
                do { StaffYears = JOptionPane.showInputDialog(
                        null,
                        "Enter Staff Years of Service",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);

                    //If cancel has been selected will break loop.
                    if (nullCancelSignal(StaffYears)) {
                        break; }
                    //Checks if number is between 0-30, only accepts numbers, all other chars are not accepted.
                    if (inputValStaffInt(StaffYears)) {
                        CheckStaffYears = true; }
                    //Shows message box if string not formatted correctly.
                    else {NumberError();}

                //While loop will continue to gather input if flag remains false.
                } while (!CheckStaffYears);
                //if any of the values are intentionally null, the object will not be created and the loop will repeat.
                if (StaffName == null || StaffAddress == null || StaffYears == null){
                    continue; }

                //Creates new Staff object with all attributes. Also adds the appropriate salary to the object as an attribute.
                StaffList.add(new Staff(StaffName,
                    StaffAddress,
                    Integer.parseInt(StaffYears),
                    feeSalary(StaffYears, yearRaise, baseSalary))); }

            //Else if statement for Finish[2]. The beginning of the process of adding total values, formatting String output and then
            //displaying the report to the user.
            else if (personChoice == 2) {
                //Pre-initialized empty String.
                String finalOutput = "";
                //Pre-initialized doubles.
                double StudentTotal = 0;
                double StaffTotal = 0;

                //Student banner, with number of student objects added.
                finalOutput += "Students " + "[Total: " + StudentList.size() + "]";
                //for-each loop gathering String values of all attributes of current student object. Appends them to final report string with counter.
                for (Student thisStudent : StudentList) {
                    int i = 1;
                    finalOutput += "\n" + (i) + ". " + thisStudent.toString();
                    StudentTotal +=thisStudent.getFee();
                    i++; }

                //Divides total student invoices by 2.
                StudentTotal = StudentTotal / 2;

                //Staff banner, with number of staff objects added.
                finalOutput +=  "\nStaff " + "[Total: " + StaffList.size() + "]";
                //for-each loop gathering String values of all attributes of current staff object. Appends them to final report string with counter.
                for (Staff thisStaff : StaffList) {
                    int i = 1;
                    finalOutput += "\n" + (i) + ". " + thisStaff.toString();
                    StaffTotal += thisStaff.getSalary();
                    i++; }

                //Divides total staff salaries by 26.
                StaffTotal = StaffTotal / 26;

                //Difference in outgoing and incoming money.
                double finalTotal = StudentTotal - StaffTotal;

                //Formatted string for Results section of report.
                finalOutput += "\n\nResults:" + "\n" + "Outgoing: $" + String.format("%.2f", StudentTotal) + "\n" + "Incoming: $" + String.format("%.2f", StaffTotal) + "\n" + "Total: $" + String.format("%.2f", finalTotal);

                //Displays Formatted report to user in dialog box. Changes termination flag to true. Ends program.
                JOptionPane.showMessageDialog(
                    null,
                    "\n" + finalOutput,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE);
                terminationFlag = true;
            }
        }
    }
}