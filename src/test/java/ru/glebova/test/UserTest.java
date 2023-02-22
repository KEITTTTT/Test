package ru.glebova.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class UserTest {
    private User user1;
    private User user2;
    private User user3;


    @Before
    public void setUp() {
        user1 = new User("glebova", "e.glebova@mail.ru");
        user2 = new User("platonov", "platonov@gmail");
        user3 = new User("supergirl", "super@mail.ru");
    }

    @Test
    public void isUserWithParametersCreatedCorrectly() {
        User testUser = new User("svetik", "svetlana1992@gmail.com");
        assertEquals("svetik", testUser.getLogin());
        assertEquals("svetlana1992@gmail.com", testUser.getEmail());
    }

    @Test
    public void isUserWithoutParametersCreatedCorrectly() {
        User testUser = new User();
        assertEquals(null, testUser.getLogin());
        assertEquals(null, testUser.getEmail());
    }

    @Test
    public void areEmailAndLoginEqual() {
        assertEquals(user3.getEmail(), user3.getLogin());
    }

    @Test
    public void isEmailCorrect() {
        boolean isCorrect = true;
        if (!user3.getEmail().contains("@") || !user3.getEmail().contains("."))
            assertFalse(isCorrect);
    }
}
