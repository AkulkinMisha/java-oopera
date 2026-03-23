import java.util.ArrayList;

public class MusicalShow extends Show {
    private final MusicAuthor musicAuthor;
    private final String librettoText;


    public MusicalShow(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(getTitle() + ". Либретто: " + librettoText);
    }
}
