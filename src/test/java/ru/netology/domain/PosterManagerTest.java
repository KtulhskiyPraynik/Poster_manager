package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager.PosterManager;


public class PosterManagerTest {
    Poster first = new Poster(1, "Bloodshot", "action movie");
    Poster second = new Poster(2, "Forward", "cartoon");
    Poster third = new Poster(3, "Hotel Belgrade", "comedy");
    Poster fourth = new Poster(4, "Gentlemen", "action movie");
    Poster fifth = new Poster(5, "The invisible man", "horror");
    Poster sixth = new Poster(6, "Trolls. World tour", "cartoon");
    Poster seventh = new Poster(7, "Number one", "comedy");

    @Test
    public void findAll(){
        PosterManager manager = new PosterManager();

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Poster[] actual = manager.findAll();
        Poster[] expected = {first, second, third, fourth, fifth, sixth, seventh};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast(){
        PosterManager manager = new PosterManager();

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Poster[] actual = manager.findLast();
        Poster[] expected = {seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast2(){
        PosterManager manager = new PosterManager(5);

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Poster[] actual = manager.findLast();
        Poster[] expected = {seventh, sixth, fifth, fourth, third};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast3(){
        PosterManager manager = new PosterManager(13);

        manager.add (first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        Poster[] actual = manager.findLast();
        Poster[] expected = {seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
}
