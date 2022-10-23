package flower.store;

public enum FlowerColor {
        RED,
        WHITE,
        ROSE;
        String[] hexs = {"#FF0000", "#FFFFFF", "#FF007F"};
        @Override
        public String toString() {
             return hexs[this.ordinal()];
        }
}

