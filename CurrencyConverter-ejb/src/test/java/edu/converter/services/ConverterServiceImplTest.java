package edu.converter.services;

import edu.converter.entities.Currency;
import edu.converter.repos.ComparationRepository;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;
import edu.converter.repos.CurrencyRepository;
import javax.persistence.EntityManager;

/**
 *
 * @author Евгений
 */
public class ConverterServiceImplTest {
    
    public ConverterServiceImplTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getCurrencyies method, of class ConverterServiceImpl.
     */
    @Test
    public void testGetCurrencyies() {
        CurrencyRepository repository = mock(CurrencyRepository.class);
        ComparationRepository comparationRepository = mock(ComparationRepository.class);
        EntityManager manager = mock(EntityManager.class);
        Currency currency = new Currency();
        currency.setTitle("dollar");
        currency.setId(1);
        when(repository.findAll()).thenReturn(Arrays.asList(currency));
        ConverterServiceImpl service = new ConverterServiceImpl(repository, comparationRepository, manager);
        List<Currency> list = service.getCurrencyies();
        assertEquals(list.size(), 1);
        assertEquals(currency.getId(), list.get(0).getId());
    }
    
}
/*
OrderRepository orderRepository = mock(OrderRepository.class);
        when(orderRepository.findOne(anyInt())).thenReturn(new Order());
        PersonService personService = mock(PersonServiceImpl.class);
        VocabularyService vocabularyService = mock(VocabularyServiceImpl.class);
        MisAppointmentRepository appointmentRepository = mock(MisAppointmentRepository.class);
        MisLisOrderingMappingService mappingService = mock(MisLisOrderingMappingServiceImpl.class);

        OrderServiceImpl orderServiceImpl = new OrderServiceImpl(orderRepository, personService, vocabularyService, appointmentRepository, mappingService);

        orderServiceImpl.resendOrder(1, new User(1));

        verify(orderRepository).save(any(Order.class), any(User.class));
*/