package com.mywebsite.xperiencegaming.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mywebsite.xperiencegaming.model.Cart;
import com.mywebsite.xperiencegaming.model.CartItem;
import com.mywebsite.xperiencegaming.model.Customer;
import com.mywebsite.xperiencegaming.model.Product;
import com.mywebsite.xperiencegaming.service.CartItemService;
import com.mywebsite.xperiencegaming.service.CustomerService;
import com.mywebsite.xperiencegaming.service.ProductService;

@Controller
public class HomeController {
	
	 @Autowired
	    private CartItemService cartItemService;
	 @Autowired
	    private CustomerService customerService;
	 @Autowired
	    private ProductService productService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }
    
  /*  @RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public String addItem (@PathVariable(value = "productId") int productId, @AuthenticationPrincipal User activeUser){
        Customer customer = customerService.getCustomerByUsername(activeUser.getUsername());
        Cart cart = customer.getCart();
        Product product = productService.getProductById(productId);
        List<CartItem> cartItems = cart.getCartItems();

        for (int i=0; i < cartItems.size(); i++){
            if(product.getProductId() == cartItems.get(i).getProduct().getProductId()){
                CartItem cartItem = cartItems.get(i);
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                cartItem.setTotalPrice(product.getProductPrice()*cartItem.getQuantity());
                cartItemService.addCartItem(cartItem);
                System.out.println("product added");
                //return "viewProduct";
            }
        }

        CartItem cartItem = new CartItem();
        cartItem.setProduct(product);
        cartItem.setQuantity(1);
        cartItem.setTotalPrice(product.getProductPrice()*cartItem.getQuantity());
        cartItem.setCart(cart);
        cartItemService.addCartItem(cartItem);
        
        System.out.println("same product");
        return "redirect:/viewProduct";
    }*/

    @RequestMapping("/login")
    public String login(
            @RequestParam(value="error", required = false)
            String error,
            @RequestParam(value="logout", required = false)
            String logout,
            Model model){

        if(error != null){
            model.addAttribute("error", "Invalid username and password");
        }

        if (logout !=null){
            model.addAttribute("msg", "You have been logged out successfully");
        }

        return "login";
    }

    @RequestMapping("/about")
    public String about(){
        return "about";
    }
    
    @RequestMapping("/logout")
    public String logout(){
        return "home";
    }


} // The End of Class;
