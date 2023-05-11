package controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.net.URL;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class loginController implements Initializable {
    @FXML
    protected TextField usernameField;
    @FXML
    protected TextField passwordField;
    @FXML
    protected TextField locationField;
    @FXML
    protected Text usernameText;
    @FXML
    protected Text passwordText;
    @FXML
    protected Text locationText;
    @FXML
    protected Text loginText;
    @Override
    public void initialize(URL location, ResourceBundle resource){
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (language.equals("fr")){
            loginText.setText("Connexion");
            usernameText.setText("Nom d'utilisateur:  ");
            passwordText.setText("Mot de passe  ");
            locationField.setText("Emplacement  ");
        }
        locationText.setText(ZoneId.systemDefault().getDisplayName(TextStyle.FULL, locale));
    }
}
