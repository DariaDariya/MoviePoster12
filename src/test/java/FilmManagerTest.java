import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.manager.FilmItem;
import ru.netology.manager.FilmManager;

public class FilmManagerTest {
    FilmManager manager = new FilmManager();
    FilmItem item1 = new FilmItem(1, 1, "Бладшот");
    FilmItem item2 = new FilmItem(2, 2, "Вперед");
    FilmItem item3 = new FilmItem(3, 3, "Отель Белград");
    FilmItem item4 = new FilmItem(4, 4, "Джентльмены");
    FilmItem item5 = new FilmItem(5, 5, "Человек-Невидимка");
    FilmItem item6 = new FilmItem(6, 6, "Тролли. Мировой тур");
    FilmItem item7 = new FilmItem(7, 7, "Номер один");
    FilmItem item8 = new FilmItem(8, 8, "Остров Проклятых");
    FilmItem item9 = new FilmItem(9, 9, "Блейд");
    FilmItem item10 = new FilmItem(10, 10, "Обитель проклятых");

    @BeforeEach
    public void setup() {
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");
        manager.add("Человек-Невидимка");
        manager.add("Тролли. Мировой тур");
        manager.add("Номер один");
        manager.add("Остров Проклятых");
        manager.add("Блейд");
        manager.add("Обитель проклятых");
    }

    @Test
    public void shouldFindAll() {

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентльмены", "Человек-Невидимка", "Тролли. Мировой тур", "Номер один", "Остров Проклятых", "Блейд", "Обитель проклятых"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindLastItems() {
        String[] expected = {"Обитель проклятых", "Блейд", "Остров Проклятых", "Номер один", "Тролли. Мировой тур", "Человек-Невидимка", "Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLessFilms() {
        FilmManager manager = new FilmManager(4);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");

        String[] expected = {"Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLessFilmsInLength() {
        FilmManager manager = new FilmManager(5);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");

        String[] expected = {"Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLessFilmsButLimitMore() {
        FilmManager manager = new FilmManager(15);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");


        String[] expected = {"Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAboveMaxLimit() {
        FilmManager manager = new FilmManager(3);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");

        String[] expected = {"Джентльмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLessThanLimit() {
        FilmManager manager = new FilmManager(10);
        manager.add("Бладшот");
        manager.add("Вперед");
        manager.add("Отель Белград");
        manager.add("Джентльмены");

        String[] expected = {"Джентльмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}


