package edu.converter.repos;

import edu.converter.entities.Currency;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Евгений
 */
@Repository
public interface ConverterRepository extends BaseRepository<Currency, Integer>{
    
}
