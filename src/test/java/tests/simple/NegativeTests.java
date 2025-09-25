package tests.simple;

import helpers.Attach;
import io.qameta.allure.Step;
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
    @Step("Негатив тест 1")
    void someTest() {
        assertTrue(false);
    }

    @Test
    @Step("Негатив тест 2")
    void someTest1() {
        assertTrue(false);
    }

    @Test
    @Step("Негатив тест 3")
    void someTest2() {
        assertTrue(false);
    }

    @Test
    @Step("Негатив тест 4")
    void someTest3() {
        assertTrue(false);
    }

    @Test
    @Step("Негатив тест 5")
    void someTest4() {
        assertTrue(false);
    }

    @Test
    @Step("Негатив тест 6")
    void someTest5() {
        assertTrue(false);
    }

    @Test
    @Step("Негатив тест 7")
    void someTest6() {
        assertTrue(false);
    }

}