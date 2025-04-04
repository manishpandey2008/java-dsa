package lld.builderPattern;

public class BuilderPatternMain {
    public static void main(String[] args) {
        House house=new House().setName("Kanti House")
                .setNoOfRoom(2)
                .setAddress("Ara,Bihar")
                .setNoOfBathroom(2)
                .setColor("pink").build();
        System.out.println(house.toString());
    }
}
