PImage rainbow;

PImage unicorn;
void setup(){rainbow = loadImage("4645.png");

size(1000,1000);

rainbow.resize(width,height);
  background(rainbow);
  unicorn = loadImage("rainbow-unicorn-cake-recipe-and-video.jpg");
unicorn.resize(200,200);
}
void draw(){background(rainbow);
  image(unicorn,mouseX,mouseY);
}