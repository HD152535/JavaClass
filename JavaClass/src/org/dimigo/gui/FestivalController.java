package org.dimigo.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class FestivalController implements Initializable {

	@FXML
	private DatePicker dpRegDate;

	@FXML
	private RadioButton rbFirst;
	@FXML
	private RadioButton rbSecond;
	@FXML
	private RadioButton rbThird;

	@FXML
	private ComboBox<String> cbClass;

	@FXML
	private TextField tfName;

	@FXML
	private CheckBox ckbMusic;
	@FXML
	private CheckBox ckbDance;
	@FXML
	private CheckBox ckbBand;

	@FXML
	public void handleRegAction(ActionEvent event) {
		System.out.println(dpRegDate.getValue());
		System.out.println(rbFirst.isSelected() ? "1학년" :
							rbSecond.isSelected() ? "2학년" : "3학년");
		System.out.println(cbClass.getValue());
		System.out.println(tfName.getText());
		if(ckbMusic.isSelected()) System.out.println("음악");
		if(ckbDance.isSelected()) System.out.println("댄스");
		if(ckbBand.isSelected()) System.out.println("밴드");
	}

	@FXML
	public void handleCloseAction(ActionEvent event) {
		Platform.exit();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cbClass.getItems().addAll("1반", "2반", "3반", "4반", "5반", "6반");
		
	}

	
}
