PImage cat;    
void setup() {
  size(962, 641);
  cat=loadImage("cat.jpg");
  cat.resize(width, height);
  background(cat);
  ne 
}
void draw() {
  if (mousePressed) {
    println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");
 
}
    ellipse(513,269, 35,35);
 fill(238, 34,119);
 ellipse(376,276,35,35); 
   fill(238,034,119);
}
   void  keyPressed() { 
     mouseX++;
   mouseY++;}