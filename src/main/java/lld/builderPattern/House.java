package lld.builderPattern;

public class House {
    private String name;
    private String address;
    private Integer noOfRoom;
    private Integer noOfBathroom;
    private String color;

    public House setName(String name){
         this.name=name;
         return this;
    }

    public House setAddress(String address) {
        this.address = address;
        return this;
    }

    public House setNoOfRoom(Integer noOfRoom) {
        this.noOfRoom = noOfRoom;
        return this;
    }

    public House setNoOfBathroom(Integer noOfBathroom) {
        this.noOfBathroom = noOfBathroom;
        return this;
    }

    public House setColor(String color) {
        this.color = color;
        return this;
    }

    public House build(){
        return this;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", noOfRoom=" + noOfRoom +
                ", noOfBathroom=" + noOfBathroom +
                ", color='" + color + '\'' +
                '}';
    }
}
