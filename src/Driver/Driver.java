package Driver;

import Model.Bid;
import Model.BidItem;
import Model.Buyer;
import Model.Seller;
import Repository.BidItemRepository;
import Repository.BidRepository;
import Repository.UserRepository;
import Service.BidService;
import Service.UserService;
import com.sun.deploy.net.HttpResponse;
import jdk.nashorn.internal.parser.JSONParser;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Time;
import java.util.*;

import org.json.*;


public class Driver {


    public static void main(String[] args) throws IOException {
        //Perform the steps
        //Add the bid
        //if asked then it will return the winning bid
        //when someone adds a bid, for specific item, keep winning bid

        UserRepository ur = new UserRepository();
        BidItemRepository bidItemRepo = new BidItemRepository();
        BidRepository bidRepository = new BidRepository();
        BidService bidService = new BidService();
        UserService userService = new UserService();
        Buyer buyer = new Buyer("sid","kop","12","google");
        Seller seller = new Seller("Omu", "Ich", "23", "infy");
        BidItem bidItem = new BidItem("ipod", 1200, 100, seller);
        Bid ob = new Bid(buyer, bidItem, 1400, null);
        bidService.createBid(ob, bidRepository);

    }












}
