package services.telegram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class TelegramManager {

    private Logger logger = LoggerFactory.getLogger(TelegramManager.class);


    public TelegramManager() {
        ApiContextInitializer.init(); // Инициализируем апи
        TelegramBotsApi botAPI = new TelegramBotsApi();
        try {
            botAPI.registerBot(new Bot());
            logger.info("Bot successfully started!");
        } catch (TelegramApiException e) {
            logger.error("Bot crushed");
            e.printStackTrace();
        }
    }

}
