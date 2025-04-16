
//WB2-1-12-pg16-EX2-FullNameParser

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++) { // -continue jumps back up here to revaluate, maybe loop again
            //begin iteration - one pass through the loop
            if (i % 3 == 0) {
                break; // quit/stop at 3 - why keep going if you found your keys?
                //continue; //skips 3, 6 and 9 - skip and revaluate at the top - gather all the children to go to the car
            }
            //SKIP? SKIPPED WORK
            System.out.printf("adding %d to %d to get to %d.\n", i, sum, sum + i);
            sum += i;
        }

        //outside the loop - break go straight here
        System.out.println("Sum = " + sum);

        int[] prices = { 11,33,22,66,333,44};
        int limit = 50;
        for(int p : prices){
            if(p >= limit){
                //break; //stop/quit
                continue; //skip, and move on to next
            }
            System.out.println(p);
        }
//        Step 1
//        Create a Java application called FullNameParser that prompts the user to enter a
//        name in one of the following two formats:
//        first last or first middle last
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Full Name as Either First Last, or First Middle Last :");
        String fullName = in.nextLine();

        //        Make sure to trim the name before proceeding in case the user entered leading or
        //        trailing spaces.
        fullName = fullName.trim();

        //        Parse the name and process it so that you can display the individual pieces of the
        //        name.

        String[] parts = fullName.split(" ");

        String first = "";
        String middle = "";
        String last = "";

        if(parts.length > 0){
            first = parts[0];
        }

        if(parts.length == 3){
            middle = parts[1];
        }

        if(parts.length > 1){
            last = parts[parts.length - 1]; //use last index whether there are two or three parts
        }

        System.out.print(first);

        if(!middle.isEmpty()){
            System.out.print(" " + middle);
        }

        if(!last.isEmpty()){
            System.out.print(" " + last);
        }

        System.out.print('\n');

//                A sample trace of your program output is shown below. Bolded code is what the
//        user entered.
//        Please enter your name: Dana L. Wyatt ↵
//        First name: Dana
//        Middle name: L.
//                Last name: Wyatt
//        A different trace would be:
//        Please enter your name: Dana Wyatt↵
//        First name: Dana
//        Middle name: (none)
//                Last name: Wyatt
    }
}
