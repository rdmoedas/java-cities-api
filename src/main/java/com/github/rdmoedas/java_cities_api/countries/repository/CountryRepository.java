package com.github.rdmoedas.java_cities_api.countries.repository;

import com.github.rdmoedas.java_cities_api.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
