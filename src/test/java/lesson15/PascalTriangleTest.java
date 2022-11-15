package lesson15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalTriangleTest {
    @Test
    public void generateTest() {
        PascalTriangle pascalTriangle = new PascalTriangle();
        List<List<Integer>> listExpected = new ArrayList<>();
        listExpected.add(Collections.singletonList(1));
        List<List<Integer>> listActual = pascalTriangle.generate(1);
        assertEquals(listExpected, listActual);

    }

}
