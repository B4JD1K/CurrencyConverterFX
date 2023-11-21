module com.example.currencyconverterfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires okhttp3;
    requires com.google.gson;

    opens com.example.currencyconverterfx to javafx.fxml;
    exports com.example.currencyconverterfx;
}