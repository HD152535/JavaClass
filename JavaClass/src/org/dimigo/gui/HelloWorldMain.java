package org.dimigo.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorldMain extends Application {

	public static void main(String[] args) {
		// Main 클래스 객체를 생성하고, 메인 윈도우 생성한 후 start() 메소드 호출
		launch();

	}

	@Override
	public void start(Stage stage) throws Exception {
		// 컨테이너 생성
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		
		// UI 컨트롤 생성
		Label label = new Label();
		label.setText("Hello, World");
		label.setFont(new Font(70));
		
		Button button = new Button("닫기");
		
		// 이벤트 핸들러 등록
		button.setOnMouseClicked(new EventHandler<Event>(){

			@Override
			public void handle(Event event) {
				System.out.println("Button Clicked");
				Platform.exit();
			}
			
		});
		
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		
		// Scene 생성
		Scene scene = new Scene(root, 500, 400);
		
		
		// Stage에 Scene 설정
		stage.setScene(scene);
		stage.setTitle("Hello, World");
		
		
		// 메인 윈도우 보이기
		stage.show();
		
	}

}
