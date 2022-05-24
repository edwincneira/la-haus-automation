package utilities;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Sleep implements Interaction {

    private int seg;

    public Sleep(int seg) {
        this.seg = seg;
    }

    public static Sleep aSeconds(int seg){
        return instrumented(Sleep.class, seg*1000);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(seg);
    }
}
