package com.loiane.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public @ResponseBody Map<String,? extends Object> view() throws Exception {
		
		Map<String,Object> modelMap = new HashMap<String,Object>(3);
		modelMap.put("data", companyService.getCompanies());
		
		return modelMap;
	}
	
	@Autowired
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}
}
