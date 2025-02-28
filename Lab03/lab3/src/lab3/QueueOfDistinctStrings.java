/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;
import java.util.ArrayList;
public class QueueOfDistinctStrings {
    // Overview: QueueOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // FIFO (First-In-First-Out) order.
    //
    // The abstraction function is:
    // a) Write the abstraction function here
    /*
        AF(p) = q where p is a Java QueueOfDistinctSrings object
        where q.front = p.get(0)
              q.end = p.get(q.size()-1) where index of the last element is lenght subtract 
              one because they start from 0
        q.collection = p.items
    */

    // The rep invariant is:
    // b) Write the rep invariant here
    /*
        RI(p) = true if timesOccur = 1  where timesOccur is the number of times 
        an element in the arraylist occurs = false otherwise
    */

    //the rep
    private ArrayList<String> items;
    
    
    // constructor
    public QueueOfDistinctStrings () {
    // EFFECTS: Creates a new QueueOfDistinctStrings object
        items = new ArrayList<String>();
    }
    
    // MODIFIES: this
    // EFFECTS: Appends the element at the end of the queue
    // if the element is not in the queue, otherwise
    // does nothing.
    
    public void enqueue(String element) throws Exception {
        if(element == null){
            throw new Exception();
        }
        if(false == items.contains(element)){
            items.add(element);
        }
        
    }
    public String dequeue() throws Exception {
    // MODIFIES: this
    // EFFECTS: Removes an element from the front of the queue
        if (items.size() == 0){
            throw new Exception();
        }
        return items.remove(0);
    }
    public boolean repOK() {
    // EFFECTS: Returns true if the rep invariant holds for this
    // object; otherwise returns false
    // c) Write the code for the repOK() here
        if (items == null){
            return false;
        }
        for (int i = 0; i < items.size(); i++){
            String item = items.get(i);
            if (item == null){
                return false;
            }
            if (items.indexOf(item) != i){
                return false;
            }
        }
        return true;
    }

    public String toString() {
    // EFFECTS: Returns a string that contains the strings in the
    // queue, the front element and the end element.
    // Implements the abstraction function.
    // d) Write the code for the toString() here
        if (items.isEmpty()){
            return ("empty array");
        }
        return items.toString() + " front: " + items.get(0) + "  end: " + items.get(items.size() - 1);
    }
    
    }

