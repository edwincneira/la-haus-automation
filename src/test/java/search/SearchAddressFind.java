package search;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class SearchAddressFind {

    public static final Target BTN_SEARCH = Target.the("Screen <Buscar>").located(MobileBy.xpath("//android.widget.ImageView[contains(@content-desc, \"Pestaña 1 de 5\")]"));
    public static final Target BTN_LIST = Target.the("Select List screen <Lista>").located(MobileBy.xpath("//android.widget.Button[@content-desc=\"Lista\"]"));
    public static final Target TXT_WHERE_SEARCH = Target.the("User Click Search <¿Dónde buscas?>").located(MobileBy.xpath("//android.view.View[contains(@content-desc, \"¿Dónde buscas?\")]"));
    public static final Target TXT_INPUT_WHERE_SEARCH = Target.the("User Send Key Search <¿Dónde buscas?>").located(MobileBy.xpath("//android.widget.EditText[contains(@text, \"¿Dónde buscas?\")]"));
    public static final Target SCREEN_FIRST_HOME = Target.the("First house on screen <Casa>").located(MobileBy.xpath("//android.view.View[contains(@content-desc, \"Casa\")]"));

}
