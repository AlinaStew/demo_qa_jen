package properties.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;

@Feature("Выбор BrowserA")
public class SystemPropertiesTests {

    @Test
    @Step("Параметр тест")
    void systemPropertiesTest() {
        String browser = System.getProperty("browser");

        System.out.println(browser); // null
    }

    @Test
    @Step("Параметр тест 1")
    @DisplayName("Выбор браузера 1")
    void systemProperties1Test() {
        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser");

        System.out.println(browser); // chrome
    }

    @Test
    @Step("Параметр тест 2")
    @DisplayName("Выбор браузера 2")
    void systemProperties2Test() {
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser); // mozilla
    }

    @Test
    @Step("Параметр тест 3")
    @DisplayName("Выбор браузера 3")
    void systemProperties3Test() {
        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser); // chrome
    }

    @Test
    @Tag("property")
    @DisplayName("Обраузер мозила")
    @Step("Параметр тест 4")
    void systemProperties4Test() {
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser);
        // gradle property_test
        // mozilla

        // gradle property_test -Dbrowser=opera
        // opera
    }

    @Test
    @Tag("hello")
    @Step("Параметр тест 5")
    @DisplayName("Дефолт студент")
    void systemProperties5Test() {
        String name = System.getProperty("name", "default student");
        String message = format("Hello, %s!", name);

        System.out.println(message);
        // gradle hello_test
        // Hello, default student!

        // gradle hello_test -Dname=Alex Egorov
        // BUILD FAILED: Task 'Egorov' not found in root project 'demoqa-tests-19'.

        // gradle hello_test -Dname="Alex Egorov"
        // gradle hello_test "-Dname=Alex Egorov"
        // Hello, Alex Egorov!

    }
}
