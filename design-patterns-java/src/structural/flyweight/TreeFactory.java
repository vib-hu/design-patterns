package structural.flyweight;

import java.util.HashMap;

public class TreeFactory {

    HashMap<String, TreeDescription> map = new HashMap<>();

    public TreeDescription getBy(String name, String details, String icon) throws DomainException{

        if(map.containsKey(name))
            return map.get(name);

        var treeDescription = new TreeDescription(name, details, icon);
        map.put(name, treeDescription);
        return treeDescription;
    }
}
