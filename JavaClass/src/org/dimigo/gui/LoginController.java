package org.dimigo.gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class LoginController {
   @FXML private TextField txtId;
   @FXML private TextField txtPwd;
   @FXML private Label lblResult;
   
     @FXML public void handleLoginAction(ActionEvent event)
         {
            String id = txtId.getText(); //입력값 가져옴
            String pwd = txtPwd.getText();
            
            if("admin".equals(id) && "admin".equals(pwd))
            {
               lblResult.setText("로그인 되었습니다.");
            }
            else
            {
               lblResult.setText("잘못된 로그인 정보입니다.");
            }
         }
     @FXML public void handleCloseAction(ActionEvent event)
         {
            Platform.exit();
         }
}