package com.oopsapp.controller;

import java.util.Scanner;

import com.oops.services.DepartmentServices;
import com.oopsapp.model.HrDepartment;
import com.oopsapp.model.TechDepartment;
import com.oopsapp.model.AdminDepartment;

public class DepartmentController {
	public static void main(String[] args) {
		DepartmentServices Services = new DepartmentServices();

		Scanner sc = new Scanner(System.in);

		System.out.println("\n please enter option: ");

		System.out.println("\n 1. Admin Department \n 2. HR Department \n 3. Tech Department ");
		int option = sc.nextInt();

		switch (option) {
		case 1: // Admin Department
			System.out.println("Welcome to " + Services.objectofAdminDepartment.departmentName());
			System.out.println(Services.objectofAdminDepartment.getTodaysWork());
			System.out.println(Services.objectofAdminDepartment.getWorkDeadline());
			System.out.println(Services.objectofAdminDepartment.isTodayAHoliday());
			System.out.println("\n");
			break;

		case 2: // HR Department
			System.out.println("Welcome to " + Services.objectofHrDepartment.departmentName());
			System.out.println(Services.objectofHrDepartment.getTodaysWork());
			System.out.println(Services.objectofHrDepartment.getWorkDeadline());
			System.out.println(Services.objectofHrDepartment.isTodayAHoliday());
			System.out.println("\n");
			break;

		case 3: // Tech Department
			System.out.println("Welcome to " + Services.objectofTechDepartment.departmentName());
			System.out.println(Services.objectofTechDepartment.getTodaysWork());
			System.out.println(Services.objectofTechDepartment.getWorkDeadline());
			System.out.println(Services.objectofTechDepartment.isTodayAHoliday());
			System.out.println("\n");
			break;

		default:
			System.out.println("Invalid Choice, Please try with correct one");
			break;
		}

		sc.close();

	}
}
