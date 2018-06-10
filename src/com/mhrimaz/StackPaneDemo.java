/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class StackPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane root = new StackPane();

        for (int i = 0; i < 90; i += 10) {
            Rectangle rectangle = new Rectangle(300, 300);
            rectangle.setRotate(i);
            rectangle.setFill(Color.rgb(i + 90, i / 20, i / 30));
            root.getChildren().add(rectangle);
        }

        Label label = new Label("JavaFX is Awesome");
        label.setFont(Font.font(24));
        label.setTextFill(Color.WHITE);
        root.getChildren().add(label);

        Scene scene = new Scene(root, 600, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
