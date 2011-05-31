package com.loiane.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.loiane.model.Company;

/**
 * Company DAO class.
 * Access DataBase using Hibernate.
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Repository
public class CompanyDAO {

	private HibernateTemplate hibernateTemplate;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	/**
	 * Get List of all companies from database
	 * @return list of all companies
	 */
	public List<Company> getCompanies() {
		
		DetachedCriteria criteria = DetachedCriteria.forClass(Company.class);

		return hibernateTemplate.findByCriteria(criteria);
	}
}
