package lld.factoryDesignPattern;

public class SaveConfirmationPopup implements Poup{
    @Override
    public Button getButton() {
        return new SaveButton();
    }

    @Override
    public void onButtonAction(Button button) {
        button.action();
    }
}
