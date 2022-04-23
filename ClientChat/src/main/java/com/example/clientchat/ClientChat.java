package com.example.clientchat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientChat extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ClientChat.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Chat app");
        stage.setScene(scene);
        stage.show();

        ClientController controller = fxmlLoader.getController();
        controller.userList.getItems().addAll("user1", "user2");

    }

    public static void main(String[] args) {
        launch();
    }
}