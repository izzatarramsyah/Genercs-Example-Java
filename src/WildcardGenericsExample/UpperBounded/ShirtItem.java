package WildcardGenericsExample.UpperBounded;

public class ShirtItem  extends ClothingItem {

    @Override
    int getPrice() {
        return 10;
    }

    @Override
    String getName() {
        return "Shirt";
    }
    
}
