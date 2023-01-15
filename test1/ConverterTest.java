import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterTest {

    @org.junit.jupiter.api.Test
    void getCelsius() {
        assertEquals(0.0, 0.0);
    }

    @org.junit.jupiter.api.Test
    void setCelsius() {
        assertEquals(-35, -31);

        assertEquals(0, -17.77);
    }

    @org.junit.jupiter.api.Test
    void getFahrenheit() {
        assertEquals(0.0, 0.0);
    }

    @org.junit.jupiter.api.Test
    void setFahrenheit() {
        assertEquals(30, 86);

        assertEquals(0, 32);

    }

    @Test
    void setfahrenheit() {
        Converter setfahrenheit = new Converter();
        setfahrenheit.setFahrenheit(0);
       assertThat(5).isEqualTo(5);
    }

}