module com.example.thirteenthdayofjava {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.thirteenthdayofjava to javafx.fxml;
    exports com.example.thirteenthdayofjava;
}