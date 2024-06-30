package by.IT._02_jpa;
import by.IT._02_jpa.configuration.AppConfig;
import by.IT._02_jpa.entties.Airplane;
import by.IT._02_jpa.reposotories.AirplaneRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        var repository = ctx.getBean(AirplaneRepository.class);
        //var boeing = ctx.getBean("boeing747", Airplane.class);
        //var airbus = ctx.getBean("airbus360", Airplane.class);
        //System.out.println("We just created : " + boeing);

        var boeing = repository.findByModelLike("Boe%");
        var airbus = repository.findByModelLikeOrPlace("Air%", 350);
        System.out.println(boeing);
        System.out.println(airbus);
        var planes = repository.findByPlaceBetween(100, 550);
        planes.forEach(System.out::println);
        System.out.println("________________________");
        planes = repository.allPlanes();
        planes.forEach(System.out::println);
        System.out.println("________________________");
        planes = repository.concretePlains("Boei%", 200);
        planes.forEach(System.out::println);
    }
}