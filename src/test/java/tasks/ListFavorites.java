package tasks;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utilities.Sleep;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static search.ListFavoritesFind.*;

public class ListFavorites implements Task {

    private String nameList;

    public ListFavorites(String nameList) {
        this.nameList = nameList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FAVORITES),
                Click.on(BTN_NEW_LIST),
                Click.on(TXT_NAME_LIST),
                Enter.theValue(nameList).into(TXT_NAME_LIST),
                Click.on(BTN_CREATE_LIST_AND_SAVE),
                WaitUntil.the(BTN_SEARCH_PROPERTIES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_SEARCH_PROPERTIES)
        );
    }

    public static ListFavorites addList(String nameList){
        return Tasks.instrumented(ListFavorites.class, nameList);
    }
}
