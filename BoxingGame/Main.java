package BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter Mark = new Fighter("Mark", 100, 77, 20,35.0); 
		Fighter Alex = new Fighter("Alex", 100, 70, 15,25.0);
		
		Ring match= new Ring(Mark, Alex, 68, 80);
		match.run();
      }
}
