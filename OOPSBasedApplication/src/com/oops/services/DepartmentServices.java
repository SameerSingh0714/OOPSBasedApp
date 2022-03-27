package com.oops.services;

import com.oopsapp.model.HrDepartment;
import com.oopsapp.model.TechDepartment;
import com.oopsapp.model.AdminDepartment;

public class DepartmentServices {
	public HrDepartment objectofHrDepartment;
	public TechDepartment objectofTechDepartment;
	public AdminDepartment objectofAdminDepartment;

	public DepartmentServices() {
		this.objectofHrDepartment = new HrDepartment();
		this.objectofTechDepartment = new TechDepartment();
		this.objectofAdminDepartment = new AdminDepartment();

	}

}
