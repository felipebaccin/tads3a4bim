package br.univel.DAO;

import java.util.ArrayList;
import java.util.List;

import br.univel.entity.Item;


public class AnotherItemDao implements ItemDao {

    @Override
    public List<Item> fetchItems() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(99, 9));
        return results;
    }

}