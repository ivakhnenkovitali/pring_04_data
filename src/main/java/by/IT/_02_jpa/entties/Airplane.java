package by.IT._02_jpa.entties;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Table(name = "airplane")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@ToString
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String model;
    @NonNull
    private int place;
    @OneToMany
    @JoinColumn(name = "airplaneId")
    private List<Passenger> passengers;

    @Autowired
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
