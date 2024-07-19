package structural.flyweight;

import java.util.UUID;

//Extrinsic state : mutable part that cannot be shared
public class Tree {
    UUID id;
    int positionX;
    int positionY;
    TreeDescription treeDescription;

    Tree(int positionX, int positionY, TreeDescription treeDescription) throws DomainException{

        if(treeDescription ==null)
            throw new DomainException("Tree Description must not be empty");
        this.id = UUID.randomUUID();
        this.positionX = positionX;
        this.positionY = positionY;
        this.treeDescription = treeDescription;
    }
}
