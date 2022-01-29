package ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DegreesTest {
    @Test
    @DisplayName("WHEN converting fahrenheit  to celsius temperature THEN return fahrenheitToCelsius")
    void testFahrenheitToCelsius() {
        //SETUP
        Degrees degrees = new Degrees();
        //RUN
        double actual = degrees.fahrenheitToCelsius(100);
        //ASSERT
        assertThat(actual).isEqualTo(37.777777778);

    }

    @Test
    @DisplayName("WHEN converting celsius temperature to fahrenheit temperature THEN return celsiusToFahrenheit")
    void testCelsiusToFahrenheit() {
        //SETUP
        Degrees degrees = new Degrees();
        //RUN
        double actual = degrees.celsiusToFahrenheit(10);
        //ASSERT
        assertThat(actual).isEqualTo(50);
    }
}
