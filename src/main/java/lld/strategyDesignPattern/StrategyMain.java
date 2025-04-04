package lld.strategyDesignPattern;

public class StrategyMain {
    public static void main(String[] args) {
        NormalPlaySong normalPlaySong=new NormalPlaySong();
        SpetialPlaySong spetialPlaySong= new SpetialPlaySong();
        XyzPlaySong xyzPlaySong=new XyzPlaySong();

        IPhone  iPhone =new IPhone();
        iPhone.playSong();
    }
}
