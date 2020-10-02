package be.pxl.ja.streamingservice.model;

import static org.junit.jupiter.api.Assertions.*;

import be.pxl.ja.streamingservice.exception.InvalidDateException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ProfileSetDateOfBirthTest {

    @Test
    public void throwsInvalidDateExceptionWhenInvalidDateOfBirth() {
        Profile profile = new Profile("Maude");
        InvalidDateException invalidDateException = assertThrows(InvalidDateException.class, () -> {
            profile.setDateOfBirth(LocalDate.now().plusMonths(1));
        });
        assertTrue(invalidDateException.getMessage().contains("dateOfBirth"));

    }
}
