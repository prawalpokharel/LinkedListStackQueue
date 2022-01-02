//Name:Prawal Pokharel
//CSCI 308 Adv data structures and algorithms
//Date: 09/10/2021
//Everything is done by Prawal Pokharel

package LLSQ_PPokharel;
import static LLSQ_PPokharel.PokharelUserInterface.maxsizequeue; //Importing the User Interface class.

public class PokharelLLArrayQueue {
    private static Node front, rear; //Nodes referring to front and rear of the Queue.
    private static int currentSize, maxSize; //Current and Max size of the Queue.

    //Class to define linked node
    private static class Node
    {
        int data;
        Node next;
    }

    //Defining Constructors. Setting everything to null/0.
    public void PokharelLLArrayQueueConstructors()
    {
        front = null;
        rear = null;
        currentSize = 0;
    }

    //Function to Check if the Queue is Empty.
    public static boolean isEmpty()
    {
        return (currentSize == 0);
    }

    //Function to Check if the Queue is Full.
    public static boolean isFull()
    {
        return(currentSize > maxsizequeue);
    }

    //Function to remove item from the beginning of the list.
    public static int dequeue()
    {
        //Checking of the Queue is empty or not.
        if (isEmpty())
        {
            System.out.println("Queue is empty.....");
            return 0;
        } else {
            int data = front.data;//Assigning front data of the Queue to a variable.
            front = front.next; //Assigning front to the next element of the Queue.
            currentSize--; //Updating current size of the Queue.
            System.out.println(data + " removed from the queue");
            return data; //Returning the top element removed from the Queue.
        }
    }

    //Function to clear the Queue.
    public static void clear(){
        //Checking if the Queue is empty.
        if(isEmpty())
        {
            System.out.println("Stack is empty.");
        } else{
            while(!isEmpty()){ //Dequeuing the Queue until its empty.
                dequeue();
                currentSize = currentSize - 1;
            }
        }
    }

    //Function to add data to the end of the Queue.
    public static void enqueue(int data) {
        //Checking if the Queue is full or not.
        if (currentSize==maxsizequeue) {
            System.out.println("Queue is full.");

        } else {
            Node oldRear = rear; //Holding the old rear in a variable.
            rear = new Node();
            rear.data = data; //Assigning the new data as rear of the Queue.
            rear.next = null;
            if (isEmpty()) { //Function to check if the Queue is empty or not.
                front = rear;
            } else {
                oldRear.next = rear; //Assigning our old rear of the Queue as the next element of the new rear.
            }
            currentSize++; //Updating current size.
            System.out.println(data + " added to the queue");
        }
    }

    //Function to check the top element of the Queue.
    public static int peek()
    {
        //Checking if the Queue is empty or not.
        if(isEmpty()){
            System.out.println("Queue is empty........");
            return 0;
        } else {
            int data = front.data;//Assigning the front data of the Queue to a variable.
            System.out.println("The top element of the queue is " + data);
            return data;//Returning the front element of the Queue.
        }
    }
    }


