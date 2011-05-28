package com.loiane.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loiane.model.Company;
import com.loiane.service.CompanyService;

/**
 * Controller - Spring
 * 
 * Sample project presented at BrazilJS
 * Brazilian JavaScript Conference
 * Fortaleza - Ceará - 13-14 May 2011
 * http://braziljs.com.br/2011
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Controller
public class CompanyController {

	private CompanyService companyService;

	@RequestMapping(value="/company/view.action")
	public @ResponseBody Map<String,List<Company>> view() throws Exception {
		
		List<Company> companies = companyService.getCompanies();
		
		Map<String,List<Company>> modelMap = new HashMap<String,List<Company>>();
		modelMap.put("data", companies);
		
		return modelMap;
	}
	
	@Autowired
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}
}
