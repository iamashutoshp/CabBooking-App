package com.Repository;

import com.Model.Bid;
import com.Model.BidItem;
import com.Model.Buyer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BidRepository {

    private List<Bid> bids;
    private Bid winningBid = new Bid();

    public BidRepository() {
        this.bids = new ArrayList<>();
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public void addBid(Bid bd)
    {
        this.bids.add(bd);
        if(winningBid.getBidPrice() < bd.getBidPrice())
            winningBid = bd;
    }

    public Bid getWinningBid()
    {
        return winningBid;
    }


    public List<Bid> getAllBidsForItem(BidItem bdItem)
    {
        List<Bid> result = new ArrayList<>();
        for(Bid i: bids)
        {
            if(i.getItem() == bdItem)
            {
                result.add(i);
            }
        }
        return result;

    }


    public List<BidItem> getAllItemForUser(Buyer by)
    {

        Set<BidItem> itemsForUser = new HashSet<>();

        for(Bid i: bids)
        {
            if(i.getUser() == by)
            {
                itemsForUser.add(i.getItem());
            }
        }
        return itemsForUser.stream().collect(Collectors.toList());

    }





}
