module org.champlain.prog2.partneractivity {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.champlain.prog2.partneractivity to javafx.fxml;
    exports org.champlain.prog2.partneractivity;
}