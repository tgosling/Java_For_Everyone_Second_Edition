public class P8_04address {
    private int houseNum;
    private String street;
    private int aptNum;
    private String city;
    private int postCode;

    public static void main(String[] args){
        P8_04address house = new P8_04address(263, "Brunswick Cres", "London", 19878);
        P8_04address apt = new P8_04address(720, "Deveron Rd", 3, "London", 20105);

        print(house);
        print(apt);
    }

    public P8_04address(int houseNum, String street, int aptNum, String city, int postCode){
        this.houseNum = houseNum;
        this.street = street;
        this.aptNum = aptNum;
        this.city = city;
        this.postCode = postCode;
    }

    public P8_04address(int houseNum, String street, String city, int postCode){
        this.houseNum = houseNum;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    public static void print(P8_04address adr){
        System.out.printf("%d %s\n%s %d\n", adr.houseNum, adr.street, adr.city, adr.postCode);
    }

    public boolean comesBefore(P8_04address address){
        return this.postCode > address.postCode;
    }


}
