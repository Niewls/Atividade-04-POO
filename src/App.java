import java.time.LocalDate;

import POO.DOMINIO.*;

public class App {
    public static void main(String[] args){
        Passageiro p1 = new Passageiro(3123412, LocalDate.now(), "Daniel.", "*******", "000000000", "TESTETESTE@gmail.com", "Daniel Souza Pires", LocalDate.of(2004, 03, 22), "42564547", "5323462345", "45324623");
        System.out.println(p1.getNome());
    }
}
