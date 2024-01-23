package by.IT._02_jpa;


import by.IT._02_jpa.configuration.AppConfig;
import by.IT._02_jpa.entties.Airplane;
import by.IT._02_jpa.reposotories.AirplaneRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
          var ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         var repository = ctx.getBean(AirplaneRepository.class);
        /// var airplane = ctx.getBean("boeing747", Airplane.class);


        //////допалнительный добавляем плайнер
        ///  System.out.println("We just created" + airplane);


        ///   airplane = repository.save(airplane);
        ///  System.out.println("Airplane after save : " + airplane);

        /////  airplane.setPlace(250);
        ////   airplane = repository.save(airplane);
        ////   System.out.println("Airplane after update : " + airplane);

 ///  var boeing = repository.findByModelLike("Boe%");
  //// var airbus = repository.findByModelLike("Air%", 350);
     ////   System.out.println(boeing);
      ///  System.out.println(airbus);
    }
}
