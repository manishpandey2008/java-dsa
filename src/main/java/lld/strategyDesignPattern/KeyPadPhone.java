package lld.strategyDesignPattern;

public class KeyPadPhone extends Phone {
    KeyPadPhone() {
        super(new NormalPlaySong());
    }
}
