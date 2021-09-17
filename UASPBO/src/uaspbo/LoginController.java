/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hamdani Zulva
 */
public class LoginController implements Initializable {

    @FXML
    private TextField idTf;
    @FXML
    private PasswordField passPf;
    @FXML
    private Button loginBtn;
    @FXML
    private Label warningLb;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnAction(ActionEvent event) throws Exception{
        boolean verif = false;
        String[] idpass;
        String container;
        File f = new File("karyawan.txt");
        BufferedReader bf = new BufferedReader(new FileReader(f));
        while((container = bf.readLine()) !=null){
            idpass= container.split(",");
            if(idTf.getText().equalsIgnoreCase(idpass[0])&& passPf.getText().equalsIgnoreCase(idpass[1])){
                verif = true;
                break;
            }else{
                verif = false;
            }
        }
        
        if(verif == true){
            root = FXMLLoader.load(getClass().getResource("MenuKasir.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.setTitle("Overlooked Store");
        }else{
            warningLb.setText("ID atau Password masukan anda salah!!!");
        }
    }
    
}
