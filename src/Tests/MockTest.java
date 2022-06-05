package Tests;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class MockTest {

    @Test
    /**
     * IF diesel fuel consuption will be changed in class it will not fail the test later
     * P.S test must have some logic.
     */
    void getDiesielEngine() {
        Diesel diesielEngine = Mockito.mock(Diesel.class);
        Mockito.when(diesielEngine.getFuelConsuption()).thenReturn(6.5d);
    }
}