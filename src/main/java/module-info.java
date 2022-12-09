module com.example.herosofmightandmagic8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.herosofmightandmagic8 to javafx.fxml;
    exports com.example.herosofmightandmagic8;
}