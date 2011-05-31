package com.loiane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loiane.model.ExtJSGridObject;
import com.loiane.service.CompanyService;

/**
 * Controller - Spring
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Controller
public class CompanyController {

	private CompanyService companyService;

	@RequestMapping(value="/company/view.action")
	public @ResponseBody ExtJSGridObject view() throws Exception {
		
		ExtJSGridObject extReturn = new ExtJSGridObject();
		extReturn.setData(companyService.getCompanies());
		
		return extReturn;
	}
	
	@Autowired
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}
}
