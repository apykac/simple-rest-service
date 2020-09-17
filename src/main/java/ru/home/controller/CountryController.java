package ru.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.home.dto.Country;
import ru.home.repository.CountryRepository;

@RestController
@RequestMapping("/country")
public class CountryController {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/{countryName}")
    public Country getCountry(@PathVariable("countryName") String countryName) {
        return countryRepository.getCountry(countryName);
    }

    @PostMapping("/add")
    public Country addCountry(@RequestBody Country country) {
        return countryRepository.addCountry(country);
    }

    @DeleteMapping("/{countryName}")
    public Country deleteCountry(@PathVariable("countryName") String countryName) {
        return countryRepository.deleteCountry(countryName);
    }
}
