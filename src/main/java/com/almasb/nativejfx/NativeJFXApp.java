package com.almasb.nativejfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public class NativeJFXApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene((Parent) FXMLLoader.load(getClass().getResource("ui.fxml"))));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
