package by.IT._02_jpa;
import by.IT._02_jpa.configuration.AppConfig;
import by.IT._02_jpa.entties.Airplane;
import by.IT._02_jpa.entties.Passenger;
import by.IT._02_jpa.reposotories.AirplaneRepository;
import by.IT._02_jpa.reposotories.PassengerRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.List;
public class Main1 {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var passRepository = ctx.getBean(PassengerRepository.class);
        var planeRepository = ctx.getBean(AirplaneRepository.class);
        var passengers = (List<Passenger>)ctx.getBean("passengers");
        passRepository.saveAll(passengers);

        var flight_BRU_982 = ctx.getBean("airbus360", Airplane.class);
        planeRepository.save(flight_BRU_982);
    }
}
