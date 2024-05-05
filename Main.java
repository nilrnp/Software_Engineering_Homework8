package Homework8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Snack> snacks = new ArrayList<>();
        snacks.add(new Snack("Coke", 1.5, 5));
        snacks.add(new Snack("Pepsi", 1.5, 3));
        snacks.add(new Snack("Cheetos", 1.0, 10));
        snacks.add(new Snack("Doritos", 1.0, 8));
        snacks.add(new Snack("KitKat", 1.25, 6));
        snacks.add(new Snack("Snickers", 1.25, 0)); // Quantity 0

        VendingMachine vendingMachine = new VendingMachine(snacks);

        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(2.0);
        vendingMachine.dispenseSnack();

        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1.25);
        vendingMachine.dispenseSnack();
    }
}