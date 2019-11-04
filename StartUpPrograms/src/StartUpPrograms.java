import java.awt.*;
import java.io.File;
import java.io.IOException;

public class StartUpPrograms {

    public static void main(String[] args) throws IOException {

        try {
            boolean flag = true;

            int temp;

            while (flag) {

                flag = false;

                for (int i = 0; i < 1; i++) {

                    launch("pathname");



                    flag = true;

                }
                break;

            }
        } catch (Exception e) {

            System.out.println("Something went wrong.");
        }


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
