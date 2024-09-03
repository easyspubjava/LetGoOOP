package factorymethod.after;

public class CarMain {

    public static void main(String[] args){

        // 차주의 이름을 생성자의 매개변수로 받습니다.
        CarFactory factory = CarFactory.getFactory();
        Car sonata = factory.createCar(CarName.SONATA.name, "민주");
        Car grandeur = factory.createCar(CarName.GRANDEUR.name, "찬규");
        Car genesis = factory.createCar(CarName.GENESIS.name, "재원");

        System.out.println(sonata);
        System.out.println(grandeur);
        System.out.println(genesis);
        System.out.println("===================");
        // 주인차를 찾아줍니다.
        System.out.println(factory.searchMyCar("민주"));
        System.out.println(factory.searchMyCar("찬규"));
        System.out.println(factory.searchMyCar("재원"));
    }
}
