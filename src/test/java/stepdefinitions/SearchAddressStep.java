package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.SearchAddress;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SearchAddressStep {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^(.*) search the address (.*)$")
    public void loginSuccess(String user, String address) throws Exception {
        theActorCalled(user).attemptsTo(SearchAddress.then(address));
    }
}
