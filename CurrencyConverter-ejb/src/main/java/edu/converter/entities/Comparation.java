package edu.converter.entities;

import java.io.Serializable;
import java.util.Currency;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Евгений
 */
@Entity
@Table(schema = "converter", name = "comparations")
@Getter
@Setter
@NoArgsConstructor
public class Comparation implements Serializable{
    
    private static final long serialVersionUID = 2L;
    
    @Id
    private Integer id;
    
    @ManyToOne()
    @JoinColumn(name = "first_currency")
    private Currency first;
    
    @ManyToOne()
    @JoinColumn(name = "second_currency")
    private Currency second;
    
    private Double ratio;    
    
}
