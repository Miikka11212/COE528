/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Oscar Wang
 */
public abstract class FoodComponent {
    public double price;
    public String food, category;
    public abstract double getPrice();
    public abstract void print(int level);

    public abstract void add(FoodComponent c);
    public abstract void remove(FoodComponent c);

}