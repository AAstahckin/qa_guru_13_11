package page.components;

import static com.codeborne.selenide.Selenide.$;

public class CalenderComponent {
    public void setDate(String month, String year, String day) {
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day).click();
    }
}
