/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspbo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hamdani Zulva
 */
public class MenuKasirController implements Initializable {

    @FXML
    private Button minShirt;
    @FXML
    private Button minHoodie;
    @FXML
    private Button minBracelet;
    @FXML
    private Button minKeychain;
    @FXML
    private Button minPants;
    @FXML
    private Button minSticker;
    @FXML
    private Button plusShirt;
    @FXML
    private Button plusHoodie;
    @FXML
    private Button plusKeychain;
    @FXML
    private Button plusBracelet;
    @FXML
    private Button plusPants;
    @FXML
    private Button plusSticker;
    @FXML
    private TextField shirtTf;
    @FXML
    private TextField hoodieTf;
    @FXML
    private TextField keychainTf;
    @FXML
    private TextField braceletTf;
    @FXML
    private TextField pantsTf;
    @FXML
    private TextField stickerTf;
    @FXML
    private TextField HShirt;
    @FXML
    private TextField HHoodie;
    @FXML
    private TextField HKeychain;
    @FXML
    private TextField HBracelet;
    @FXML
    private TextField HPants;
    @FXML
    private TextField HSticker;
    @FXML
    private TextField TotalTf;
    @FXML
    private Button PayBtn;
    @FXML
    private Button stockBtn;
    @FXML
    private Button LogoutBtn;
    @FXML
    private Button clrBtn;

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
    private void minShirtClicked(ActionEvent event) {
        if(Integer.parseInt(shirtTf.getText())==0){
            minShirt.setDisable(true);
        }else{
            int jml, harga;
            plusShirt.setDisable(false);
            jml = Integer.parseInt(shirtTf.getText())-1;
            harga = jml * 75000;
            shirtTf.setText(String.valueOf(jml));
            HShirt.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void minHoodieClicked(ActionEvent event) {
        if(Integer.parseInt(hoodieTf.getText())==0){
            minHoodie.setDisable(true);
        }else{
            int jml, harga;
            plusHoodie.setDisable(false);
            jml = Integer.parseInt(hoodieTf.getText())-1;
            harga = jml * 130000;
            hoodieTf.setText(String.valueOf(jml));
            HHoodie.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void minBraceletClicked(ActionEvent event) {
        if(Integer.parseInt(braceletTf.getText())==0){
            minBracelet.setDisable(true);
        }else{
            int jml, harga;
            plusBracelet.setDisable(false);
            jml = Integer.parseInt(braceletTf.getText())-1;
            harga = jml * 10000;
            braceletTf.setText(String.valueOf(jml));
            HBracelet.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void minKeychainClicked(ActionEvent event) {
        if(Integer.parseInt(keychainTf.getText())==0){
            minKeychain.setDisable(true);
        }else{
            int jml, harga;
            plusKeychain.setDisable(false);
            jml = Integer.parseInt(keychainTf.getText())-1;
            harga = jml * 20000;
            keychainTf.setText(String.valueOf(jml));
            HKeychain.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void minPantsClicked(ActionEvent event) {
        if(Integer.parseInt(pantsTf.getText())==0){
            minPants.setDisable(true);
        }else{
            int jml, harga;
            plusPants.setDisable(false);
            jml = Integer.parseInt(pantsTf.getText())-1;
            harga = jml * 80000;
            pantsTf.setText(String.valueOf(jml));
            HPants.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void minStickerClicked(ActionEvent event) {
        if(Integer.parseInt(stickerTf.getText())==0){
            minSticker.setDisable(true);
        }else{
            int jml, harga;
            plusSticker.setDisable(false);
            jml = Integer.parseInt(stickerTf.getText())-1;
            harga = jml * 10000;
            stickerTf.setText(String.valueOf(jml));
            HSticker.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void plusShirtClicked(ActionEvent event) {
        if(Integer.parseInt(shirtTf.getText())==10){
            plusShirt.setDisable(true);
        }else{
            int jml, harga;
            minShirt.setDisable(false);
            jml = Integer.parseInt(shirtTf.getText())+ 1;
            harga = jml * 75000;
            shirtTf.setText(String.valueOf(jml));
            HShirt.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void plusHoodieClicked(ActionEvent event) {
        if(Integer.parseInt(hoodieTf.getText())==10){
            plusHoodie.setDisable(true);
        }else{
            int jml, harga;
            minHoodie.setDisable(false);
            jml = Integer.parseInt(hoodieTf.getText())+ 1;
            harga = jml * 130000;
            hoodieTf.setText(String.valueOf(jml));
            HHoodie.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void plusKeychainClicked(ActionEvent event) {
        if(Integer.parseInt(keychainTf.getText())==10){
            plusKeychain.setDisable(true);
        }else{
            int jml, harga;
            minKeychain.setDisable(false);
            jml = Integer.parseInt(keychainTf.getText())+ 1;
            harga = jml * 20000;
            keychainTf.setText(String.valueOf(jml));
            HKeychain.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void plusBraceletClicked(ActionEvent event) {
        if(Integer.parseInt(braceletTf.getText())==10){
            plusBracelet.setDisable(true);
        }else{
            int jml, harga;
            minBracelet.setDisable(false);
            jml = Integer.parseInt(braceletTf.getText())+ 1;
            harga = jml * 10000;
            braceletTf.setText(String.valueOf(jml));
            HBracelet.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void plusPantsClicked(ActionEvent event) {
        if(Integer.parseInt(pantsTf.getText())==10){
            plusPants.setDisable(true);
        }else{
            int jml, harga;
            minPants.setDisable(false);
            jml = Integer.parseInt(pantsTf.getText())+ 1;
            harga = jml * 80000;
            pantsTf.setText(String.valueOf(jml));
            HPants.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void plusStickerClicked(ActionEvent event) {
        if(Integer.parseInt(stickerTf.getText())==10){
            plusSticker.setDisable(true);
        }else{
            int jml, harga;
            minSticker.setDisable(false);
            jml = Integer.parseInt(stickerTf.getText())+ 1;
            harga = jml * 10000;
            stickerTf.setText(String.valueOf(jml));
            HSticker.setText(String.valueOf(harga));
        }
    }

    @FXML
    private void PayBtnClicked(ActionEvent event) throws Exception {
        int total, shirt, hoodie, pants, bracelet,sticker,keychain,Hshirt,Hhoodie,Hpants,Hbracelet,Hsticker,Hkeychain;
        String container="";
        String[] arr, shirtArr, hoodieArr, keychainArr, braceletArr, pantsArr, stickerArr;
        File f = new File("merch.txt");
        Scanner sc = new Scanner(f);
        Hshirt= Integer.parseInt(HShirt.getText());
        Hhoodie = Integer.parseInt(HHoodie.getText());
        Hpants = Integer.parseInt(HPants.getText());
        Hbracelet = Integer.parseInt(HBracelet.getText());
        Hsticker = Integer.parseInt(HSticker.getText());
        Hkeychain = Integer.parseInt(HKeychain.getText());
        total = Hshirt+Hhoodie+Hpants+Hbracelet+Hsticker+Hkeychain;
        TotalTf.setText(String.valueOf(total));
        PayBtn.setDisable(true);
        
        shirt = Integer.parseInt(shirtTf.getText());
        hoodie = Integer.parseInt(hoodieTf.getText());
        keychain = Integer.parseInt(keychainTf.getText());
        pants = Integer.parseInt(pantsTf.getText());
        bracelet = Integer.parseInt(braceletTf.getText());
        sticker = Integer.parseInt(stickerTf.getText());
        
        while(sc.hasNextLine()){
            container += sc.nextLine()+";";
        }
        arr = container.split(";");
        shirtArr = arr[0].split(",");
        hoodieArr = arr[1].split(",");
        keychainArr = arr[2].split(",");
        braceletArr = arr[3].split(",");
        pantsArr = arr[4].split(",");
        stickerArr = arr[5].split(",");
        
        FileWriter fw = new FileWriter("merch.txt");
        fw.write(shirtArr[0]+","+(Integer.parseInt(shirtArr[1])-shirt)+","+(Integer.parseInt(shirtArr[2])+shirt)+"\n");
        fw.write(hoodieArr[0]+","+(Integer.parseInt(hoodieArr[1])-hoodie)+","+(Integer.parseInt(hoodieArr[2])+hoodie)+"\n");
        fw.write(keychainArr[0]+","+(Integer.parseInt(keychainArr[1])-keychain)+","+(Integer.parseInt(keychainArr[2])+keychain)+"\n");
        fw.write(braceletArr[0]+","+(Integer.parseInt(braceletArr[1])-bracelet)+","+(Integer.parseInt(braceletArr[2])+bracelet)+"\n");
        fw.write(pantsArr[0]+","+(Integer.parseInt(pantsArr[1])-pants)+","+(Integer.parseInt(pantsArr[2])+pants)+"\n");
        fw.write(stickerArr[0]+","+(Integer.parseInt(stickerArr[1])-sticker)+","+(Integer.parseInt(stickerArr[2])+sticker));
        fw.close();
    }

    @FXML
    private void stockBtnClicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("TableStok.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Stok Merch");
    }

    @FXML
    private void LogoutBtnClicked(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("LOGIN");
    }

    @FXML
    private void clrBtnClicked(ActionEvent event) {
        shirtTf.setText("0");
        hoodieTf.setText("0");
        pantsTf.setText("0");
        braceletTf.setText("0");
        stickerTf.setText("0");
        keychainTf.setText("0");
        HShirt.setText("0");
        HHoodie.setText("0");
        HPants.setText("0");
        HBracelet.setText("0");
        HSticker.setText("0");
        HKeychain.setText("0");
        TotalTf.clear();
        PayBtn.setDisable(false);
    }
    
}
