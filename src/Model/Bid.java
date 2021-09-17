package Model;

import java.sql.Time;

public class Bid {

    Buyer user;
    BidItem item;
    int bidPrice = 0;
    Time time;

    public Bid()
    {

    }
    public Bid(Buyer user, BidItem item, int bidPrice, Time time) {
        this.user = user;
        this.item = item;
        this.bidPrice = bidPrice;
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(Buyer user) {
        this.user = user;
    }

    public BidItem getItem() {
        return item;
    }

    public void setItem(BidItem item) {
        this.item = item;
    }

    public int getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(int bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
