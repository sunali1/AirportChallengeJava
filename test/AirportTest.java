import org.junit.Test;

import static org.junit.Assert.*;

public class AirportTest {


    @Test
    public void createInstance() {
        Airport heathrow = new Airport();
        assertTrue(heathrow instanceof Airport);

    }

    @Test
    public void land() {
        Airport heathrow = new Airport();
        assertEquals(true , heathrow.land("easyJet"));

    }
}