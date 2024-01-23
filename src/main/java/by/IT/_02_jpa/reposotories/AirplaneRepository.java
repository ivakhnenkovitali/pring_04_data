package by.IT._02_jpa.reposotories;


import by.IT._02_jpa.entties.Airplane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
    ///find, get, query, delete, update
    ///By
    ///Model, Place

    Airplane findByModel(String model);
    Airplane findByModelAndPlace(String model, int place);
    Airplane findByModelLikeAndPlace(String model, int place);
    Airplane findByModelLikeOrPlace(String model, int place);
    Airplane findModelLike(String model);
    Airplane findByIdBetween(int start, int end);

}
