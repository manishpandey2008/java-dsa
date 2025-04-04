package lld.strategyDesignPattern;

public class Phone {
  SongInf songInf;
  Phone(SongInf songInf){
      this.songInf=songInf;
  }
  void playSong(){
      songInf.PlaySong();
  }
}
