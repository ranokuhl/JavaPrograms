import java.awt.*;
import java.io.File;
import java.io.IOException;

public class StartUpPrograms {


        public static void main(String[]args) throws IOException{

                File file = new File("name_of_file");

                if(!Desktop.isDesktopSupported()){
                System.out.println("Desktop is not supported");
                return;
                }

                Desktop desktop = Desktop.getDesktop();
                if(file.exists()) desktop.open(file);

        }

}
