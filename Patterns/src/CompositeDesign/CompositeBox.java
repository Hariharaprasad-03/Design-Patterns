package CompositeDesign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box {

    private final List<Box> childrens = new ArrayList<>();


    public CompositeBox(Box... boxes){
        childrens.addAll(Arrays.asList(boxes));
    }
    public void addExtraItems(Box... boxes){
        childrens.addAll(Arrays.asList(boxes));
    }

    public double calculatePrice(){
        double price =childrens.stream().mapToDouble(Box::calculatePrice)
                .sum();
        return price;
    }

    @Override
    public int getNumberOfItems() {
        int noOfItems = childrens.stream().mapToInt(Box::getNumberOfItems).sum();
        return childrens.size() + noOfItems;
    }

    @Override
    public void boxInfo() {
        System.out.println("--box--");
        for (Box items : childrens){
            items.boxInfo();
        }
    }
}
