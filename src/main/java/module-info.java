module com.auxion.auxion {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.auxion.auxion to javafx.fxml;
    exports com.auxion.auxion;
}