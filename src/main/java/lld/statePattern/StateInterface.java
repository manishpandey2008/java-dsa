package lld.statePattern;

public interface StateInterface {
    public void initialState();
    public void readyForTakeMoney();
    public void takeMoney(Double money);
    public void deliveryProduct();
}
