package edu.converter.services;

import edu.converter.entities.Comparation;
import edu.converter.entities.Currency;
import java.util.List;

/**
 *
 * @author Евгений
 */
public interface ConverterService {
    List<Currency> getCurrencyies();
    
    List<Comparation> getAllComparations();
    
    List<Comparation> getCurrenciesComparations(Currency currency);
}
