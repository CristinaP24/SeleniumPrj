import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;


public class Main {

    public static void main(String[] args) {
        Login login = new Login();
                                                                    //Tema
        //Login - 5
        //login.a_validLoginTest();
        //login.b_validLoginforAll();
      //login.c_loginWithInvalidChar();
     // login.d_loginWithSpace();
      //login.e_loginWithCaps();
       //login.f_loginWith256h();


       //Register - 2
      Register register = new Register();

      //register.validReg();
       //register.invalidRegNo();

//       Cart - 3
         Cart cart = new Cart();
         //cart.vctAnnBlackAnkle();
        //cart.add1000ProductItems();
        //cart.addMinus1ProductItem();


        //Checkout - 3
       Checkout checkout = new Checkout();
//
       checkout.validCheckout();
      //checkout.validCheckoutProduct();
      //checkout.invalidCheckoutProduct_1();
//
//       // Wishlist - 2
      Wishlist wishlist = new Wishlist();
      //wishlist.validWishListAdd();
     //wishlist.validWishListAddSame();

       // Reviews - 3
          Reviews reviews = new Reviews();

     // reviews.validReviewLoggedIn();
      //reviews.invalidReviewLoggedIn_1();
       //reviews.invalidReviewLoggedIn_2();

    }

        public static void sleep (int seconds){
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


