package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao dep = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findByid ====");
		Department department = dep.findById(3);
		
		System.out.println(department);

	}

}
