package com.Model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BidItem bidItem = (BidItem) o;
        return BidAmount == bidItem.BidAmount &&
                maxBidLimit == bidItem.maxBidLimit &&
                itemName == bidItem.itemName &&
                Objects.equals(seller, bidItem.seller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, BidAmount, maxBidLimit, seller);
    }
}
