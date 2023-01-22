package ru.netology.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieData;

public class MovieManagerTest {

    MovieData movie1 = new MovieData(1, "Бладшот");
    MovieData movie2 = new MovieData(2, "Вперёд");
    MovieData movie3 = new MovieData(3, "Отель Белград");
    MovieData movie4 = new MovieData(4, "Джентельмены");
    MovieData movie5 = new MovieData(5, "Человек-невидимка");
    MovieData movie6 = new MovieData(6, "Тролли. Мировой тур");
    MovieData movie7 = new MovieData(7, "Номер один");
    MovieData movie8 = new MovieData(8, "Лучшее предложение");
    MovieData movie9 = new MovieData(9, "Семь");
    MovieData movie10 = new MovieData(10, "Зодиак");

    MovieData[] moviesTestList0 = new MovieData[0];
    MovieData[] moviesTestList1 = {
            movie1};
    MovieData[] moviesTestList5 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5};
    MovieData[] moviesTestList7 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7
    };
    MovieData[] moviesTestList10 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7,
            movie8,
            movie9,
            movie10
    };

    MovieData[] moviesExpectedAdd1 = {
            movie1};
    MovieData[] moviesExpectedAdd2 = {
            movie1,
            movie2};
    MovieData[] moviesExpectedAdd6 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
    };
    MovieData[] moviesExpectedAdd8 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7,
            movie8

    };

    MovieData[] moviesExpectedFindAll0 = new MovieData[0];
    MovieData[] moviesExpectedFindAll1 = {
            movie1};
    MovieData[] moviesExpectedFindAll5 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5};
    MovieData[] moviesExpectedFindAll10 = {
            movie1,
            movie2,
            movie3,
            movie4,
            movie5,
            movie6,
            movie7,
            movie8,
            movie9,
            movie10
    };

    MovieData[] moviesExpectedFindLast0DefaultCount = new MovieData[0];
    MovieData[] moviesExpectedFindLast1DefaultCount = {
            movie1};
    MovieData[] moviesExpectedFindLast5DefaultCount = {
            movie5,
            movie4,
            movie3,
            movie2,
            movie1};
    MovieData[] moviesExpectedFindLast10DefaultCount = {
            movie10,
            movie9,
            movie8,
            movie7,
            movie6,
            movie5,
            movie4,
            movie3,
            movie2,
            movie1
    };

    MovieData[] moviesExpectedFindLast10Count0 = new MovieData[0];

    MovieData[] moviesExpectedFindLast10Count5 = {
            movie10,
            movie9,
            movie8,
            movie7,
            movie6
    };

    MovieManager manager = new MovieManager();
    MovieManager managerCountNull = new MovieManager(0);
    MovieManager managerCount5 = new MovieManager(5);

    @Test
    void shouldAddNullMovies() {
        MovieData[] expected = moviesExpectedAdd1;
        manager.setMovies(moviesTestList0);
        manager.add(movie1);
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddOneMovies() {
        MovieData[] expected = moviesExpectedAdd2;
        manager.setMovies(moviesTestList1);
        manager.add(movie2);
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddFiveMovies() {
        MovieData[] expected = moviesExpectedAdd6;
        manager.setMovies(moviesTestList5);
        manager.add(movie6);
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldAddTenMovies() {
        MovieData[] expected = moviesExpectedAdd8;
        manager.setMovies(moviesTestList7);
        manager.add(movie8);
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllNullMovies() {
        MovieData[] expected = moviesExpectedFindAll0;
        manager.setMovies(moviesTestList0);
        manager.findAll();
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllOneMovies() {
        MovieData[] expected = moviesExpectedFindAll1;
        manager.setMovies(moviesTestList1);
        manager.findAll();
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllFiveMovies() {
        MovieData[] expected = moviesExpectedFindAll5;
        manager.setMovies(moviesTestList5);
        manager.findAll();
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindAllTenMovies() {
        MovieData[] expected = moviesExpectedFindAll10;
        manager.setMovies(moviesTestList10);
        manager.findAll();
        Assertions.assertArrayEquals(expected, manager.getMovies());
    }

    @Test
    void shouldFindLastNullMoviesDefaultCount() {
        MovieData[] expected = moviesExpectedFindLast0DefaultCount;
        manager.setMovies(moviesTestList0);
        manager.findLast();
        Assertions.assertArrayEquals(expected, manager.getMoviesReverseAdd());
    }

    @Test
    void shouldFindLastOneMoviesDefaultCount() {
        MovieData[] expected = moviesExpectedFindLast1DefaultCount;
        manager.setMovies(moviesTestList1);
        manager.findLast();
        Assertions.assertArrayEquals(expected, manager.getMoviesReverseAdd());
    }

    @Test
    void shouldFindLastFiveMoviesDefaultCount() {
        MovieData[] expected = moviesExpectedFindLast5DefaultCount;
        manager.setMovies(moviesTestList5);
        manager.findLast();
        Assertions.assertArrayEquals(expected, manager.getMoviesReverseAdd());
    }

    @Test
    void shouldFindLastTenMoviesDefaultCount() {

        MovieData[] expected = moviesExpectedFindLast10DefaultCount;
        manager.setMovies(moviesTestList10);
        manager.findLast();
        Assertions.assertArrayEquals(expected, manager.getMoviesReverseAdd());
    }

    @Test
    void shouldFindLastTenMoviesCountNull() {
        MovieData[] expected = moviesExpectedFindLast10Count0;
        managerCountNull.setMovies(moviesTestList10);
        managerCountNull.findLast();
        Assertions.assertArrayEquals(expected, managerCountNull.getMoviesReverseAdd());
    }

    @Test
    void shouldFindLastTenMoviesCount5() {
        MovieData[] expected = moviesExpectedFindLast10Count5;
        managerCount5.setMovies(moviesTestList10);
        managerCount5.findLast();
        Assertions.assertArrayEquals(expected, managerCount5.getMoviesReverseAdd());
    }

}

