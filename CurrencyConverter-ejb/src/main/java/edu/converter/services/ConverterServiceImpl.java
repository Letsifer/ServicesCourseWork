package edu.converter.services;

import edu.converter.entities.Currency;
import edu.converter.repos.ConverterRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Евгений
 */
@AllArgsConstructor
@Service
public class ConverterServiceImpl implements ConverterService{

    @Autowired
    private final ConverterRepository repository;
    
    @Override
    public List<Currency> getCurrencyies() {
        return repository.findAll();
    }
    
}
