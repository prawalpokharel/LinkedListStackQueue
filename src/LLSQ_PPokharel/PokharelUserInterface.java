//Name:Prawal Pokharel
//CSCI 308 Adv data structures and algorithms
//Date: 09/10/2021
//Everything is done by Prawal Pokharel

package LLSQ_PPokharel;
import java.util.Scanner;

public class PokharelUserInterface {
   public static int maxsizequeue, maxsizestack; //Variables for the max size of Queue and Stack.
    public static void menu(){
        int i = 0;

        int k = 0;
    while (i != 3) { //Main menu loop
        System.out.println("Hi, Press 1 to use stacks, 2 to use queue, 3 to exit");
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt(); //Holds Users Choice.
        if (i==1){
            stack(); //Calling Stack function defined under.
        } else if(i == 2){
            queue(); //Calling Queue function defined under.
        } else if(i == 3){
            System.out.println("Exiting.................");
            System.exit(0);//Exits Program.
        } else {
            System.out.println("A valid input is required, please try again."); //User Friendly Error Message.
        }

    }
    }
    public static void stack(){
        int j = 0;
        int element = 0;
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want the name of your stack to be?");
        name = scanner.next();//Naming the Stack.
        System.out.println("What do you want the max size of your stack to be?");
        maxsizestack = scanner.nextInt();//Asking the user for the max size.


        while(j != 6) {
            System.out.println("");
            System.out.println("Welcome to your Stack " + name+ ". Press 1 to add, 2 to remove, 3 to clear the stack");
            System.out.println("Press 4 to print the stack or you can also press 5 to return to the previous menu");
            j = scanner.nextInt();//holds user choices.
                if(j==1){
                    System.out.println("What do you want to add? ");
                    element = scanner.nextInt();
                    PokharelLLArrayStack.push(element);//Passing user input to the function push defined in another class.

                } else if(j==2){
                PokharelLLArrayStack.pop();//Calling pop function defined in another class.

                } else if(j==3){
                    PokharelLLArrayStack.clear();//Calling clear function defined in another class.
                    System.out.println("What do you want to name your new Stack?");
                    name = scanner.next();//Naming new Stack since previous is cleared.
                    System.out.println("");


                } else if(j==4){
                PokharelLLArrayStack.display();//Calling display function defined in another class.
                System.out.print("∅");

                } else if(j==5){
                System.out.println("Returning to the main menu..........");
                menu();//Calling menu function defined in this class.

                } else {
                System.out.println("A valid input is required, please try again.");//User Friendly Error Message.
            }
        }
    }

    public static void queue(){
        int k;
        k = 0;
        int l = 0;
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.println("What do you want the name of your queue to be?");
        name = scanner.next();//Naming the new Queue.
        System.out.println("What is the max size of your queue?");
        maxsizequeue = scanner.nextInt();//Asking user to set a max size.


        while(k != 999999999) {
            System.out.println("");
            System.out.println("Welcome to your Queue " + name + ". Press 1 to add, 2 to remove, 3 to clear, 4 to view the top");
            System.out.println("You can also press 5 to return to the previous menu ");
            k = scanner.nextInt();//Holds User input.
            if(k==1){
                System.out.println("What do you want to add? ");
                k = scanner.nextInt();
                PokharelLLArrayQueue.enqueue(k);//Calling enqueue function defined in another class.

            } else if(k==2){
                PokharelLLArrayQueue.dequeue();//Calling dequeue function defined in another class.

            } else if(k==3){
                PokharelLLArrayQueue.clear();//Calling clear function defined in another class.
                System.out.println("What do you want the name of your queue to be?");
                name = scanner.next();//Naming new Queue since previous Queue is cleared.
                System.out.println("What do you want the max size of your new queue to be? ");
                maxsizequeue = scanner.nextInt();//Asking user for the max size of their new Queue.

            } else if(k==4){
                PokharelLLArrayQueue.peek();//Calling peek function defined in another class.

            } else if(k==5){
                menu();//Calling menu function defined in this class.

            }
        }

    }
}
