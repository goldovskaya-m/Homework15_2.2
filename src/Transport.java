public class Transport {
    protected final String modelName;
    protected final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void check() {
        for (int i = 0; i < wheelsCount; i++) {
            check();
        }
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
    public int getWheelsCount() {
        return wheelsCount;
    }
    private String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "modelName='" + modelName + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}


