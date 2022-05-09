package com.Repository;

import com.Model.Buyer;
import com.Model.Seller;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<Buyer> buyersList;
    List<Seller> sellerList;

    public UserRepository() {
        this.buyersList = new ArrayList<>();
        this.sellerList = new ArrayList<>();
    }

    public List<Buyer> getBuyersList() {
        return buyersList;
    }

    public void setBuyersList(List<Buyer> buyersList) {
        this.buyersList = buyersList;
    }

    public void addBuyer(Buyer by)
    {
        this.buyersList.add(by);
    }

    public void addSeller(Seller sy)
    {
        this.sellerList.add(sy);
    }


    public List<Seller> getSellerList() {
        return sellerList;
    }

    public void setSellerList(List<Seller> sellerList) {
        this.sellerList = sellerList;
    }
}
