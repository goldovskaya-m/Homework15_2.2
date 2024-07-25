import java.util.Objects;

public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void check(){
        System.out.println("car");
        super.check();
        checkEngine();
    }
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }
//    public void checkEngine() {
//        System.out.println("Проверяем двигатель");
//    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
