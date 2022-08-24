package com.SprinBootFirstLook.springBootExpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExplApplication implements CommandLineRunner {

    @Autowired
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExplApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.registryUser("slaw");
    }
}
// ABY URUCHOMIC APKE W TERMINALU WPISUJEMY: mvn spring-boot:run
//ze wzgledu ze to apka konsolowa to musimy zaimplementowac interfejsc CommandLineRunner
//nadpisujemy metode run
//teraz przechodzimy do WSTRZYKIWANIA ZALEZNOSCI
//tworzymy klase DatabaseConnection
//aby pola z databaseconnection zostaly przekazane z zewnatrz to uzywamy @Value
//nastepnie kolejna klasa UserService
//po stworzeniu tej klasy moment wstrzykniecia beana databaseConnection
//w klasie databaseConnection nad klasa dajemy adnotacje @Component <- oznaczenie beana
//w klasie userService tworzymy konstruktor z polem DatabaseConnection
//nastepnie ten konstruktor oznaczamy adnotacja @Autowired
//tam spring wstrzyknie beana
//klase UserService rowniez oznaczamy jako @Component a nastepnie w mainie
//@Autowired nad referencja to UserService, to pole jest potrzebne bo instancje wywolamy w run
//czyli spring wstrzyknal nam instancje UserService w mainie a w UserService w konstruktorze
//instancje DatabaseConnection, czyli 2 beany