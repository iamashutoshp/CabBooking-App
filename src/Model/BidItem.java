package Model;

public class BidItem {

    String itemName;
    int BidAmount;
    int maxBidLimit;
    Seller seller;


    public BidItem(String itemName, int bidAmount, int maxBidLimit, Seller seller) {
        this.itemName = itemName;
        BidAmount = bidAmount;
        this.maxBidLimit = maxBidLimit;
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getBidAmount() {
        return BidAmount;
    }

    public void setBidAmount(int bidAmount) {
        BidAmount = bidAmount;
    }

    public int getMaxBidLimit() {
        return maxBidLimit;
    }

    public void setMaxBidLimit(int maxBidLimit) {
        this.maxBidLimit = maxBidLimit;
    }
}
