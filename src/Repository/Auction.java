package Repository;

import Model.BidItem;

import java.util.List;

public class Auction {
    BidItemRepository bd;

    public Auction(BidItemRepository bd) {
        this.bd = bd;
    }

    public BidItemRepository getBd() {
        return bd;
    }

    public void setBd(BidItemRepository bd) {
        this.bd = bd;
    }

    //Auction -- multiple biditems
    // biditem --multiple bids , base price , seller
    // bid -- offered price, user
}
