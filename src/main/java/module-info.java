module com.mainbank.gitprojject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mainbank.gitprojject to javafx.fxml;
    exports com.mainbank.gitprojject;
}