package de.hhu.propra.db;

import de.hhu.propra.db.data.KundeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KundeApplication{

    @Autowired
    KundeRepository kunden;

    public static void main(final String[] args) {
        SpringApplication.run(KundeApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return (String... args) -> {
            System.out.println(this.kunden.findTop10By());
            System.out.println();
            System.out.println(this.kunden.findByAutosFarbe("gold"));
            System.out.println();
            System.out.println(this.kunden.findByAutosFarbe("schwarz"));
            System.out.println();
            System.out.println(this.kunden.findByAutosFarbe("blau"));
            System.out.println();
            System.out.println(this.kunden.findByAutosHubraum(1868.0));
            System.out.println();
            System.out.println(this.kunden.findAllByAutosMarkeAndStadt("Weight GmbH", "Bla"));
            System.out.println();
            System.out.println(this.kunden.findAllById(5));
            System.out.println();

        };
    }
}
