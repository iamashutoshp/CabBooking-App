package Service;

public class DBServiceDAOImpl {
//Auction -- multiple biditems
    // biditem --multiple bids , base price , seller
    // bid -- offered price, user


//add a bid  -- record a user's bid for an item
// update the winning bid
//get all bids for an item
// get all the items on which user has bid
// add user, -- CRUD -- diff service
// CRUD for auction -- diff service


    //

    /*return placedBids.stream()
            .filter(bid->item.equals(bid.getName()))
            .map(bid -> bid.getPrice())
            .max(Float::compare)
            .orElse(0f);*/

    /*Map<String, List<Bids>> userBids = new HashMap<String,List<Bids>>();*/


    /*Map<String, PriorityQueue<Bid>> itemBids = new HashMap<String, PriorityQueue<Bid>>();*/

    /*Don't get disheartened by the rejection, it most likely isn't about you. Your solution works but as someone posted above said might be little over-engineered. My simple solution would be like below:

Map<String, List<Bids>> userBids = new HashMap<String,List<Bids>>();
Given a user id - get all bids user has bid for - O(1)
Map<String, PriorityQueue<Bid>> itemBids = new HashMap<String, PriorityQueue<Bid>>();
Given an item id - get all Bids for the item - O(1)- return everything in the Queue

Also return Bid with highest value (winning bid) for the item in O(1) time

itemBids.get('itemId').peek() // winning bid
Record Bid - add to userBids and itemBids maps

class Bid implements Comparator<Integer> {
    int amt;

    String user;

    String item;

    // constructor

    public int compare(Bid b1, Bid b2) {
        return b2.amt - b1.amt; // decending order
    }
}*/
}
