import java.util.Objects;

public class Actor extends Person {

    private int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false; // т.к. наследуем от Person, то заранее проверяем равенство полей родителя
        Actor actor = (Actor) o; // приводим в типа Actor для доступа к полям класса.
        return Objects.equals(height, actor.height);// добавляем сверку по росту
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }
}


