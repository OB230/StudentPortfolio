import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Arc; 
import javafx.scene.shape.ArcType; 
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 
import javafx.stage.Stage; 
import javafx.geometry.Pos;

public class ChangingFace2 extends Application {
	
	 @Override     
	 public void start(Stage stage)     
	 { 
		 // create and configure the main circle for the face        
		 Circle face = new Circle(125, 125, 80);          
		 face.setFill(Color.YELLOW);         
		 face.setStroke(Color.RED);  
		 
		 // create and configure the circle for the right eye         
		 Circle rightEye = new Circle(86, 100, 10);         
		 rightEye.setFill(Color.YELLOW);         
		 rightEye.setStroke(Color.BLUE); 
		 
		 // create and configure the circle for the left eye         
		 Circle leftEye = new Circle(162, 100, 10);         
		 leftEye.setFill(Color.YELLOW);         
		 leftEye.setStroke(Color.BLUE);   
		 
		 // create and configure a smiling mouth 
		 Arc smileMouth = new Arc(125, 150, 45, 35, 0, -180);          
		 smileMouth.setFill(Color.YELLOW);         
		 smileMouth.setStroke(Color.BLUE);         
		 smileMouth.setType(ArcType.OPEN);
		 
		 // create and configure a frowning mouth 
		 Arc frownMouth = new Arc(125, 150, 45, 35, 0, 180);          
		 frownMouth.setFill(Color.YELLOW);         
		 frownMouth.setStroke(Color.BLUE);         
		 frownMouth.setType(ArcType.OPEN); 
		 
		 // create and configure a thinking mouth using a line. 
		 Line thinkMouth = new Line(80, 150, 170, 150);
		 thinkMouth.setFill(Color.YELLOW);
		 thinkMouth.setStroke(Color.BLUE);
		 
		 // create and configure the text        
		 Text caption = new Text(68, 240, "Changing Face");         
		 caption.setFill(Color.BLUE);         
		 caption.setFont(Font.font ("Verdana", 15));
		 
		 // create a group that holds all the features           
		 Group group = new Group(face, rightEye, leftEye, smileMouth, caption); 
		 
		 // create a button that will make the face smile         
		 Button smileButton = new Button("Smile"); 
		 
		 Button thinkButton = new Button ("Think");
		 
		 // create a button that will make the face frown         
		 Button frownButton = new Button("Frown"); 
	 
	     // create and configure a horizontal container to hold the buttons    
		 HBox buttonBox = new HBox(10);         
		 buttonBox.setAlignment(Pos.CENTER); 
		 
		 //add the buttons to the horizontal container         
		 buttonBox.getChildren().addAll(smileButton, thinkButton, frownButton);
		 
		 // create and configure a vertical container to hold the button box and the face group         
		 VBox root = new VBox(10); 
		 root.setBackground(Background.EMPTY);         
		 root.setAlignment(Pos.CENTER); 
		 
		 //add the button box and the face group to the vertical container         
		 root.getChildren().addAll(buttonBox, group);
		 
		 // create and configure a new scene         
		 Scene scene = new Scene(root, 250, 275, Color.YELLOW);
		 
		 // I have used setOnAction and an If/Else Statement. This checks the current mouth and amends the group.   
		 smileButton.setOnAction(e -> {
			 							if (group.getChildren().contains(frownMouth))
			 							{
			 								group.getChildren().remove(frownMouth);
			 								group.getChildren().add(smileMouth);
			 							}
			 							else if (group.getChildren().contains(thinkMouth))
			 							{
			 								group.getChildren().remove(thinkMouth);
			 								group.getChildren().add(smileMouth);
			 							}			 		
		 							  }
		 						 );
		 // I have used setOnAction and an If/Else Statement. This checks the current mouth and amends the group.  
		 frownButton.setOnAction(e -> {
			 							if (group.getChildren().contains(smileMouth))
			 							{
			 								group.getChildren().remove(smileMouth);
			 								group.getChildren().add(frownMouth);
			 							}
			 							else if (group.getChildren().contains(thinkMouth))
			 							{
			 								group.getChildren().remove(thinkMouth);
			 								group.getChildren().add(frownMouth);
			 							}
			 							
								 	}
				 				); 
		 // I have used setOnAction and an If/Else Statement. This checks the current mouth and amends the group.
		 thinkButton.setOnAction(e -> {
									 	if (group.getChildren().contains(smileMouth))
									 	{
										 	 group.getChildren().remove(smileMouth);
										 	 group.getChildren().add(thinkMouth);
									 	}
									 	else if (group.getChildren().contains(frownMouth))
									 	{
											 group.getChildren().remove(frownMouth);
											 group.getChildren().add(thinkMouth);
		 							    }
		 							  }
				 				);
		 // add the scene to the stage, then set the title        
		 stage.setScene(scene);         
		 stage.setTitle("Changing Face");  
		 
		 // show the stage         
		 stage.show();             
	}         
	 
	 public static void main(String[] args)     
	 {         
		 launch(args);     
	 }
}
	
