package project;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.*;

public class Calcolatrice extends Application{

	private static final int widthWindow = 400;
	private static final int heightWindow = 400;
	
	private TextField display = new TextField("");
	private String operation = "";
	private String op1 = "";
	private String op2 = "";
	private String symbol = "";
	private int number0 = 0;
	private int number1 = 1;
	private int number2 = 2;
	private int number3 = 3;
	private int number4 = 4;
	private int number5 = 5;
	private int number6 = 6;
	private int number7 = 7;
	private int number8 = 8;
	private int number9 = 9;
	private boolean result = false;
	private String error = "Error";
	
	
	public static void main(String[] args){
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		stage.setTitle("Calcolatrice");
		VBox root = new VBox();
		List<Button> listButton = new ArrayList<>();
		GridPane buttonLayout = new GridPane();
		display.setMinSize(widthWindow, heightWindow/5);
		display.setAlignment(Pos.CENTER_RIGHT);
		display.setStyle("-fx-text-fill: black; -fx-font-size: 28;");
		Font font = new Font("Arial", 16);
		
		for(int i = 0; i < 10; i++) {
			Button button = new Button(Integer.toString(i));
			button.setStyle("-fx-text-fill: black; -fx-background-color: white");
			listButton.add(button);
		}
		listButton.add(new Button("."));
        listButton.add(new Button("=")); 
        listButton.add(new Button("+"));
        listButton.add(new Button("-"));
        listButton.add(new Button("*"));
        listButton.add(new Button("/"));
        listButton.add(new Button("C"));
        listButton.add(new Button("^"));
        listButton.add(new Button("???"));
        listButton.add(new Button("???"));
		
		for(int j = 0; j < listButton.size() ; j++) {
			listButton.get(j).setFont(font);
			listButton.get(j).setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		}
		
		
		buttonLayout.add(listButton.get(7), 0, 0);
        buttonLayout.add(listButton.get(8), 1, 0);
        buttonLayout.add(listButton.get(9), 2, 0);
        buttonLayout.add(listButton.get(12), 3, 0);
        buttonLayout.add(listButton.get(16), 4, 0);


        buttonLayout.add(listButton.get(4), 0, 1);
        buttonLayout.add(listButton.get(5), 1, 1);
        buttonLayout.add(listButton.get(6), 2, 1);
        buttonLayout.add(listButton.get(13), 3, 1);
        buttonLayout.add(listButton.get(17), 4, 1);

        buttonLayout.add(listButton.get(1), 0, 2);
        buttonLayout.add(listButton.get(2), 1, 2);
        buttonLayout.add(listButton.get(3), 2, 2);
        buttonLayout.add(listButton.get(14), 3, 2);
        buttonLayout.add(listButton.get(18), 4, 2);

        buttonLayout.add(listButton.get(0), 0, 3);
        buttonLayout.add(listButton.get(10), 1, 3);
        buttonLayout.add(listButton.get(11), 2, 3);
        buttonLayout.add(listButton.get(15), 3, 3);
        buttonLayout.add(listButton.get(19), 4, 3);


        buttonLayout.setGridLinesVisible(true);
        buttonLayout.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        for (int rowIndex = 0; rowIndex < 4; rowIndex++) {
            RowConstraints rc = new RowConstraints();
            rc.setVgrow(Priority.ALWAYS);
            rc.setFillHeight(true);
            buttonLayout.getRowConstraints().add(rc);
        }
        for (int colIndex = 0; colIndex < 5; colIndex++) {
            ColumnConstraints cc = new ColumnConstraints();
            cc.setHgrow(Priority.ALWAYS);
            cc.setFillWidth(true);
            buttonLayout.getColumnConstraints().add(cc);
        }

        VBox.setVgrow(buttonLayout, Priority.ALWAYS);
        root.getChildren().addAll(display, buttonLayout);

        Scene scene = new Scene(root, widthWindow, heightWindow);
        stage.setScene(scene);
        stage.show();   
        
        
        
		listButton.get(0).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number0);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number0;
					}
					else {
						op2 += number0;
					}
				}
				
				operation += number0;
				display.setText(operation);
			}
		});
		
		listButton.get(1).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number1);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number1;
					}
					else {
						op2 += number1;
					}
				}
				
				operation += number1;
				display.setText(operation);
			}
		});
		
		listButton.get(2).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number2);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number2;
					}
					else {
						op2 += number2;
					}
				}
				
				operation += number2;
				display.setText(operation);
			}
		});
		
		listButton.get(3).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number3);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number3;
					}
					else {
						op2 += number3;
					}
				}
				
				operation += "3";
				display.setText(operation);
			}
		});
		
		listButton.get(4).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number4);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number4;
					}
					else {
						op2 += number4;
					}
				}
				
				operation += "4";
				display.setText(operation);
			}
		});
		
		listButton.get(5).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number5);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number5;
					}
					else {
						op2 += number5;
					}
				}
				
				operation += "5";
				display.setText(operation);
			}
		});
		
		listButton.get(6).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number6);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number6;
					}
					else {
						op2 += number6;
					}
				}
				
				operation += "6";
				display.setText(operation);
			}
		});
		
		listButton.get(7).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number7);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number7;
					}
					else {
						op2 += number7;
					}
				}
				operation += "7";
				display.setText(operation);
			}
		});
		
		listButton.get(8).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number8);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number8;
					}
					else {
						op2 += number8;
					}
				}
				
				operation += "8";
				display.setText(operation);
			}
		});
		
		listButton.get(9).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(result || operation.equals(error)) {
					operation = "";
					op1 = String.valueOf(number9);
					op2 = "";
					result = false;
					symbol = "";
					display.setText(operation);
				}
				else {
					if(symbol.equals("")) {
						op1 += number9;
					}
					else {
						op2 += number9;
					}
				}
				operation += "9";
				display.setText(operation);
			}
		});
		
		listButton.get(10).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(symbol.equals("")) {
					op1 += ".";
				}
				else {
					op2 += ".";
				}
				operation += ".";
				display.setText(operation);
			}
		});
		

		listButton.get(11).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(!op1.equals("") && !op2.equals("") && !symbol.equals("")) {
					result = true;
					if(symbol.equals("+")) {
						display.setText(sum(Double.valueOf(op1), Double.valueOf(op2)));
					}
					else if(symbol.equals("-")) {
						display.setText(sub(Double.valueOf(op1), Double.valueOf(op2)));
					}
					else if(symbol.equals("*")) {
						display.setText(mul(Double.valueOf(op1), Double.valueOf(op2)));
					}
					else if(symbol.equals("/")) {
						display.setText(div(Double.valueOf(op1), Double.valueOf(op2)));
					}
					else if(symbol.equals("^")) {
						display.setText(exp(Double.valueOf(op1), Double.valueOf(op2)));
					}
					operation = display.getText();
					op1 = operation;
				}
				else if(op1.equals("") && !op2.equals("") && symbol.equals("???")) {
					display.setText(radq(Double.valueOf(op2)));
					operation = display.getText();
					op2 = operation;
				}
				else {
					operation = error;
				}
				display.setText(operation);
			}
		});
		
		listButton.get(12).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(symbol.equals("")) {
					operation += "+";
					symbol = "+";
				}
				else {
					operation = operation.substring(0, operation.length());
					operation += "+";
					symbol = "+";
				}
				op2 = "";
				result = false;
				display.setText(operation);
			}
		});
		
		listButton.get(13).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(symbol.equals("")) {
					operation += "-";
					symbol = "-";
				}
				else {
					operation = operation.substring(0, operation.length());
					operation += "-";
					symbol = "-";
				}
				op2 = "";
				result = false;
				display.setText(operation);
			}
		});
		
		listButton.get(14).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(symbol.equals("")) {
					operation += "*";
					symbol = "*";
				}
				else {
					operation = operation.substring(0, operation.length());
					operation += "*";
					symbol = "*";
				op2 = "";
				result = false;
				display.setText(operation);
				}
			}
		});
		
		listButton.get(15).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(symbol.equals("")) {
					operation += "/";
					symbol = "/";
				}
				else {
					operation = operation.substring(0, operation.length());
					operation += "/";
					symbol = "/";
				}
				op2 = "";
				result = false;
				display.setText(operation);
			}
		});
		
		listButton.get(16).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				operation = "";
				symbol = "";
				op1 = "";
				op2 = "";
				result = false;
				display.setText("");
			}
		});
		
		listButton.get(17).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(symbol.equals("")) {
					operation += "^";
					symbol = "^";
				}
				else {
					operation = operation.substring(0, operation.length());
					operation += "^";
					symbol = "^";
				}
				op2 = "";
				result = false;
				display.setText(operation);
			}
		});
		
		listButton.get(18).setOnAction(new EventHandler<ActionEvent>() { //radq
			
			@Override
			public void handle(ActionEvent event) {
				if(symbol.equals("")) {
					operation += "???";
					symbol = "???";
				}
				else {
					operation = operation.substring(0, operation.length());
					operation += "???";
					symbol = "???";
				}
				op2 = op1;
				op1 = "";
				result = false;
				display.setText(operation);
			}
		});
		
		listButton.get(19).setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				if(!result) {
					if(!op1.equals("") || !op2.equals("")) {
						if(!symbol.equals("") && (operation.substring(operation.length()-1, operation.length()).equals(symbol))) {
							symbol = "";
							op2 = "";
							operation = operation.substring(0, operation.length()-1);
						}
						else {
							if(op1.length() >= 1 && op2.length() == 0) {
								symbol = "";
								op1 = op1.substring(0, op1.length()-1);
								operation = op1;
							}
							else if(!symbol.equals("") && op2.length() >= 1){
								op2 = op2.substring(0, op2.length()-1);
								operation = operation.substring(0, operation.length()-1);
							}
						}
					}
					else {
						operation = "";
						op1 = "";
						op2 = "";
						symbol = "";
					}
				}
				else {
					symbol = "";
					op2 = "";
					op1 = op1.substring(0, op1.length()-1);
					operation = op1;
				}
				result = false;
				display.setText(operation);
			}
		});
		
	}

	protected String radq(Double num1) {
		if(Math.sqrt(num1) == (int)Math.sqrt(num1)) {
			return String.valueOf((int)Math.sqrt(num1));
		}
		else {
			return String.valueOf(Math.sqrt(num1));
		}
	}

	protected String undo(String str1) {
		if((str1.substring(0, str1.length()-1)).matches("[+---*-/-^]")) {
			return str1.substring(0, str1.length()-1);
		}
		else {
			str1 = str1.substring(0, str1.length()-1);
			return str1;
		}
	}

	protected String exp(Double num1, Double num2) {
		if(Math.pow(num1, num2) == (int)Math.pow(num1, num2)) {
			return String.valueOf((int)Math.pow(num1, num2));
		}
		else {
			return String.valueOf(Math.pow(num1, num2));
		}
	}

	protected String div(Double num1, Double num2) {
		if(num2 == 0) {
			return error;
		}
		else if((num1 / num2) == (int)(num1 / num2)) {
			return String.valueOf((int)(num1 / num2));
		}
		else {
			return String.valueOf(num1 / num2);
		}
	}

	protected String mul(Double num1, Double num2) {
		if((num1 * num2) == (int)(num1 * num2)) {
			return String.valueOf((int)(num1 * num2));
		}
		else {
			return String.valueOf(num1 * num2);
		}
	}

	protected String sub(Double num1, Double num2) {
		if((num1 - num2) == (int)(num1 - num2)) {
			return String.valueOf((int)(num1 - num2));
		}
		else {
			return String.valueOf(num1 - num2);
		}
	}

	protected String sum(double num1, double num2) {
		if((num1 + num2) == (int)(num1 + num2)) {
			return String.valueOf((int)(num1 + num2));
		}
		else {
			return String.valueOf(num1 + num2);
		}
		
	}
}
