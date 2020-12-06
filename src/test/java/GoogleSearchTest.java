import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {

    @Test
    void selenideSearch() {

        open("https://www.google.com/");

        $("[name='q']").setValue("Selenide").pressEnter();

        $$("cite").findBy(text("selenide.org")).shouldBe(visible);

    }

}