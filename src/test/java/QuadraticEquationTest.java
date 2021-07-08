import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {

    @Test
    void testRoots() {
        double[] Equation = {1, -18};
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 17, -18);
        quadraticEquation.findRoots();
        Assertions.assertArrayEquals(Equation, quadraticEquation.roots);
    }

    @Test
    void testOneRoots() {
        double[] Equation = {-2};
        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 4, 4);
        quadraticEquation.findRoots();
        Assertions.assertArrayEquals(Equation, quadraticEquation.roots);
    }

    @Test
    void testNoRoots() {
        double[] roots = new QuadraticEquation(5, 3, 4).findRoots();
        Assertions.assertEquals(null, roots);
    }
}