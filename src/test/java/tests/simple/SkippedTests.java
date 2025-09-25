package tests.simple;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SkippedTests {

    @Test
    @Disabled
    @Step("Пропуск тест 1")
    void someTest() {
        assertTrue(false);
    }

    @Test
    @Step("Пропуск тест 2")
    @Disabled("Some reason")
    void someTest1() {
        assertTrue(false);
    }

}