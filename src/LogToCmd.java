import java.io.Console;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.awt.*;
import java.util.Date;

public class LogToCmd {
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy H:m:s");

    public void logInTerm(String message) {
        Console console = System.console();
        if(console != null && !GraphicsEnvironment.isHeadless()) {
            try {
                Runtime.getRuntime().exec("cmd.exe /c start; echo ["+formatter.format(new Date())+"] : "+message);
            }
            catch (IOException ioException) {
                System.out.println("cant write in cmd, are you on linux ?");
            }
        }
    }

}
