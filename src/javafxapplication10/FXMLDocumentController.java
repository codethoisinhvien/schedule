/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import model.Schedule;
import model.WorkGroupByLesson;

/**
 *
 * @author Phongthien
 */
public class FXMLDocumentController implements Initializable {

    private ObservableList<WorkGroupByLesson> ScheduleList;
    private Label label;
    @FXML
    private TableView<WorkGroupByLesson> table;
    @FXML
    private TableColumn<WorkGroupByLesson, Integer> lesson;
    @FXML
    private TableColumn<WorkGroupByLesson, String> monDay;
    @FXML
    private TableColumn<WorkGroupByLesson, String> tuseDay;
    @FXML
    private TableColumn<WorkGroupByLesson, String> wednesDay;
    @FXML
    private TableColumn<WorkGroupByLesson, String> thusrDay;
    @FXML
    private TableColumn<WorkGroupByLesson, String> friday;
    @FXML
    private TableColumn<WorkGroupByLesson, String> saturday;
    @FXML
    private TableColumn<WorkGroupByLesson, String> sunday;

    private void handleButtonAction(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       Schedule a = new Schedule();
       a.createSchedule(13);
        ScheduleList = a.ScheduleList;
               
      
        lesson.setCellValueFactory(new PropertyValueFactory<WorkGroupByLesson, Integer>("lesson"));
        monDay.setCellValueFactory(new PropertyValueFactory<WorkGroupByLesson, String>("monDay"));
        tuseDay.setCellValueFactory(new PropertyValueFactory<WorkGroupByLesson, String>("tuseDay"));
        thusrDay.setCellValueFactory(new PropertyValueFactory<WorkGroupByLesson, String>("thusrDay"));
        wednesDay.setCellValueFactory(new PropertyValueFactory<WorkGroupByLesson, String>("wednesDay"));
        saturday.setCellValueFactory(new PropertyValueFactory<WorkGroupByLesson, String>("saturday"));
        sunday.setCellValueFactory(new PropertyValueFactory<WorkGroupByLesson, String>("sunday"));
        friday.setCellValueFactory(new PropertyValueFactory<WorkGroupByLesson, String>("friday"));
        table.setItems(ScheduleList);
        table.setEditable(true);
       
        monDay.setCellFactory (TextFieldTableCell.forTableColumn ());
        monDay.setOnEditCommit(new EventHandler<CellEditEvent<WorkGroupByLesson, String>>() {
        @Override
        public void handle(CellEditEvent<WorkGroupByLesson, String> t) {
            ((WorkGroupByLesson) t.getTableView().getItems().get(
                t.getTablePosition().getRow())
                ).setMonDay(t.getNewValue());
       
    }
       
        
});
        tuseDay.setCellFactory (TextFieldTableCell.forTableColumn ());
    tuseDay.setOnEditCommit(new EventHandler<CellEditEvent<WorkGroupByLesson, String>>() {
        @Override
        public void handle(CellEditEvent<WorkGroupByLesson, String> t) {
            ((WorkGroupByLesson) t.getTableView().getItems().get(
                t.getTablePosition().getRow())
                ).setMonDay(t.getNewValue());
       
    }
    });
   thusrDay.setCellFactory (TextFieldTableCell.forTableColumn ());
     thusrDay.setOnEditCommit(new EventHandler<CellEditEvent<WorkGroupByLesson, String>>() {
        @Override
        public void handle(CellEditEvent<WorkGroupByLesson, String> t) {
            ((WorkGroupByLesson) t.getTableView().getItems().get(
                t.getTablePosition().getRow())
                ).setMonDay(t.getNewValue());
       
    }
    });
     wednesDay.setCellFactory (TextFieldTableCell.forTableColumn ());
     wednesDay.setOnEditCommit(new EventHandler<CellEditEvent<WorkGroupByLesson, String>>() {
        @Override
        public void handle(CellEditEvent<WorkGroupByLesson, String> t) {
            ((WorkGroupByLesson) t.getTableView().getItems().get(
                t.getTablePosition().getRow())
                ).setMonDay(t.getNewValue());
       
    }
    });
     friday.setCellFactory (TextFieldTableCell.forTableColumn ());
     friday.setOnEditCommit(new EventHandler<CellEditEvent<WorkGroupByLesson, String>>() {
        @Override
        public void handle(CellEditEvent<WorkGroupByLesson, String> t) {
            ((WorkGroupByLesson) t.getTableView().getItems().get(
                t.getTablePosition().getRow())
                ).setMonDay(t.getNewValue());
       
    }
    });
     saturday.setCellFactory (TextFieldTableCell.forTableColumn ());
     saturday.setOnEditCommit(new EventHandler<CellEditEvent<WorkGroupByLesson, String>>() {
        @Override
        public void handle(CellEditEvent<WorkGroupByLesson, String> t) {
            ((WorkGroupByLesson) t.getTableView().getItems().get(
                t.getTablePosition().getRow())
                ).setMonDay(t.getNewValue());
       
    }
    });
     sunday.setCellFactory (TextFieldTableCell.forTableColumn ());
     sunday.setOnEditCommit(new EventHandler<CellEditEvent<WorkGroupByLesson, String>>() {
        @Override
        public void handle(CellEditEvent<WorkGroupByLesson, String> t) {
            ((WorkGroupByLesson) t.getTableView().getItems().get(
                t.getTablePosition().getRow())
                ).setMonDay(t.getNewValue());
       
    }
    });
    }        
}
