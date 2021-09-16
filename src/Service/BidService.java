package Service;

import Model.Bid;
import Repository.BidRepository;

public class BidService {

    //add the bid
    // update the winning bid

    public void createBid(Bid bd, BidRepository bidRepo)
    {
        bidRepo.getBids().add(bd);
    }

}
