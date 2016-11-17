/**
 * Created by VINNI on 13.11.16.
 */
public class Main {
    public static void main(String[] args)
    {
        Bird bird = new Bird();
        bird.setSay ("I am walking");
        bird.sing( bird.getSay() );
        bird.setSay ("I am flying");
        bird.sing( bird.getSay() );
        bird.setSay ("I am singing");
        bird.sing( bird.getSay() );
        bird.setSay ("I am Bird");
        bird.sing( bird.getSay() );

    }

}




