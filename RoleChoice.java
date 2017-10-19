import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.control.Alert;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
/**
*Mario Rodriguez
*Program will prompt user choose between options using JavaFX and switch
*/
public class RoleChoice extends Application{
    @Override
    public void start(Stage stage) {
	
	List<String> Choices = new ArrayList<>();
        Choices.add("Administrator");
        Choices.add("Faculty");
        Choices.add("Staff");
        Choices.add("Student");
        Choices.add("Guest");

        ChoiceDialog<String> dialog = new ChoiceDialog<>("Student", Choices);
        dialog.setTitle("Choose Role");
        dialog.setHeaderText("Roles");
        dialog.setContentText("Here --->");
	dialog.setGraphic(new ImageView(this.getClass().getResource("Choice.png").toString()));

        Stage stageIcon = (Stage)dialog.getDialogPane().getScene().getWindow();
        stageIcon.getIcons().add(new Image(this.getClass().getResource("check.png").toString()));

	dialog.getResult();
        dialog.showAndWait();
	
	String value = dialog.getResult();

        switch(value) {
            case "Administrator":

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("User Role");
            alert.setHeaderText(null);
            alert.setContentText("Welcome <Administrator>!");
            alert.setGraphic(new ImageView(this.getClass().getResource("Choice.png").toString()));

	Stage stageAlert = (Stage)alert.getDialogPane().getScene().getWindow();
        stageAlert.getIcons().add(new Image(this.getClass().getResource("check.png").toString()));
	    alert.showAndWait();	    
            
break;
            case "Faculty":

                Alert alert1 = new Alert(Alert.AlertType.CONFIRMATION);
                alert1.setTitle("User Role");
                alert1.setHeaderText(null);
                alert1.setContentText("Welcome <Faculty>!");
                alert1.setGraphic(new ImageView(this.getClass().getResource("Choice.png").toString()));

	Stage stageAlert1 = (Stage)alert1.getDialogPane().getScene().getWindow();
        stageAlert1.getIcons().add(new Image(this.getClass().getResource("check.png").toString()));
		alert1.showAndWait();
break;
            case "Staff":

                Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION);
                alert2.setTitle("User Role");
                alert2.setHeaderText(null);
                alert2.setContentText("Welcome <Staff>!");
               	alert2.setGraphic(new ImageView(this.getClass().getResource("Choice.png").toString()));

	Stage stageAlert2 = (Stage)alert2.getDialogPane().getScene().getWindow();
        stageAlert2.getIcons().add(new Image(this.getClass().getResource("check.png").toString()));
		alert2.showAndWait();
break;
            case "Student":

                Alert alert3 = new Alert(Alert.AlertType.CONFIRMATION);
                alert3.setTitle("User Role");
                alert3.setHeaderText(null);
                alert3.setContentText("Welcome <" + dialog.getResult() + ">!");
            	alert3.setGraphic(new ImageView(this.getClass().getResource("Choice.png").toString()));

	Stage stageAlert3 = (Stage)alert3.getDialogPane().getScene().getWindow();
        stageAlert3.getIcons().add(new Image(this.getClass().getResource("check.png").toString()));
		alert3.showAndWait();
break;
            case "Guest":

                Alert alert4 = new Alert(Alert.AlertType.CONFIRMATION);
                alert4.setTitle("User Role");
                alert4.setHeaderText(null);
                alert4.setContentText("Welcome <Guest>!");
                alert4.setGraphic(new ImageView(this.getClass().getResource("Choice.png").toString()));

	Stage stageAlert4 = (Stage)alert4.getDialogPane().getScene().getWindow();
        stageAlert4.getIcons().add(new Image(this.getClass().getResource("check.png").toString()));

		alert4.showAndWait();
break;

        

	}
    }
}
