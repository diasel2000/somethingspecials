package com.somespecial;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class TelegramBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
    }

    @Override
    public String getBotUsername() {
        return "free_money_fr_bot";
    }

    @Override
    public String getBotToken() {
        return "1081417186:AAEFx5f5cQ1Md5fFoeNqJon_Fx50-LEaZbE";
    }
}
