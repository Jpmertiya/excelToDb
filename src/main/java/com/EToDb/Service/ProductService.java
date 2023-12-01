package com.EToDb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.EToDb.Entity.EmployeeEntity;
import com.EToDb.Helper.Helper;
import com.EToDb.Repo.EmployeeRepo;

@Service
public class ProductService {
	
	@Autowired
	private EmployeeRepo employeeRep;
	
	public void save(MultipartFile file) {
		try {

			List<EmployeeEntity> list = Helper.convertExcelToLitsOfEmployee(file.getInputStream());
			this.employeeRep.saveAll(list);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public List<EmployeeEntity> gettAllEmployee(){
		return this.employeeRep.findAll();
	}

}
