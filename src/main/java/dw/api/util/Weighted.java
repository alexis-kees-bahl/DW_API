package dw.api.util;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

public interface Weighted {
    int getWeight();

    static <T extends Enum<T> & Weighted> T random(Class<T> enumClass) {
        return random(enumClass, t -> true);
    }

    static <T extends Enum<T> & Weighted> T random(Class<T> enumClass, Predicate<T> filter) {
        T[] filtered = Arrays.stream(enumClass.getEnumConstants())
                             .filter(filter)
                             .toArray(size -> (T[]) java.lang.reflect.Array
                                     .newInstance(enumClass, size));
        if (filtered.length == 0)
            throw new IllegalArgumentException("No elements match the filter in " + enumClass.getSimpleName());
        int total = 0;
        for (T t : filtered) total += t.getWeight();
        int roll = ThreadLocalRandom.current().nextInt(1, total + 1);
        int cumulative = 0;
        for (T t : filtered) {
            cumulative += t.getWeight();
            if (roll <= cumulative) return t;
        }
        throw new IllegalStateException("No element selected in " + enumClass.getSimpleName());
    }
}