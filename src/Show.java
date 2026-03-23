import java.util.ArrayList;

public class Show {
    private final String title; // логично сделать поля final тк у созданного Show данные поля меняются крайне редко, а если меняются то вероятно это уже новое шоу
    private final int duration;
    private final Director director;
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

    public void replaceActor(Actor newActor, String surname){
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (actor.getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актер с указанной фамилией не найден, замена невозможна.");
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
