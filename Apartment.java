public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment) {
        int aptPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherAptPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(aptPrice - otherAptPrice);
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int aptPrice = this.squareMeters * this.pricePerSquareMeter;
        int otherAptPrice = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        if( aptPrice > otherApartment) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println("EXERCISE 87.1: LARGER");
        System.out.println( studioManhattan.larger(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.larger(twoRoomsBrooklyn) );   // true
        System.out.println("EXERCISE 87.2: PRICE DIFFERENCE");
        System.out.println( studioManhattan.priceDifference(twoRoomsBrooklyn) );        // 71600
        System.out.println( fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn) );    // 35400
        System.out.println("EXERCISE 87.3: MORE EXPENSIVE THAN");
        System.out.println( studioManhattan.moreExpensiveThan(twoRoomsBrooklyn) );       // false
        System.out.println( fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn) );   // true

    }
}
  