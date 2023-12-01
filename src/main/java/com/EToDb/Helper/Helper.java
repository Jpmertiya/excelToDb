package com.EToDb.Helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.EToDb.Entity.EmployeeEntity;

public class Helper {

	// this method is used to check type of file
	public static boolean isExcel(MultipartFile file) {

		String contentType = file.getContentType();

		if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
			return true;
		}
		return false;
	}

	public static List<EmployeeEntity> convertExcelToLitsOfEmployee(InputStream is) {
		List<EmployeeEntity> list = new ArrayList<EmployeeEntity>();

		try {

			XSSFWorkbook workbook = new XSSFWorkbook(is);
			XSSFSheet sheet = workbook.getSheet("data");

			int rowNumber = 0;

			Iterator<Row> iterator = sheet.iterator();

			while (iterator.hasNext()) {
				Row row = iterator.next();
				if (rowNumber == 0) {
					rowNumber += 1;
					continue;
				}
				Iterator<Cell> cells = row.iterator();

				int cid = 0;

				EmployeeEntity emp = new EmployeeEntity();
				while (cells.hasNext()) {
					Cell cell = cells.next();
					switch (cid) {
					case 0:
						emp.setId(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 1:
						emp.setName(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 2:
						emp.setJobTitle(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 3:
						emp.setDepartent(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 4:
						emp.setBusinessUnit(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 5:
						emp.setGender(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 6:
						emp.setEthnicity(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 7:
						System.out.println(cell.getNumericCellValue());
						emp.setAge((int) cell.getNumericCellValue());

						break;
					case 8:
						System.out.println(cell.getDateCellValue());
						emp.setHireDate(String.valueOf(cell.getDateCellValue()));
						break;
					case 9:
						System.out.println(cell.getCellType());
						emp.setAnnuaslSalary(String.valueOf(cell.getNumericCellValue()));
						
						break;
					case 10:
						System.out.println(cell.getCellType());
						emp.setBonus(String.valueOf(cell.getNumericCellValue()));
						break;
					case 11:
						emp.setCountry(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 12:
						emp.setCity(cell.getStringCellValue());
						System.out.println(cell.getStringCellValue());
						break;
					case 13:
						try {
							emp.setExitdate(String.valueOf(cell.getDateCellValue()));
						} catch (Exception e) {
							emp.setExitdate(cell.getStringCellValue());
							// TODO: handle exception
						}
//						System.out.println(cell.getNumericCellValue());
						break;
					default:
						break;
					}
					cid++;
				}
				list.add(emp);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
