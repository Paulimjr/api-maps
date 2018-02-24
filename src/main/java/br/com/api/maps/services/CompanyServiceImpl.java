package br.com.api.maps.services;

import java.util.List;

import br.com.api.maps.entity.Company;
import br.com.api.maps.exceptions.BusinessException;
import br.com.api.maps.exceptions.ObjectNotFoundException;

public interface CompanyServiceImpl {
	
	/**
	 * Returns all companies
	 * 
	 * @return
	 */
	List<Company> findAll();
	
	/**
	 * Returns the company by identifier
	 * 
	 * @return
	 */
	Company findById(final Integer id) throws ObjectNotFoundException;
	
	/**
	 * Returns the company by name
	 * 
	 * @return
	 */
	List<Company> findByName(final String name);
}
