package structural.flyweight;

import java.util.ArrayList;

public class Forest {
    ArrayList<Tree> trees = new ArrayList<>();

    public void plantTree(String name, int positionX, int positionY, String details, String icon) throws DomainException{
        TreeFactory factory = new TreeFactory();
        TreeDescription treeDescription = factory.getBy(name, details, icon);
        trees.add(new Tree(positionX, positionY, treeDescription));
    }

}
