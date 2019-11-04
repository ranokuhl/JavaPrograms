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

//                    launch("C:\\Users\\rhino\\AppData\\Local\\Microsoft\\Teams\\Update.exe --processStart\\Teams.exe");
//                    launch("C:\\Program Files\\IKEA Management Tools\\IKEA Management Utility.exe");
//                    launch("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
                    launch("C:\\app-win\\Microsoft VS Code\\Code.exe");
/*                    launch("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
                    launch("C:\\app-win\\FreeCommander XE\\FreeCommander.exe");
                    launch("C:\\app-win\\templateKit.exe");
                    launch("C:\\Users\\rhino\\AppData\\Local\\slack\\slack.exe");
                    launch("C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
                    launch("C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.EXE");*/


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
