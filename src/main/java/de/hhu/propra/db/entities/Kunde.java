package de.hhu.propra.db.entities;

import java.util.List;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String stadt;
    private Integer plz;

    @OneToMany(cascade=CascadeType.ALL)
    private List<Auto> autos;
}
