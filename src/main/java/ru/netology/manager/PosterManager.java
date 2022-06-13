package ru.netology.manager;

import lombok.Data;
import ru.netology.domain.Poster;

@Data
public class PosterManager {
    private Poster[] items = new Poster[0];
    private int maxLength = 10;

    public PosterManager(int maxLength) {
        this.maxLength = maxLength;
    }

    public PosterManager() {
    }

    public void add(Poster item) {
        Poster[] tmp = new Poster[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Poster[] findAll() {
        return items;
    }

    public Poster[] findLast() {
        Poster[] items = findAll();
        int resultLength;
        if (items.length < maxLength) {
            resultLength = items.length;
        } else {
            resultLength = maxLength;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++){
            int index = items.length - i -1;
            result[i] = items[index];
        }
        return result;
    }
}
