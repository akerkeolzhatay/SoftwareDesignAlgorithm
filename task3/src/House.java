// House.java
public class House {
    private int numRooms;
    private int numFloors;
    private boolean hasPool;
    private boolean hasGarage;

    private House(HouseBuilder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    public static class HouseBuilder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        public HouseBuilder setNumRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        public HouseBuilder setNumFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public HouseBuilder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House: rooms=" + numRooms + ", floors=" + numFloors + ", pool=" + hasPool + ", garage=" + hasGarage;
    }
}
