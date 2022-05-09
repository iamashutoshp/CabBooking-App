package com.Repository;

import com.Model.Bid;
import com.Model.BidItem;

import java.util.ArrayList;
import java.util.List;

public class BidItemRepository {

    private List<BidItem> biditems;

    public BidItemRepository()
    {
        this.biditems = new ArrayList<>();
    }

    public List<BidItem> getBiditems() {
        return biditems;
    }

    public void setBiditems(List<BidItem> biditems) {
        this.biditems = biditems;
    }

    public void addBidItem(BidItem bd)
    {
        biditems.add(bd);
    }

    public List<BidItem> getBidItemList()
    {
        return biditems;
    }








}
