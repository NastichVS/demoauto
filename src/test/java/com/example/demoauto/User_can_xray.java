package com.example.demoauto;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;

import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;




public class User_can_xray {

    public void user_can() {

        open("https://auto.ru/");
        $(By.linkText("Коммерческие")).click();
        $(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[1]/div[1]/span/label[2]/button/span")).shouldHave(text("Новые")).click();
        $(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div/div/div[1]/div/button/span/span"))
                .click();
        $(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div/div/div[1]/div/button/span"))
                .selectOption("Ford");
        $(By.xpath("//*[@id=\"listing-filters\"]/div[3]/div[3]")).click();
        $(By.xpath("//*[@id=\"listing-filters\"]/div[3]/div[3]/div[3]/button/span/span")).click();





    }


}
