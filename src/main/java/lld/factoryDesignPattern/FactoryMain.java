package lld.factoryDesignPattern;



public class FactoryMain {
    public static void main(String[] args) {
        Poup popup=new SaveConfirmationPopup();
        popup.onButtonAction(popup.getButton());
    }
}
