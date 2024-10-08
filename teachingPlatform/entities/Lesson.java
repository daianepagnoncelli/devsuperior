package entities;

public abstract class Lesson {
    private final String title;

    public Lesson(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract int duration();
}

