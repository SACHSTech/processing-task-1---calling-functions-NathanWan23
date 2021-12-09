import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    //background(210, 255, 173);
    background(255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    
    fill(253, 185, 200);

    //corner flower pedals
    ellipse(210, 160, 60, 60);
    
    ellipse(210, 140, 60, 60);
    
    ellipse(190, 160, 60, 60);
    
    ellipse(190, 140, 60, 60);


    
    ellipse(225, 150, 75, 50);

    ellipse(175, 150, 75, 50);

    ellipse(200, 175, 50, 75);

    ellipse(200, 125, 50, 75);
    


    ellipse(200, 150, 50, 50);
  }
  
  // define other methods down here.
}