package ru.netology.manager;
public class FilmItem {
    private int id;
    private int filmId;
    private String filmName;

    public FilmItem(int id, int filmId, String filmName) {
        this.id = id;
        this.filmId = filmId;
        this.filmName = filmName;
    }
}
