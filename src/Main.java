import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {

        //Scanner to read the user's command from the Menu.
        Scanner in = new Scanner(System.in);

        //MENU
        System.out.println("===========================================");
        System.out.println("Menu:");
        System.out.println("*Press the number for the command.*");
        System.out.println("1.Read the file.");
        System.out.println("2.Sort the file.");
        System.out.println("3.Search family connection.");
        System.out.println("4.Save data in DOT form and create diagram.");
        System.out.println("0.EXIT");
        System.out.println("===========================================");
        System.out.println("");

        System.out.print("Enter here: ");
        int choice = in.nextInt();


        boolean flag = false;   //used for exiting the do-while loop.
        //User input loop.
        do {
            //User input switch.
            switch (choice) {
                case 1:
                    CsvClass.csvMaker();
                    System.out.println("File was successfully read.");
                    flag = true;
                    break;
                case 2:
                    System.out.println();
                    flag = true;
                    break;
                case 3:
                    flag = true;
                    break;
                case 4:
                    flag = true;
                    break;
                case 0: //Exits Menu
                    break;
                default:
                    System.out.println("Please enter a correct action. (Press 0-4)");
                    choice = in.nextInt();
            }//End of user input switch.


            //Continuation of the loop based on user's input.
            String ans;     //scanner input used for the continuation of the loop(Y/N).
            if (flag) {
                System.out.print("Would you like to continue?(Y/N): ");
                ans = in.next();
                if (ans.equals("Y") || ans.equals("y")) {
                    flag = false;
                    System.out.println("Please enter next action.");
                    System.out.print("Enter here: ");
                    choice = in.nextInt();
                }else if (ans.equals("N") || ans.equals("n")){
                    System.out.println("===========================================");
                    System.out.println("Exiting...");
                }
                else {
                    do {
                        System.out.println("Wrong command. Pleas try again (Y/N)");
                        ans = in.next();
                    }while(!ans.equals("Y"));
                }
            }//End of continuation loop.


        }while(choice !=0 && !flag);
        //End of input loop.

        System.out.println("Thank you for using our services.");

    }
}
