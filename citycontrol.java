package application;

import javafx.fxml.FXML;

public class citycontrol {
	@FXML
	private TableView<Person> personTable;

	@FXML	
	private TableColumn<Person, String> firstNameColumn;
	
	@FXML
	private TableColumn<Person, String> lastNameColumn;
	
	@FXML	
	private Label firstNameLabel;
	
	@FXML	
	private
	Label lastNameLabel;
	
	@FXML	
	private Label phoneLabel;
	
	@FXML
	private Label emailLabel;
	
	@FXML
	private Label birthdateLabel;
}
