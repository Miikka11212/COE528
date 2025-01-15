package lab1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FlightTest {

    @Test
    public void testConstructor() {
        // Test with valid arguments
        Flight flight = new Flight(123, "New York", "Los Angeles", "10:00 AM", 200, 500.0);

        // Assert that the object was created correctly
        assertEquals(123, flight.getFlightNumber());
        assertEquals("New York", flight.getOrigin());
        assertEquals("Los Angeles", flight.getDestination());
        assertEquals("10:00 AM", flight.getDepartureTime());
        assertEquals(200, flight.getCapacity());
        assertEquals(500.0, flight.getOriginalPrice());
    }

    @Test
    public void testInvalidConstructor() {
        // Test with invalid arguments (origin and destination are the same)
        assertThrows(IllegalArgumentException.class, () -> {
            new Flight(123, "New York", "New York", "10:00 AM", 200, 500.0);
        });
    }

    @Test
    public void testPublicMethods() {
        // Create a new Flight object
        Flight flight = new Flight(123, "New York", "Los Angeles", "10:00 AM", 200, 500.0);

        // Test setters and getters
        flight.setFlightNumber(456);
        assertEquals(456, flight.getFlightNumber());

        flight.setOrigin("Chicago");
        assertEquals("Chicago", flight.getOrigin());

        flight.setDestination("Miami");
        assertEquals("Miami", flight.getDestination());

        flight.setDepartureTime("5:00 PM");
        assertEquals("5:00 PM", flight.getDepartureTime());

        flight.setCapacity(150);
        assertEquals(150, flight.getCapacity());

        flight.setOriginalPrice(300.0);
        assertEquals(300.0, flight.getOriginalPrice());

        // Test bookASeat method
        assertTrue(flight.bookASeat()); // Seat booked
        assertEquals(149, flight.getNumberOfSeatsLeft()); // Check remaining seats

        // Test toString method
        String expected = "Flight 456, Chicago to Miami, 5:00 PM, original price: $300.0";
        assertEquals(expected, flight.toString());
    }
}
