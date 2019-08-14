package main;

import java.util.List;

import dao.CategoryDAO;
import model.Category;

public class App {

	public static void main(String[] args) {
		CategoryDAO categoryDAO = new CategoryDAO();
		//print(categoryDAO);
		findCategoryById(categoryDAO, 1);
		update(categoryDAO);
		findCategoryById(categoryDAO, 1);
	}
	

	private static void insert(CategoryDAO categoryDAO) {
		categoryDAO.insert(new Category("Apple"));
		categoryDAO.insert(new Category("Samsung"));
		categoryDAO.insert(new Category("Xiaomi"));
	}

	private static void print(CategoryDAO categoryDAO) {
		List<Category> categories = categoryDAO.getData();
		for (Category category : categories) {
			System.out.println(category.getId() + " " + category.getName());
		}
	}
	
	private static void findCategoryById(CategoryDAO categoryDAO, int id) {
		Category category = categoryDAO.findById(id);
		System.out.println(category.getId() + " " + category.getName());
	}
	private static void update(CategoryDAO categoryDAO) {
		Category category = categoryDAO.findById(1);
		category.setName("Vismart");
		categoryDAO.update(category);
		System.out.println(category.getId() + " " + category.getName());
	}
}
