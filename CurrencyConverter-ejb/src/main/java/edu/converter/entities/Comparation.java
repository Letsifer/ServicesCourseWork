package edu.converter.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
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
    
    private Currency first;
    
    private Currency second;
    
    private Double ratio;    
    
}
