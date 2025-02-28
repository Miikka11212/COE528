/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author Oscar Wang
 */


public class FoodItem extends FoodComponent{

    FoodItem(String food, double price) {
        super.food = food;
        super.price = price;
    }
    @Override
    public void print(int level) {
        for(int i = 0; i<level; i++) {
            System.out.print("\t");
        }
        System.out.println("FoodItem: " + super.food + ", " + price);

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void add(FoodComponent c) {}

    @Override
    public void remove(FoodComponent c) {}
}
