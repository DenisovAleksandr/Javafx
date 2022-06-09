package ru.gb.homework4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField userMessage;
    @FXML
    private TextArea historyMessage;

    

    public void sendMessageButtonClick(ActionEvent actionEvent) {
        String message = userMessage.getText();
        if (message.isBlank()){
            return;
        }
        historyMessage.appendText("You: "+message+"\n");
        userMessage.clear();
        userMessage.requestFocus();
    }
}