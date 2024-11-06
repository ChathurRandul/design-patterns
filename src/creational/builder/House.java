package creational.builder;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean furnished;

    // Builder inner class
    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean furnished;

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setFurnished(boolean furnished) {
            this.furnished = furnished;
            return this;
        }

        public House build() {
            House house = new House();
            house.foundation = this.foundation;
            house.structure = this.structure;
            house.roof = this.roof;
            house.furnished = this.furnished;
            return house;
        }
    }
    
    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", furnished=" + furnished + "]";
    }
}