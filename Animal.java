public class Animal {
 public String color;
 public double height;
 public String speciesType;
 public int NumberOfLegs;
 public String name;
 public void movement(String name, String movesLike) {
 System.out.println(name + "'s movement type is " +
 movesLike);
 }
 public boolean canClimb(String name, boolean canClimb) {
 if (canClimb == true) {
 System.out.println(name + " can climb");
 } else {
 System.out.println(name + " can not climb");
 }
 return canClimb;
 }
 
 public boolean canTalk(String name, boolean canTalk) {
 if (canTalk == true) {
 System.out.println(name + " can talk");
 } else {
 System.out.println(name + " can not talk");
 }
 return canTalk;
 }
 public float noiseRate(String name, float noiseRate) {
 System.out.println(name + "'s noise rate is: " +
 noiseRate+" dB");
 
 return 0;
 }
 public static void main(String[] args){
 Animal bird = new Animal();
 bird.name = "Eagle";
 bird.height = 32;
 bird.speciesType="Abes";
 bird.NumberOfLegs=2;
 bird.color= "Dark Brown";
 bird.movement(bird.name, "FLIES");
 bird.canClimb(bird.name, false);
 bird.canTalk(bird.name, false);
 bird.noiseRate(bird.name, 50);
 }
}