package main;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class Signup extends Application {
	private TextField lastName;
	private TextField firstName;
	private TextField email;
	private TextField userName;
	private TextField city;
	private TextField state;
	private PasswordField passWordField;
	
	private Button signup;


    public static void main(String[] args) {
        launch(args);
    }
    
    public Button signup() {
		signup = new Button("Sign Up");
		// login.setOnAction( (e) -> validateLogin(e) );
		/**
		 * login.setOnMouseClicked(new EventHandler<MouseEvent>() {
		 * 
		 * public void handle(MouseEvent evt) { try { validateLogin(); } catch
		 * (ClassNotFoundException | InstantiationException |
		 * IllegalAccessException | SQLException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } } });
		 */
		return signup;
	}


    public TextField lastName() {
		userName = new TextField();
		userName.setPromptText("Last Name");
		userName.setMaxWidth(500);
		userName.setMaxHeight(500);
		return userName;
	}

    public TextField firstName() {
		userName = new TextField();
		userName.setPromptText("First Name");
		userName.setMaxWidth(500);
		userName.setMaxHeight(500);
		return userName;
	}

    public TextField email() {
		userName = new TextField();
		userName.setPromptText("email");
		userName.setMaxWidth(500);
		userName.setMaxHeight(500);
		return userName;
	}
    
    public TextField userName() {
		userName = new TextField();
		userName.setPromptText("Username");
		userName.setMaxWidth(500);
		userName.setMaxHeight(500);
		return userName;
	}

    public TextField city() {
		userName = new TextField();
		userName.setPromptText("City");
		userName.setMaxWidth(500);
		userName.setMaxHeight(500);
		return userName;
	}

    public TextField state() {
		userName = new TextField();
		userName.setPromptText("State");
		userName.setMaxWidth(500);
		userName.setMaxHeight(500);
		return userName;
	}
    
    public PasswordField passwordField() {
		passWordField = new PasswordField();
		passWordField.setPromptText("Password");
		return passWordField;
	}

    private GridPane grid() {
		GridPane gPane = new GridPane();
		gPane.setAlignment(Pos.CENTER);
		gPane.add(lastName(), 1, 1);
		gPane.add(firstName(), 1, 2);
		gPane.add(email(), 1, 3);
		gPane.add(userName(), 1, 4);
		gPane.add(city(), 1, 5);
		gPane.add(state(), 1, 6);
		gPane.add(passwordField(), 1, 7);
		gPane.add(signup(), 1, 8);

		gPane.setHgap(10);
		gPane.setVgap(10);
		gPane.setPadding(new Insets(25, 25, 25, 25));
		return gPane;
	}
    @Override
    public void start(Stage primaryStage) {
    	
    	
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
		Scene scene = new Scene(grid(), 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}