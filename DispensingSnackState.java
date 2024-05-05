package Homework8;

class DispensingSnackState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public DispensingSnackState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Please wait while dispensing the current snack.");
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Please wait while dispensing the current snack.");
    }

    @Override
    public void dispenseSnack() {
        Snack selectedSnack = vendingMachine.getSnackDispenser().getSelectedSnack();
        if (selectedSnack != null) {
            if (selectedSnack.getQuantity() > 0) {
                System.out.println("Dispensing " + selectedSnack.getName());
                selectedSnack.setQuantity(selectedSnack.getQuantity() - 1);
            } else {
                System.out.println(selectedSnack.getName() + " is out of stock.");
            }
            vendingMachine.setState(new IdleState(vendingMachine));
        } else {
            System.out.println("Please select a snack first.");
        }
    }
}