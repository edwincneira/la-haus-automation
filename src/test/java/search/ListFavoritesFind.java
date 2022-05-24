package search;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ListFavoritesFind {

    public static final Target BTN_FAVORITES = Target.the("Item Favorites <Favoritos>").located(MobileBy.xpath("//android.widget.ImageView[contains(@content-desc, \"Pestaña 2 de 5\")]"));
    public static final Target BTN_NEW_LIST = Target.the("+ New List <Crear lista nueva>").located(MobileBy.xpath("//android.view.View[contains(@content-desc, \"Crear lista nueva\")]"));
    public static final Target TXT_NAME_LIST = Target.the("Name of list <Nombre").located(MobileBy.xpath("//android.widget.EditText[@text=\"Nombre\"]"));
    public static final Target BTN_CREATE_LIST_AND_SAVE = Target.the("Save list <Crear lista y guardar>").located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Crear lista y guardar\"]"));
    public static final Target BTN_SEARCH_PROPERTIES = Target.the("Search properties <Buscar propiedades>").located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Buscar propiedades\"]"));

}
