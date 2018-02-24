package br.com.api.maps.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.maps.entity.Company;
import br.com.api.maps.services.CompanyService;

/**
 * Controller of {@link Company}
 * 
 * @author paulo
 *
 */
@RestController
@RequestMapping(value = "/api-maps")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	
	/**
	 * Returns company by identifier
	 * 
	 * @param id the identifier
	 * @return company
	 */
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		Company company = this.companyService.findById(id);
		return ResponseEntity.ok().body(company);
	}
	
}
