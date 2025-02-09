package jihe.zuoye4;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author czq
 * @version 1.0
 */
public class D {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("czq",4545));
        linkedHashSet.add(new Car("czq",4545));
        linkedHashSet.add(new Car("zq",4545));

        for(Object o:linkedHashSet){
            System.out.println(o);
        }
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}


