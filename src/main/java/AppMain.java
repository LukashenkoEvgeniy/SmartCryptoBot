import config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.telegram.TelegramManager;

public class AppMain {
    static Logger logger = LoggerFactory.getLogger(AppMain.class);


    public static void main(String[] args) {
        logger.info("Server Started");
        Config.load();
        new TelegramManager();

    }
}
