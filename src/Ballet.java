import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Choreographer choreographer;


    public Ballet(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String getShowType() {
        return "Балет";
    }
}
