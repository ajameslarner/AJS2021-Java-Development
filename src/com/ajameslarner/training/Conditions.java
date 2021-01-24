package com.ajameslarner.training;

public class Conditions {
    public static void main(String[] args) {
        //Conditions and If Statements
        //Comparison operators can be used to compare variables in a statement

        //If statement
        byte x = 10;
        byte y = 3;

        if (x > y) {
            System.out.println("X is greater than Y");          //Block of code executed if TRUE
        } else {
            System.out.println("X is NOT greater than Y");      //Block of code executed if FALSE
        }

        if (x == y) {
            System.out.println("X is equal to Y");
        } else if (x != y) {
            System.out.println("X is NOT equal to Y");
        }

        //Switch case conditional - Switch cases are awesome
        String day = "err";

        // switch (variable) {
        //    case value1:
        //        //Code to be executed
        //        break;
        //    case value2:
        //        //Code to be executed
        //        break;
        //    case value3:
        //        //Code to be executed
        //        break;                    //Breaks the execution if the condition is met
        //    default:                      //Basically the else statement, if the cases aren't met this runs
        //}



        switch (day) {
            case "Mon":
                System.out.println("Monday");           //Returns when the variable value equals the case value
                break;
            case "Tue":
                System.out.println("Tuesday");          //Returns when the variable value equals the case value
                break;
            case "Wed":
                System.out.println("Wednesday");        //Returns when the variable value equals the case value
                break;
            case "Thu":
                System.out.println("Thursday");         //Returns when the variable value equals the case value
                break;
            case "Fri":
                System.out.println("Friday");           //Returns when the variable value equals the case value
                break;
            case "Sat":
                System.out.println("Saturday");         //Returns when the variable value equals the case value
                break;
            case "Sun":
                System.out.println("Sunday");           //Returns when the variable value equals the case value
                break;
            default:
                System.out.println("The condition was not met!");
        }

        //The "break" keyword breaks out of the switch and will stop the execution of more code once the condition has been met
        //The "default" keyword is the else statement if none of the cases (conditions) are met the code inside the default will run

        //While Loop
        //Standard While Loop
        int i = 0;
        while (i < 5) {
            System.out.println("While Loop");
            i++;
        }

        //Do While Loop
        int d = 0;
        do {
            System.out.println("Do While Loop");
            d++;
        } while (d < 5);

        //For Loop
        //Standard For Loop
        for (int j = 0; j < 5; j++) {
            System.out.println("For Loop");
        }

        //For Each Loop - used exclusively to loop through arrays
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for (String k : days) {
            System.out.println("For Each Loop: " + k);
        }

        //THE BREAK STATEMENT
        for (int h = 0; h < 15; h++) {
            if (h == 2) {               //The break statement can be used to break out of a loop sequence
                System.out.println("The break has been met");
                break;                  //in this example the loop stops when it reaches 9
            }
            System.out.println("Break Loop");
        }

        //THE CONTINUE STATEMENT
        for (int s = 0; s < 10; s++) {
            if (s == 5) {
                    System.out.println("The Continue has been met");      //The continue statement continues the loop while
                continue;                                               // executing the code within the block once the condition has been met
            }
            System.out.println("Continue Loop");
        }

        //THESE TWO STATEMENTS CAN ALSO BE USED IN A WHILE LOOP
    }
}
