module com.example.currencychartfxmaven {
    requires javafx.controls;
    requires javafx.fxml;
    requires gson;
    requires java.xml;
    requires java.desktop;

    opens com.example.currencychartfxmaven to javafx.fxml;
    exports com.example.currencychartfxmaven;
}