package Homework8;

interface VendingMachineState {
    void selectSnack(String snackName);

    void insertMoney(double amount);

    void dispenseSnack();
}