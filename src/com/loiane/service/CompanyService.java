package com.loiane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loiane.dao.CompanyDAO;
import com.loiane.model.Company;

/**
 * Company Service
 * 
 * All the business login goes here.
 * It is the mediator between the Controller and the DAO.
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Service
public class CompanyService {

	private CompanyDAO companyDAO;
	
	/**
	 * Get the list from all companies
	 * @return list of all companies
	 */
	public List<Company> getCompanies(){
		return companyDAO.getCompanies();
	}

	@Autowired
	public void setCompanyDAO(CompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
	}
}
