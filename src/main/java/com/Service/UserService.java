package com.Service;

import com.Model.Buyer;
import com.Model.Seller;
import com.Repository.UserRepository;

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
