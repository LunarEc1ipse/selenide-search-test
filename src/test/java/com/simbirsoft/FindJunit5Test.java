package com.simbirsoft;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FindJunit5Test {

    @BeforeAll
    protected static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    protected void FindSoftAssertionsTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("[data-filterable-for=wiki-pages-filter]")
                .shouldHave(text("SoftAssertions")).click();
        $("#user-content-3-using-junit5-extend-test-class")
                .parent().shouldHave(text("Using JUnit5 extend test class:"));
    }
}
