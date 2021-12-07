package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(1999, "Ford", "Focus"));
        carList.add(new Car(2020, "Ford", "Fiesta"));
        carList.add(new Car(2021, "Ford", "F-150"));
        carList.add(new Car(1978, "Ford", "Mustang"));
        carList.add(new Car(2011, "Ford", "Kuga"));
    }

    public List<Car> getCarList() {
        return carList;
    }
    public List<Car> getCarsNumber(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
