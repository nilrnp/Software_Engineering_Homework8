package Homework8;


class SnackDispenser implements VendingMachineState {
    private Snack selectedSnack;

    public SnackDispenser() {
    }

    public void setSelectedSnack(Snack selectedSnack) {
        this.selectedSnack = selectedSnack;
    }

    public Snack getSelectedSnack() {
        return selectedSnack;
    }

    @Override
    public void selectSnack(String snackName) {

    }

    @Override
    public void insertMoney(double amount) {

    }

    @Override
    public void dispenseSnack() {

    }
}

