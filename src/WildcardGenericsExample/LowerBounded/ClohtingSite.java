package WildcardGenericsExample.LowerBounded;

import java.util.ArrayList;
import java.util.List;

public class ClohtingSite {
    
    public static void main(String[] args) {

        List<ClothingItem> clothingList = new ArrayList<>();
        addClothingItems(clothingList);
        checkoutAllItems(clothingList);

    }

    static void checkoutItem(ClothingItem item) {
        System.out.println("Item purchased: " + item.getName() + ", price: " + item.getPrice());
    }

    static void checkoutAllItems(List<? extends ClothingItem> clothingItems) {
        for (ClothingItem clothingItem : clothingItems) {
            checkoutItem(clothingItem);
        }
    }

    public static void addClothingItems(List<? super ClothingItem> clothingItems) {
        clothingItems.add(new ShirtItem());
    }

}
