module com.example.currencyconverterfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.currencyconverterfx to javafx.fxml;
    exports com.example.currencyconverterfx;
}