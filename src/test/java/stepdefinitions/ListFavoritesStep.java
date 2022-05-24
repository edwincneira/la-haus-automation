package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.es.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.ListFavorites;
import tasks.SearchAddress;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class ListFavoritesStep {

    private String user = null;

    public ListFavoritesStep(){
    }

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("^(.*) add one favorite list with name (.*) item$")
    public void add_one_favorite_item(String user, String nameList) throws Exception {
        this.user = user;
        theActorCalled(user).attemptsTo(ListFavorites.addList(nameList));
    }

    @And("^Select one house on (.*)$")
    public void select_one_house_on(String address) throws Exception {
        theActorCalled(user).attemptsTo(SearchAddress.then(address));
    }

}
