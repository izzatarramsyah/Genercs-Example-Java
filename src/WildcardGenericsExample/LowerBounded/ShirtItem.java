package WildcardGenericsExample.LowerBounded;

public class ShirtItem extends ClothingItem {
    @Override
    int getPrice() {
        return 10;
    }
    @Override
    String getName() {
        return "Shirt";
    }
    @Override
    String getSize() {
        return "M";
    }
}
