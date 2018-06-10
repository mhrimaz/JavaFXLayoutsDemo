/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class TilePaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TilePane root = new TilePane(Orientation.HORIZONTAL);
        root.setHgap(10);
        root.setVgap(30);
        root.setPadding(new Insets(15));

        root.setTileAlignment(Pos.TOP_CENTER);

        Button button1 = new Button("Button1");
        root.getChildren().add(button1);

        Button button2 = new Button("Button2");
        button2.setPrefSize(100, 100);
        root.getChildren().add(button2);

        TextField textField = new TextField("Text Field");
        textField.setPrefWidth(110);
        root.getChildren().add(textField);

        Rectangle rectangle = new Rectangle(200, 200);

        root.getChildren().add(rectangle);

        Scene scene = new Scene(root, 550, 250);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
