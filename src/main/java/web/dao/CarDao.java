package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    static List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("model1","series1",101));
        carList.add(new Car("model2","series2",102));
        carList.add(new Car("model3","series3",103));
        carList.add(new Car("model4","series4",104));
        carList.add(new Car("model5","series5",105));
    }

    public List<Car> index(int count) {
        if (count <= 5) {
            return carList.subList(0, count);
        }
        return carList;
    }


}
