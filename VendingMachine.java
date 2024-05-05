package Homework8;

import java.util.List;

class VendingMachine implements VendingMachineState {
    private VendingMachineState currentState;
    private VendingMachineState snackDispenser;
    private List<Snack> snacks;

    public VendingMachine(List<Snack> snacks) {
        this.currentState = new IdleState(this);
        this.snackDispenser = new SnackDispenser();
        this.snacks = snacks;
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public VendingMachineState getState() {
        return currentState;
    }

    public SnackDispenser getSnackDispenser() {
        return (SnackDispenser) snackDispenser;
    }

    public List<Snack> getSnacks() {
        return snacks;
    }

    @Override
    public void selectSnack(String snackName) {
        currentState.selectSnack(snackName);
    }

    @Override
    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }

    @Override
    public void dispenseSnack() {
        currentState.dispenseSnack();
    }
}