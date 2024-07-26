import java.util.Objects;

public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(){
        System.out.println("truck");
        super.check();
        checkEngine();
        checkTrailer();
    }
//    public void updateTyre() {
//        System.out.println("Меняем покрышку");
//    }
//    public void checkEngine() {
//        System.out.println("Проверяем двигатель");
//    }
//    public void checkTrailer() {
//        System.out.println("Проверяем прицеп");
//    }

    @Override
    public String toString() {
        return "Truck{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return wheelsCount == truck.wheelsCount && Objects.equals(modelName, truck.modelName);
    }
}