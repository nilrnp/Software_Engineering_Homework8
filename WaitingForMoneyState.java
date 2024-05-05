package Homework8;

class WaitingForMoneyState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Please finish the current transaction first.");
    }

    @Override
    public void insertMoney(double amount) {
        Snack selectedSnack = vendingMachine.getSnackDispenser().getSelectedSnack();
        if (selectedSnack != null) {
            if (amount >= selectedSnack.getPrice()) {
                vendingMachine.setState(new DispensingSnackState(vendingMachine));
                System.out.println("Money inserted: " + amount);
            } else {
                System.out.println("Insufficient money inserted.");
            }
        } else {
            System.out.println("Please select a snack first.");
        }
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please insert money first.");
    }
}
