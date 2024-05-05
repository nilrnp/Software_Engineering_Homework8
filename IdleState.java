package Homework8;

class IdleState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        Snack selectedSnack = vendingMachine.getSnacks().stream()
                .filter(snack -> snack.getName().equalsIgnoreCase(snackName))
                .findFirst()
                .orElse(null);

        if (selectedSnack != null) {
            vendingMachine.getSnackDispenser().setSelectedSnack(selectedSnack);
            vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
            System.out.println("Snack selected: " + snackName);
        } else {
            System.out.println("Snack not available.");
        }
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please select a snack first.");
    }
}