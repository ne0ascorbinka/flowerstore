package flower.store;

public class Flower {
    private int price;
    private FlowerColor color;
//
    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setColor(FlowerColor color){
        this.color = color;
    }

    public String getColor(){
        return color.toString();
    }
}

