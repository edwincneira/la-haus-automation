package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utilities.Sleep;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static search.SearchAddressFind.*;

public class SearchAddress implements Task {

    private String address;

    public SearchAddress(String address) {
        this.address = address;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Sleep.aSeconds(3),
                Click.on(BTN_LIST),
                WaitUntil.the(TXT_WHERE_SEARCH, isVisible()).forNoMoreThan(4).seconds(),
                Click.on(TXT_WHERE_SEARCH),
                WaitUntil.the(TXT_INPUT_WHERE_SEARCH, isVisible()).forNoMoreThan(3).seconds(),
                Enter.theValue(address).into(TXT_INPUT_WHERE_SEARCH),
                Click.on(SCREEN_FIRST_HOME)
        );
    }

    public static SearchAddress then(String address){
        return Tasks.instrumented(SearchAddress.class, address);
    }
}
