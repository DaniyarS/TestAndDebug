import org.example.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    void checkClassification() {

        // equilateral - if all three sides have equal length
        Triangle triangle = new Triangle(10, 10, 10);
        Assertions.assertEquals(triangle.classify(), "equilateral"); // SUCCESS

        // impossible - if the given side lengths do not form a triangle
        Triangle triangle1 = new Triangle(0, 10, 10);
        Assertions.assertEquals(triangle1.classify(), "impossible"); // SUCCESS

        // isosceles - if two sides have equal length
        Triangle triangle2 = new Triangle(10, 5, 10);
        Assertions.assertEquals(triangle2.classify(), "isossceles");

        Triangle triangle3 = new Triangle(10, 10, 10);
        Assertions.assertEquals(triangle3.classify(), "equilateral");
    }
}
