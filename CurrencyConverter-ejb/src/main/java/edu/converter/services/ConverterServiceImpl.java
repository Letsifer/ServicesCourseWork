package edu.converter.services;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQuery;
import edu.converter.entities.Comparation;
import edu.converter.entities.Currency;
import edu.converter.entities.QComparation;
import edu.converter.repos.ComparationRepository;
import java.util.List;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.converter.repos.CurrencyRepository;

/**
 *
 * @author Евгений
 */
@AllArgsConstructor
@Service
public class ConverterServiceImpl implements ConverterService {

    @Autowired
    private final CurrencyRepository currencyRepository;

    @Autowired
    private final ComparationRepository comparationRepository;
    
    @Autowired
    private final EntityManager entityManager;

    @Override
    public List<Currency> getCurrencyies() {
        return currencyRepository.findAll();
    }

    @Override
    public List<Comparation> getCurrenciesComparations(Currency currency) {
        QComparation comparation = QComparation.comparation;
        BooleanExpression expression = comparation.first().id.eq(currency.getId());
        expression = expression.or(comparation.second().id.eq(currency.getId()));
        return new JPAQuery<>(entityManager)
                .select(comparation)
                .from(comparation)
                .where(expression)
                .fetch();
    }

    @Override
    public List<Comparation> getAllComparations() {
        return comparationRepository.findAll();
    }
}
