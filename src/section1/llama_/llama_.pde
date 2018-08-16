PImage mustache;
PImage friend;
void setup(){
 friend=loadImage("images.jpg");
 size(800,600);
 friend.resize(width,height);
 mustache=loadImage("images.png");
 mustache.resize(100,100);
 
 
 }
void draw(){
  
  background(friend);
image(mustache, mouseX, mouseY);




}