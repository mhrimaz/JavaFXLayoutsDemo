/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mhrimaz;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

/**
 *
 * @author mhrimaz
 */
public class TabPaneDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        TabPane root = new TabPane();
        Tab tab1 = new Tab("First Tab");
        tab1.setContent(new Button("Hello"));
        Tab tab2 = new Tab("Second Tab");
        tab2.setContent(new Button("World"));
        root.getTabs().addAll(tab1, tab2);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
