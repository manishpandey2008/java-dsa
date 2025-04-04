package lld.factoryDesignPattern;

public class CancelConfirmationPopup implements Poup{
    @Override
    public Button getButton() {
        return new CancelButton();
    }

    @Override
    public void onButtonAction(Button button) {
        button.action();
    }
}
