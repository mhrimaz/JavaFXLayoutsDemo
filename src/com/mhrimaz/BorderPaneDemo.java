/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class BorderPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        Rectangle left = new Rectangle(100, 400, Color.BLUEVIOLET);
        root.setLeft(left);
        Rectangle right = new Rectangle(100, 400, Color.BLUEVIOLET);
        root.setRight(right);
        Rectangle center = new Rectangle(200, 200, Color.GREEN);
        root.setCenter(center);
        Rectangle top = new Rectangle(400, 100, Color.RED);
        root.setTop(top);
        Rectangle bottom = new Rectangle(400, 100, Color.RED);
        root.setBottom(bottom);

        //Alignments
        BorderPane.setAlignment(bottom, Pos.CENTER);

        //Margin
        BorderPane.setMargin(left, new Insets(12, 12, 12, 12));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
