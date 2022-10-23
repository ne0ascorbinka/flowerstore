package flower.store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    int price = 0;
    public void add(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
        price += flowerPack.getFlower().getPrice() * flowerPack.getQuantity();
    }
    
    public int getPrice(){
        return price;
    }
}
