package com.simbirsoft;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @BeforeAll
    protected static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    protected void dragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").$("header").shouldHave(text("B"));
    }
}
