package Test;

import java.util.Arrays;

/**
 * Created by iantaman on 01.10.2015.
 */
public enum Direction {
    UP {
        public Direction opposite() { return DOWN; }
    },
    DOWN {
        public Direction opposite() { return UP; }
    };

    public abstract Direction opposite();
}

enum Season { WINTER, SPRING, SUMMER, AUTUMN }

class Clazz {
    public static void main(String[] args) {
        Direction direction = Direction.DOWN.opposite();
        System.out.println(direction);
    }
}