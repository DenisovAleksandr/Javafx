module ru.gb.homework4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.homework4 to javafx.fxml;
    exports ru.gb.homework4;
}