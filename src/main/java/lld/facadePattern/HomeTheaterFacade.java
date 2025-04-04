package lld.facadePattern;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private SurroundSoundSystem soundSystem;

    // Constructor accepts the subsystems
    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, SurroundSoundSystem soundSystem) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    // High-level interface to start watching a movie
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        dvdPlayer.on();
        dvdPlayer.play(movie);
        projector.on();
        projector.wideScreenMode();
        soundSystem.on();
        soundSystem.setVolume(10);
    }

    // High-level interface to end movie
    public void endMovie() {
        System.out.println("Shutting down home theater system...");
        dvdPlayer.off();
        projector.off();
        soundSystem.off();
    }
}
