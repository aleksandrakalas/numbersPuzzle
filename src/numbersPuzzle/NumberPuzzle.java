package numbersPuzzle;

import java.util.ArrayList;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NumberPuzzle extends Application{
	
	private ArrayList<NumButton> numButtons = new ArrayList<NumButton>();
	
	public static void main(String[] args) {
		launch();
	}
	

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		
		VBox root = new VBox();
		
		Text intro = new Text();
		intro.setText("Numbers Puzzle!");
		intro.setFont(Font.font ("Times New Roman", 50));
		intro.setFill(Color.BURLYWOOD);
		intro.setEffect(new Bloom());
		
		GridPane gp = new GridPane();
		
		NumButton nb1 = new NumButton();
		nb1.setText("1");
		nb1.setFont(Font.font ("Times New Roman", 15));
		nb1.setTextFill(Color.BURLYWOOD);
		NumButton nb2 = new NumButton();
		nb2.setText("2");
		nb2.setFont(Font.font ("Times New Roman", 15));
		nb2.setTextFill(Color.BURLYWOOD);
		NumButton nb3 = new NumButton();
		nb3.setText("3");
		nb3.setFont(Font.font ("Times New Roman", 15));
		nb3.setTextFill(Color.BURLYWOOD);
		NumButton nb4 = new NumButton();
		nb4.setText("4");
		nb4.setFont(Font.font ("Times New Roman", 15));
		nb4.setTextFill(Color.BURLYWOOD);
		NumButton nb5 = new NumButton();
		nb5.setText("5");
		nb5.setFont(Font.font ("Times New Roman", 15));
		nb5.setTextFill(Color.BURLYWOOD);
		NumButton nb6 = new NumButton();
		nb6.setText("6");
		nb6.setFont(Font.font ("Times New Roman", 15));
		nb6.setTextFill(Color.BURLYWOOD);
		NumButton nb7 = new NumButton();
		nb7.setText("7");
		nb7.setFont(Font.font ("Times New Roman", 15));
		nb7.setTextFill(Color.BURLYWOOD);
		NumButton nb8 = new NumButton();
		nb8.setText("8");
		nb8.setFont(Font.font ("Times New Roman", 15));
		nb8.setTextFill(Color.BURLYWOOD);
		NumButton empty = new NumButton();
		empty.setText("");
		empty.setFont(Font.font ("Times New Roman", 15));
		empty.setTextFill(Color.BURLYWOOD);
		
		gp.addRow(1, nb1, nb2, nb3);
		gp.addRow(2, nb4, nb5, nb6);
		gp.addRow(3, nb7, nb8, empty);
		
		root.getChildren().addAll(intro, gp);
		
		Scene scene = new Scene(root);
		scene.setFill(Color.BROWN);
		
		stage.setTitle("Numbers Puzzle!");
		stage.setScene(scene);
		stage.show();
		
	}
	
	private void createNumButtons() {
		for (int i = 0; i < 9; i++) {
			NumButton numB = new NumButton();
		}
	}
		

}
