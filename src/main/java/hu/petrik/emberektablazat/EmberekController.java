package hu.petrik.emberektablazat;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class EmberekController {

    @FXML
    private TableView<Ember> emberek;
    @FXML
    private TableColumn<Ember, String> korOszlop;
    @FXML
    private TableColumn<Ember, Integer> nevOszlop;

    @FXML
    private void initialize() {
        this.nevOszlop.setCellValueFactory(new PropertyValueFactory<>("nev"));
        this.korOszlop.setCellValueFactory(new PropertyValueFactory<>("eletkor"));
        Ember e1 = new Ember("Gipsz Jakab",25);
        Ember e2 = new Ember("Teszt Elek",52);
        Ember e3 = new Ember("Szabolcsi Károly",11);
        this.emberek.getItems().add(e1);
        this.emberek.getItems().add(e2);
        this.emberek.getItems().add(e3);
    }

}