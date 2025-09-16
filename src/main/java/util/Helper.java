package util;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Helper {
    public static Character[] stringToCharObjArray(String s) {
        return IntStream.range(0, s.length())
                .mapToObj(s::charAt)
                .toArray(Character[]::new);
    }
}
