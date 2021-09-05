package com.example.demoauto;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.commands.SetValue;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Selectors.*;

public class MainPageTest {
    private final MainPage mainPage = new MainPage();



    @Test
    public void search() {
        open("https://auto.ru/");
        $(By.className("TextInput__control")).setValue("lada xray");
        sleep(3000);
        $(By.cssSelector("#app > div > div > header > div.Header__firstLine.Layout > div > div.RichInput.Header__searchLine.SearchLineSuggest > div.RichInput__popup.RichInput__popup_theme_default.Header__searchLinePopup > div > div > div > div.SearchLineSuggestItem__right > div.SearchLineSuggestItem__title")).shouldBe(visible).click();
        $(By.cssSelector("#listing-filters > div.ListingCars.ListingCars_outputType_list > div:nth-child(2) > div > div.ListingItem__description > div.ListingItem__column.ListingItem__column_left > div.ListingItem__columnRowFlex > div.ListingItem__columnCellSummary > h3 > a")).click();
        sleep(3000);
        $(By.linkText("LADA (ВАЗ) XRAY I"));


    }


}
