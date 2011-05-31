package com.loiane.model;

import java.util.List;

/**
 * POJO to represent the object Ext JS Grid expects to
 * receive from the server.
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
public class ExtJSGridObject {

	private List<Company> data;

	public List<Company> getData() {
		return data;
	}

	public void setData(List<Company> data) {
		this.data = data;
	}
}
