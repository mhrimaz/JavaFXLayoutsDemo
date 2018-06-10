/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class SplitPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        SplitPane root = new SplitPane();

        Button button21 = new Button("Click Me21");
        Button button22 = new Button("Click Me22");
        VBox vBox1 = new VBox(button21, button22);

        Button button11 = new Button("Click Me11");
        Button button12 = new Button("Click Me12");
        BorderPane borderPane = new BorderPane(null, button12, null, button11, null);

        Button button31 = new Button("Click Me31");
        Button button32 = new Button("Click Me32");
        VBox vBox2 = new VBox(button31, button32);

        root.setDividerPositions(0.2f, 0.8f);
        root.getItems().addAll(vBox1, borderPane, vBox2);

        Scene scene = new Scene(root, 500, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
