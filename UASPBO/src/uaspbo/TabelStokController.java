/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hamdani Zulva
 */
public class TabelStokController implements Initializable {

    @FXML
    private TableColumn<MerchList, String> namaMerch;
    @FXML
    private TableColumn<MerchList, String> jmlStok;
    @FXML
    private TableColumn<MerchList, String> jmlTerjual;
    @FXML
    private Button backBtn;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private TableView<MerchList> tableView;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        namaMerch.setCellValueFactory(new PropertyValueFactory<>("namaMerch"));
        jmlStok.setCellValueFactory(new PropertyValueFactory<>("stok"));
        jmlTerjual.setCellValueFactory(new PropertyValueFactory<>("terjual"));
        
        try {
            ObservableList<MerchList> list = getMerchList();
            tableView.setItems(list);
        } catch (Exception ex) {
            System.out.println("error");
        }
    }    

    @FXML
    private void backBtnClicked(ActionEvent event) throws Exception {
         root = FXMLLoader.load(getClass().getResource("MenuKasir.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Overlooked Store");
    }

    private ObservableList<MerchList> getMerchList() throws Exception {        
        ObservableList<MerchList> list = FXCollections.observableArrayList();
        String container="";
        String[] arr, shirt, hoodie, keychain, bracelet, pants, sticker;
        File f = new File("merch.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            container += sc.nextLine()+";";
        }
        arr = container.split(";");
        shirt = arr[0].split(",");
        hoodie = arr[1].split(",");
        keychain = arr[2].split(",");
        bracelet = arr[3].split(",");
        pants = arr[4].split(",");
        sticker = arr[5].split(",");
        
        list.add(new MerchList(shirt[0], shirt[1], shirt[2]));
        list.add(new MerchList(hoodie[0], hoodie[1], hoodie[2]));
        list.add(new MerchList(keychain[0], keychain[1], keychain[2]));
        list.add(new MerchList(bracelet[0], bracelet[1], bracelet[2]));
        list.add(new MerchList(pants[0], pants[1], pants[2]));
        list.add(new MerchList(sticker[0], sticker[1], sticker[2]));
        
        return list;
    }
    
}
