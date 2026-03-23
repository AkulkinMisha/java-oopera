import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;


    public Opera(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String getShowType() {
        return "Опера";
    }
}
