module Porter.Final.Project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires proto.google.cloud.texttospeech.v1;
    requires proto.google.cloud.speech.v1;
    requires google.cloud.texttospeech;
    requires protobuf.java;
    requires google.cloud.speech;

    opens com.andrewfinberg to javafx.fxml;
    exports com.andrewfinberg;
}