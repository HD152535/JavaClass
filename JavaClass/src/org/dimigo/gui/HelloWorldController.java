package org.dimigo.gui;

import javafx.application.Platform;
import javafx.scene.input.MouseEvent;

public class HelloWorldController {

	public void handleCloseAction(MouseEvent event){
		System.out.println("Button Clicked");
		Platform.exit();
	}
	
}
