package Interface;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class ApplicationInitiator {
    private GuiApplication application;

    public GuiApplication startApplication() {
        try {
            SwingUtilities.invokeAndWait(() -> {
                application = new GuiApplication();
            });
        } catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace(System.out);
        }
        return application;
    }
}
