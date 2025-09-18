package tests.simple;

import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class NegativeTests {

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();

    }

    @Test
    void someTest() {
        assertTrue(false);
    }

    @Test
    void someTest1() {
        assertTrue(false);
    }

    @Test
    void someTest2() {
        assertTrue(false);
    }

    @Test
    void someTest3() {
        assertTrue(false);
    }

    @Test
    void someTest4() {
        assertTrue(false);
    }

    @Test
    void someTest5() {
        assertTrue(false);
    }

    @Test
    void someTest6() {
        assertTrue(false);
    }

}