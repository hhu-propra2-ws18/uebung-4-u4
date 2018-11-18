package de.hhu.propra.db.data;

import de.hhu.propra.db.entities.Kunde;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KundeRepository extends CrudRepository<Kunde, Long> {
    List<Kunde> findTop10By();
    List<Kunde> findByAutosFarbe(String farbe);
    List<Kunde> findByAutosHubraum(double hubraum);
    List<Kunde> findAllByAutosMarkeAndStadt(String marke, String stadt);
    List<Kunde> findAllById(long id);

}
