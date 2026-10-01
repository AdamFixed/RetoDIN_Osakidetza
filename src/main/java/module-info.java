module com.mycompany.retodin_osakidetza {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.retodin_osakidetza to javafx.fxml;
    exports com.mycompany.retodin_osakidetza;
}
