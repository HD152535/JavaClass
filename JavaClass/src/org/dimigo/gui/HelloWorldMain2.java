package org.dimigo.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloWorldMain2 extends Application {

	public static void main(String[] args) {
		// Main 클래스 객체를 생성하고, 메인 윈도우 생성한 후 start() 메소드 호출
		launch();

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
		
		// Stage에 Scene 설정
		stage.setScene(new Scene(root));
		stage.setTitle("Hello, World");
		
		
		// 메인 윈도우 보이기
		stage.show();
		
	}

}
