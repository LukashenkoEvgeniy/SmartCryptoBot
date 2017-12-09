package services.telegram;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class TelegramManager {

    public TelegramManager() {

        ApiContextInitializer.init(); // Инициализируем апи
        TelegramBotsApi botAPI = new TelegramBotsApi();
        try {
            botAPI.registerBot(new Bot());
            System.out.println("Bot successfully started!");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }


    }

}
