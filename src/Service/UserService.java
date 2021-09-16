package Service;

import Model.Buyer;
import Model.Seller;
import Repository.UserRepository;

public class UserService {

    //add buyer, CRUD -- diff service
    //add seller
    //add item

    public void createBuyer(UserRepository ur, Buyer by)
    {
        ur.addBuyer(by);
    }

    public void createSeller(UserRepository ur, Seller sy)
    {
        ur.addSeller(sy);
    }



}
