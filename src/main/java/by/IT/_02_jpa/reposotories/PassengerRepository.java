package by.IT._02_jpa.reposotories;


import by.IT._02_jpa.entties.Passenger;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
}