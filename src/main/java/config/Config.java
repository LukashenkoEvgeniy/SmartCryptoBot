package config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    private static Logger logger = LoggerFactory.getLogger(Config.class);
    private static final String CONFIGURATION_BOT_FILE = "./config/telegram/bot.properties";

    public static String BOT_NAME;
    public static String BOT_TOKEN;


    public static void load() {
        Properties botSettings = new Properties();

        try(InputStream inputStream = new FileInputStream(new File(CONFIGURATION_BOT_FILE))){
            botSettings.load(inputStream);
            inputStream.close();
            logger.info("Config was loaded");
        } catch (IOException e) {
            logger.info("Config error on config load load");
            e.printStackTrace();
        }

        BOT_NAME = botSettings.getProperty("BotName", "xxx");
        BOT_TOKEN = botSettings.getProperty("BotToken", "xxx");

        System.out.println(BOT_NAME);
    }
}
