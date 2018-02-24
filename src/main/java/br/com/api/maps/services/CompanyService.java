package br.com.api.maps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.maps.entity.Company;
import br.com.api.maps.exceptions.ObjectNotFoundException;
import br.com.api.maps.repository.CompanyRepository;

/**
 * Service of {@link Company}
 * 
 * @author paulo
 */
@Service
public class CompanyService implements CompanyServiceImpl {

	@Autowired
	private CompanyRepository companyRepository;
	
	@Override
	public List<Company> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Company findById(Integer id){
		
		Company company = this.companyRepository.findOne(id);
		
		if (company == null) {
			throw new ObjectNotFoundException(String.format("Company with ID %s not found.", id));
		}
		
		return company;
	}

	@Override
	public List<Company> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
