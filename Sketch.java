import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
  
    background(83, 240, 238);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    
    fill(147, 255, 134);
	  stroke(147, 255, 134);
	  rect(0, 400, 500, 100);
	  
	  //create flower
	  
	  //create stem
	  stroke(245, 170, 126);
	  line(100, 400, 100, 375);
	  
	  //create petals 
	  fill(253, 185, 200);
	  //stroke(0);
	  stroke(253,185,200);
	    
	  ellipse(100, 370, 25, 5);

	  ellipse(100, 370, 25, 5);

	  ellipse(100, 370, 5, 25);

	  ellipse(100, 370, 5, 25);
	    
	  
	  
	  fill(255, 0, 0);
	  stroke(255, 0, 0);
	  ellipse(100, 370, 10, 10);
	    
	  //Create a House
	    
	  fill(127, 72, 41);
	  stroke(114, 74, 56);
	    
	  rect(300, 250, 150, 150);
	    
	  triangle(375, 175, 250, 250, 500, 250);
	    
	  //Create a door
	    
	  fill(133, 75, 50);
	    
	  rect(310, 300, 50, 100);
	    
	  //door knob
	    
	  fill(0);
	    
	  ellipse(350, 350, 5, 5);
	    
	  //Create a Window
	    
	  stroke(0);
	  fill(225);
	    
	  ellipse(375, 215, 30, 30);
	    
	  stroke(0);
	    
	  rect(390, 300, 50, 50);
	    
	  //create sun
	    
	  stroke(255, 211, 0);
	  fill(255, 211, 0);
	    
	  ellipse(100, 100, 60, 60);
  }
  
  // define other methods down here.
}