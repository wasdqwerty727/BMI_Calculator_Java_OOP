module com.example.assigment_6_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assigment_6_oop to javafx.fxml;
    exports com.example.assigment_6_oop;
}