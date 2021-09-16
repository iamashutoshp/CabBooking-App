package Repository;

import Model.Bid;

import java.util.ArrayList;
import java.util.List;

public class BidRepository {

    private List<Bid> bids;

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
    }



}
