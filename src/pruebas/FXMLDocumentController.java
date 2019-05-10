/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author PARRA
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label saludo;
    @FXML
    private Button escribir;
    @FXML
    private Button borrar;
    
    @FXML
    private void  escribe(ActionEvent e){
        saludo.setText("Hola mundo");
        escribir.setCursor(Cursor.WAIT);
    }
    
    @FXML
    private void  borra(ActionEvent e){
        System.out.println("Hola mundo");
        saludo.setText("");
    }
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO //primera ejecucion
    }    
    
}
