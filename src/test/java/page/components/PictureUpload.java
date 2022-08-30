package page.components;

import static com.codeborne.selenide.Selenide.$;

public class PictureUpload {
    public PictureUpload setPicture(String value){
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }
}