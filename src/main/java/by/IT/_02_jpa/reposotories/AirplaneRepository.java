package by.IT._02_jpa.reposotories;


import by.IT._02_jpa.entties.Airplane;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    List<Airplane> findByPlaceBetween(int start, int end);

    @Query(value = "select  * from Airplane ", nativeQuery = true)
    List<Airplane> allPlanes();

    @Query(value = "select * from airplane where model like ?1 and place > ?2", nativeQuery = true)
    List<Airplane> concretePlains(String model, int place);

}
