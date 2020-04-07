package Interface;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class ApplicationInitiator {
    private Application application;

    public Application startApplication() {
        try {
            SwingUtilities.invokeAndWait(() -> {
                application = new Application();
            });
        } catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace(System.out);
        }
        return application;
    }
}
