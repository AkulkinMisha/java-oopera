public class Theatre {
    public static void main(String[] args) {
        Actor johnnyDepp = new Actor("Джонни", "Депп", Gender.MALE, 180);
        Actor leonardoDiCaprio = new Actor("Леонардо", "ДиКаприо", Gender.MALE, 170);
        Actor robertDowney = new Actor("Роберт", "Дауни", Gender.MALE, 175);

        Director quentinTarantino = new Director("Квентин", "Торрантино", Gender.MALE, 8);
        Director guyRichie = new Director("Ричи", "Гай", Gender.MALE, 8);

        MusicAuthor johnWilliams = new MusicAuthor("Джон", "Уильямс", Gender.MALE);
        Choreographer georgeBalanchine = new Choreographer("Джордж", "Баланчин", Gender.MALE);

        String nutcrackerLibretto = "Зимний вечер. В небольшом немецком городке на улице оживленно и празднично. "
                + "В доме господина Штальбаума готовятся к встрече Рождества.";
        String carmenLibretto = "В карауле жизнью улиц мы живём по часам.";

        Show show = new Show("Гамлет", 120, quentinTarantino);
        Ballet ballet = new Ballet("Щелкунчик", 120, guyRichie, johnWilliams, nutcrackerLibretto,
                georgeBalanchine);
        Opera opera = new Opera("Кармен", 120, quentinTarantino, johnWilliams, carmenLibretto, 20);

        show.addActor(johnnyDepp);
        show.addActor(robertDowney);

        ballet.addActor(leonardoDiCaprio);

        opera.addActor(leonardoDiCaprio);
        opera.addActor(robertDowney);

        show.printInfo();
        ballet.printInfo();
        opera.printInfo();

        show.replaceActor(leonardoDiCaprio, "Депп");
        show.printInfo();

        ballet.replaceActor(leonardoDiCaprio, "Питт");

        ballet.printLibrettoText();
        opera.printLibrettoText();
    }
}