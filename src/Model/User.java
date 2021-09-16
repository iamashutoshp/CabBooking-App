package Model;

public class User {

    private String name;
    private String address;
    private String cardnum;
    private String clientID;

    public User(String name, String address, String cardnum, String clientID) {
        this.name = name;
        this.address = address;
        this.cardnum = cardnum;
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardnum() {
        return cardnum;
    }


    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }


}
