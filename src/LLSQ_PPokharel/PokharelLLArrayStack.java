//Name:Prawal Pokharel
//CSCI 308 Adv data structures and algorithms
//Date: 09/10/2021
//Everything is done by Prawal Pokharel

package LLSQ_PPokharel;
import java.util.Scanner;
import static LLSQ_PPokharel.PokharelUserInterface.maxsizestack;
import static java.lang.System.exit;


public class PokharelLLArrayStack {
    // Creating a linked list node
        private static class Node {
            int data;
            Node link;
        }
  static Node top; //Node referring to the top of the stack.
  static int maxsize, currentsize; //Variables for the max and current size of the stack.

        //function to check if the stack is empty or not.
        public boolean isEmpty()
            {
                return (top == null);
            }
        //function to check if the stack is full or not.
        public static boolean isFull()
            {
                return (currentsize > maxsizestack);
            }
        // insert into the stack
        public static void push(int x)
            {
                //Checking for Overflow.
                if(currentsize == maxsizestack){
                System.out.println("Stack Overflow. Please clear your stack.");
                } else {
                Node temp = new Node(); //temporary node.
                //Initializing data.
                temp.data = x;
                //Putting top reference.
                temp.link = top;
                //Updating top reference.
                top = temp;
                //Updating the current size.
                currentsize = currentsize + 1;
                System.out.println("Successfully added " + x + " to the stack.");
            }

        }

        //Function to return top element in a stack.
        public int peek()
        {
            //Checking for empty stack.
            if (!isEmpty()) {
                return top.data;//Returning the top
            }
            else {
                System.out.println("Stack is empty");
                return -1;
            }
        }

        //Function to pop the top element from the stack.
        public static void pop()
        {
        // check for stack underflow
            if (top == null) {
                System.out.print("\nStack Underflow");
                return;

            } else {
                int topdata = 0;
                topdata = top.data;//Assigning top data to a variable.

                //Updating the top pointer to point to the next node.
                top = (top).link;
                System.out.println("Successfully deleted " + topdata + " from the stack.");
                //Updating current size.
                currentsize = currentsize - 1;
            }
        }

        public static void display()
        {
            // Checking for stack underflow.
            if (top == null) {
                System.out.printf("\nStack Underflow");
                exit(1);
            }
            else {
                Node temp = top; //Temporary node holding top value.
                while (temp != null) {
                // print node data
                System.out.printf("%d->", temp.data);
                temp = temp.link;
                }
            }
        }

        public static void clear(){
            while(top!=null){
                pop(); //Looping until Stack is empty.
                currentsize = currentsize - 1 ;
            }
            System.out.println("Stack is cleared");
            System.out.println("The size of your old stack is 0. What do you want the size of your new stack to be?");
            Scanner scanner = new Scanner(System.in);
            maxsizestack = scanner.nextInt(); //Size of the new stack.
        }
  }

