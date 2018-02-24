package br.com.api.maps.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.maps.entity.Company;

/**
 * Repository of {@link Company}
 * 
 * @author paulo
 *
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
