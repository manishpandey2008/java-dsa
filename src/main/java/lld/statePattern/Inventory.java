package lld.statePattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    private final Map<String, List<Product>> inventory=new HashMap<>();

    public void addProduct(String slabId, Product product){
        if(!inventory.containsKey(slabId)){
            inventory.put(slabId,new ArrayList<>());
        }
        if(inventory.get(slabId).size()>5){
            return;
        }
        inventory.get(slabId).add(product);
    }

    public Product removeProduct(String slabId){
       return inventory.get(slabId).get(0);
    }

    public Product getProduct(String slabId){
        if(!inventory.containsKey(slabId)){
            throw new RuntimeException("Entered id is wrong");
        }
        if(inventory.get(slabId).isEmpty()){
            throw new RuntimeException("Item not available");
        }
        return inventory.get(slabId).get(0);
    }
}
