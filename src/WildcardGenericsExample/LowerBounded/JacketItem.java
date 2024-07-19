package WildcardGenericsExample.LowerBounded;

public class JacketItem extends ClothingItem {
    @Override
    int getPrice() {
        return 25;
    }
    @Override
    String getName() {
        return "Jacket";
    }
    @Override
    String getSize() {
        return "XL";
    }
}