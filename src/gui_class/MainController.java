package gui_class;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField x;
	@FXML
	private TextField y;
	@FXML
	private Button gerar;
	@FXML
	private Label resul;
	
	@FXML
	public void onbtnGerar() {
		
		int x = Integer.parseInt(this.x.getText());
		int y = Integer.parseInt(this.y.getText());
		int soma = 0;
		
		if(x > y) {
			
			int aux = y;
			y = x;
			x = aux;
			
		}
		
		for(int cont = x; cont <= y; cont++) {

			if(cont % 13 != 0) {
				
				soma += cont; 
				
			}
			
		}
		
		this.resul.setText(String.format("%d", soma));
		
	}
	
}
