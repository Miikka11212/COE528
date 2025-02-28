/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author Oscar Wang
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueOfDistinctStrings queue = new QueueOfDistinctStrings();
        try{
            queue.enqueue("alpha");
            queue.enqueue("beta");
            queue.enqueue("gamma");
            System.out.println(queue.toString());
            System.out.println(queue.repOK());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
