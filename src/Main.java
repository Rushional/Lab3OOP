import Interface.ApplicationInitiator;
import Interface.GuiApplication;

import java.util.Scanner;

// Everything is in English to minimize readability and maximize confusion!
public class Main {
    public static void main(String[] args) {
//        var application = new Model.Application();
//        application.run();
        ApplicationInitiator initiator = new ApplicationInitiator();
        GuiApplication application = initiator.startApplication();
    }
}
