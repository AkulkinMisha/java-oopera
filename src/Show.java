import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private final ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printListOfActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Указанный актер уже заявлен как участник спектакля.");
                return;
            }

        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String surname) {
        int foundIndex = -1;
        int count = 0;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surname)) {
                foundIndex = i;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Актер с указанной фамилией не найден, замена невозможна.");
        } else if (count > 1) {
            System.out.println("В спектакле несколько актеров с такой фамилией, замена невозможна.");
        } else {
            listOfActors.set(foundIndex, newActor);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getShowType() {
        return "Спектакль";
    }

    public void printInfo() {
        System.out.println(getShowType() + ": " + title + "." + director + " Список участников:");
        printListOfActors();
        System.out.println();
    }

}
