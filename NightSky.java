import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
	private int starsInLastPrint = 0;

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public void printLine() {
        Random rand = new Random();
        String stars = "";
        for (int i = 0; i < this.width; i ++) {
            if (rand.nextDouble() <= this.density) {
                stars += "*";
                starsInLastPrint++;
            } else {
                stars += " ";
            }
        }
        System.out.println(stars);
    }

    public void print() {
        starsInLastPrint = 0;
        for (int i = 0; i< this.height; i++) {
            printLine();
        }
        System.out.println();
    }

    public int starsInLastPrint() {
        return starsInLastPrint;
    }

    public static void main(String[] args) {

        System.out.println("EXERCISE 100.1: CLASS NIGHTSKY AND A STAR LINE");
        NightSky NightSky = new NightSky(0.1, 40 ,10);
        NightSky.printLine();

        System.out.println("EXERCISE 100.2: PRINTING THE NIGHT SKY");
        NightSky = new NightSky(8, 4);
        NightSky.print();

        System.out.println("EXERCISE 100.3: COUNTING THE NUMBER OF STARS");
        NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
