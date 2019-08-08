import java.awt.*;
import java.io.File;
import java.io.IOException;

public class StartUpPrograms {

    public static void main(String[] args) throws IOException {

        launch("PATH_NAME");

    }

    public static void launch(String pathName) throws IOException {

        File file = new File(pathName);

        if(!Desktop.isDesktopSupported()) {
            System.out.println("Desktop is not supported.");
            return;
        } else {
            Desktop desktop = Desktop.getDesktop();
            if(file.exists()) {
                desktop.open(file);
            }
        }

    }
}
