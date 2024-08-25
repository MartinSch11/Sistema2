/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author lopez
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController {

    @FXML
    private Button btnEstadisticas;

    @FXML
    private Button btnProductos;
    
    @FXML
    private Button btnEventos;

    @FXML
    private Button btnPedidos;
    
    @FXML
    void showViewEventos(ActionEvent event){
        
    }

}

