package application;
	
import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
// use '*', wildcard character, meaning 'all'
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

// write a program, derive from Application: inherit window base functionality
public class TempConvert extends Application {
	private TextField inputField;
	private Button button;
	private Label output;
	private MenuBar menuBar;
	
	
	// a method to create the scene
	private Scene createScene()
	{
		// assemble a gui:
		// create controls, gui components
		// we want a menu, that requires a MenuBar container
		menuBar = new MenuBar();
		
		// input with a prompt and text field
		Label prompt = new Label("Enter temperature:");
		
		inputField = new TextField();
		
		// create a horizontal box to hold the prompt and input field
		HBox input = new HBox(10, prompt, inputField);
		
		// add padding around 'input'
		input.setPadding(new Insets(20));
		
		button = new Button("Convert");
		// use lambda expressions
		// read as: implement a functional interface (one method in it)
		// that method has one parameter 'event', -> {} denotes what is
		// inside the brackets is the method's body
		// m(event) {...}
		button.setOnAction(event ->
		{
			// read the content of the input field, convert it to a double
			// method's body
			double temp = 0;
			
			try
			{
				temp = Double.parseDouble(inputField.getText());
				// C = 5 / 9 * (F - 32)
				output.setText("Converted: " + String.format("%.1f", 5.0 / 9 * (temp - 32)) + " C");
			}
			catch(Exception e)
			{
				// output an error message
				output.setText("Invalid input: \"" + inputField.getText() + "\"");
				// clear the input field
				inputField.setText("");
			}			
		});
		
		// create a horizontal box to hold the button
		HBox buttons = new HBox(button);
		
		buttons.setAlignment(Pos.CENTER);
		
		output = new Label();
		
		// create one more horizontal box to hold the output label
		// in order to be able to center it
		HBox result = new HBox(output);
		
		result.setAlignment(Pos.CENTER);
		result.setPadding(new Insets(20));
		
		// create a layout container, add nested layout containers to it
		VBox layout = new VBox(menuBar, input, buttons, result);
		
		// create a scene, add the layout container to it
		// and return it
		return new Scene(layout);		
	}
	
	private void createMenu(Stage stage)
	{
		// create a menu with accelerators, precede the desired letter with
		// an underscore; in the case below (on Windows) Alt+T will now open the
		// Task menu, and Alt+X will close the application
		Menu task = new Menu("_Task");
		// a menu item for exiting the app
		MenuItem convert = new MenuItem("_Convert"),
				 exit = new MenuItem("E_xit");
		
		// handle the convert click event
		convert.setOnAction(event ->
		{
			// we want the same functionality to run as when pressing 'button'
			// press the button programmatically, fire the button click event
			button.fire();
		});		
		// handle the exit click event
		exit.setOnAction(event ->
		{
			stage.close();
		});
		// add the menu items to the task menu
		task.getItems().add(convert);
		task.getItems().add(exit);
		// add the task menu to the menu bar
		menuBar.getMenus().add(task);
	}
	
	// must override this abstract method
	// note the @override annotation, it flags the implementation of 'start'
	// as an override; advantages are clarity of code, and the compiler
	// will also now ensure correctness of the override
	@Override
	public void start(Stage primaryStage) {
		Scene scene = createScene();
		
		createMenu(primaryStage);
		// add the scene to the stage
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("Temperature conversion");
		// must call show() to make the window visible
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		// launch is inherited and calls implicitly start()
		launch(args);
	}
}