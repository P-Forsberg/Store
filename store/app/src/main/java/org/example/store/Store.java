package org.example.store;

import org.example.person.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Store {
	private List<CashRegister> cashregister;
	private List<Employee> employees;
	public HashMap<String, Item> items;

	public Store(List<Person> people) {
		employees = new ArrayList<>();
		for (Person p : people) {
			if (p instanceof Employee) {
				employees.add((Employee) p);
			}
		}
		createStoreItems();
	}

	public HashMap<String, Item> getItems() {
		return items;
	}

	public HashMap<String, Item> createStoreItems() {
		items.put("apple", new Item("apple", 20));
		items.put("orrange", new Item("orange", 20));
		items.put("butter", new Item("butter", 46));
		items.put("bread", new Item("bread", 24));
		items.put("meat", new Item("meat", 20));
		items.put("chicken", new Item("chicken", 123));
		items.put("cookie", new Item("cookie", 20));
		items.put("milk", new Item("milk", 20));
		items.put("chocolate", new Item("choclate", 24));
		items.put("oil", new Item("oil", 37));
		return items;
	}
}
