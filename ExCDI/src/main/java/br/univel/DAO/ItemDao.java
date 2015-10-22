package br.univel.DAO;

import java.util.List;

import br.univel.entity.Item;

public interface ItemDao {

    List<Item> fetchItems();

}
