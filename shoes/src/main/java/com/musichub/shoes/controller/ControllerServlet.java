package com.musichub.shoes.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.furniturestore.model.CardDetail;
import com.furniturestore.model.Cart;
import com.furniturestore.model.CartItem;
import com.furniturestore.model.Item;
import com.furniturestore.model.UsersDetail;
import com.furniturestore.service.CardDetailService;
import com.furniturestore.service.CartItemService;
import com.furniturestore.service.CartService;
import com.furniturestore.service.UsersDetailService;
import com.musichub.shoes.dao.ProductDAO;
import com.musichub.shoes.dao.ProductDAOImpl;
import com.musichub.shoes.model.*;
import com.musichub.shoes.service.CustomerServDAO;
import com.musichub.shoes.service.ProductServDAO;

@Controller
public class ControllerServlet {
	@Autowired(required=true)
	CustomerServDAO customerServDAO;
	@Autowired(required=true)
	ProductServDAO  productServDAO;
	@RequestMapping(value={"/LeeCooper","/Diesel","/Adidas","/Levis","/Paraqon","/Puma","/RedTape","/Reebok","/Sparx","/Tommy"})
	ModelAndView data(HttpServletRequest request,HttpServletResponse response)
	{
		
		String str=request.getParameter("data");
		System.out.println("The data is:------------------------------->"+str);
		ObjectMapper mapper = new ObjectMapper();
        String jsonData="";
        try {
			jsonData=mapper.writeValueAsString(productServDAO.getProductByName(str));
			System.out.println("json data in "+str+"isssssssss"+jsonData);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return new ModelAndView(str,"productsdata",jsonData);
	}
	
	@RequestMapping("/Bata")
	ModelAndView bata()
	{
		System.out.print("in Bata");
		return new ModelAndView("Bata");
	}
	
	@RequestMapping("/Shop")
	public ModelAndView shopnow()
	{
		System.out.println("******In Shop********");
		return new ModelAndView("Shop");
	}
	
	@RequestMapping("/ShopNow")
	public ModelAndView shopNow()
	{
		System.out.println("******In ShopNow********");
		return new ModelAndView("ShopNow");
	}
	@RequestMapping("/ShopLogin")
	public ModelAndView shopLogin()
	{
		System.out.println("******In Shop Login********");
		return new ModelAndView("ShopLogin");
	}
	
	@RequestMapping("/AdminCheck")
	public String printWelcome(ModelMap model,Principal principal)
	{
		System.out.println("in admin");
		String name=principal.getName();
		System.out.println("name:"+name);
		model.addAttribute("username",name);
		model.addAttribute("message","spring security custom example");
		
		return "Admin";
	}
	
	@RequestMapping("/ViewUsers")
	public ModelAndView viewUsers()
	{
		
		String message = "View Users Page";  
	       /* Map<String,Object> model = new HashMap<String,Object>();  
	        model.put("products",  prepareListofBean(productServDAO.viewAllProducts())); 
	         return new ModelAndView("ViewProducts", model);  
	        */
	        ObjectMapper mapper = new ObjectMapper();
	        String jsonData="";
	        try {
				jsonData=mapper.writeValueAsString(customerServDAO.viewUsers());
				System.out.println("json data:"+jsonData);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        return new ModelAndView("ViewUsers","users",jsonData);
	     
	}
	
	
	@RequestMapping("/login")
	public String loginMethod()
	{
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout()
	{
		System.out.println("logout page called");
		return "logout";
	}
	 @RequestMapping(value={"/","/index"})  
	    public ModelAndView index() {  
	        String message = "index page called";  
	        System.out.println(message);
	        return new ModelAndView("index", "message", message);  
	    }  
	/* @RequestMapping("/Admin")  
	    public ModelAndView admin() {  
	        String message = "admin page called";  
	        System.out.println(message);
	        return new ModelAndView("Admin", "message", message);  
	    }  */
	 @RequestMapping("/SignUp")  
	    public ModelAndView signUp() {  
	        String message = "Sign Up Page called";  
	        System.out.println(message);
	        return new ModelAndView("SignUp", "command", new Customer());  
	    }  
	    @RequestMapping("/AboutUs")  
	    public ModelAndView aboutUs() {  
	        String message = "about us page called";  
	        System.out.println(message);
	        return new ModelAndView("AboutUs", "message", message);  
	    }  
	    @RequestMapping("/SignIn")  
	    public ModelAndView login() {  
	        String message = "SignIn page called";  
	        System.out.println(message);
	        return new ModelAndView("SignIn", "command",new Customer());  
	    } 
	    @RequestMapping("/AddProduct")  
	    public ModelAndView addProduct() {  
	        String message = "Add Product Page";  
	        System.out.println(message);
	        return new ModelAndView("AddProduct", "command", new Product());  
	    } 
	    @RequestMapping("/AddtoCart")  
	    public ModelAndView addToCart() {  
	        String message = "add to cart called";  
	        System.out.println(message);
	        return new ModelAndView("AddtoCart", "message", message);  
	    }  
	    @RequestMapping("/delete")  
	    public ModelAndView deleteProduct(HttpServletRequest request,@ModelAttribute("shoes") Product p)
	    {
	    	productServDAO.deleteProduct(prepareModel(p));
	    Map<String,Object> model=new HashMap<String,Object>();
	    model.put("product", null);  
	    model.put("products",  prepareListofBean(productServDAO.viewAllProducts())); 
	    return new ModelAndView("Admin", model).addObject("command", new Product());
	    
	    }
	    @RequestMapping("/deleteCustomer")  
	    public ModelAndView deleteCustomer(HttpServletRequest request,@ModelAttribute("shoes") Customer c)
	    {
	  customerServDAO.deleteUser(prepareModel(c));
	    Map<String,Object> model=new HashMap<String,Object>();
	    model.put("user", null);  
	    model.put("users",  prepareListofBeans(customerServDAO.viewUsers())); 
	    return new ModelAndView("Admin", model).addObject("command", new Customer());
	    
	    }
	    @RequestMapping("/Product")  
	    public ModelAndView product(HttpServletRequest request,HttpServletResponse response) {  
	    	System.out.println("products Page Called");
	    	 ObjectMapper mapper = new ObjectMapper();
		        String jsonData="";
		        try {
					jsonData=mapper.writeValueAsString(productServDAO.viewAllProducts());
					System.out.println("json data:"+jsonData);
				} catch (JsonGenerationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		        return new ModelAndView("Product","productm",jsonData);
	    }
	    @RequestMapping("/ViewProducts")  
	    public ModelAndView viewProducts() {  
	        String message = "View Products Page";  
	       /* Map<String,Object> model = new HashMap<String,Object>();  
	        model.put("products",  prepareListofBean(productServDAO.viewAllProducts())); 
	         return new ModelAndView("ViewProducts", model);  
	        */
	        ObjectMapper mapper = new ObjectMapper();
	        String jsonData="";
	        
	        
	        try {
				jsonData=mapper.writeValueAsString(productServDAO.viewAllProducts());
				System.out.println("json data:"+jsonData);
			} catch (JsonGenerationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        return new ModelAndView("ViewProducts","productm",jsonData);
	       
	    } 
	    
	    
	    
	    @RequestMapping("/furnitureinventory")
	    public String itemInventory(Model model) {
	        List<Product> items = productServDAO.viewAllProducts();
	        model.addAttribute("items", items);

	        return "furnitureInventory";
	    }
	    /*
	     * userManagement method is used to open user management page.
	     */
	    @RequestMapping("/user")
	    public String userManagement(Model model) {

	        List<Customer> usersDetailList = customerServDAO.viewUsers();
	        model.addAttribute("usersDetailList", usersDetailList);

	        return "userManagement";
	    }
	    
	    
	    
	    
	    @Autowired
	    private CartService cartService;
	    
	    @Autowired
	    private UsersDetailService usersDetailService;
	    
	    @Autowired
	    private CartItemService cartItemService;

	    @Autowired
	    private CardDetailService cardService;
	    /*
	     * CardDetail method is used to open card detail form
	     */
	    @RequestMapping("/cardDetail")
	    public String CardDetail(Model model) {
	    	
	    	CardDetail cardDetail = new CardDetail();
	        model.addAttribute("carddetail", cardDetail);
	    	return "cardDetail";

	    }
	    /*
	     * CardDetailPost method is used to store user card information into the system
	     */
	    @RequestMapping(value = "/cardDetail/{cartId}", method = RequestMethod.POST)
	    public String CardDetailPost(@PathVariable(value ="cartId") int cartId, @Valid @ModelAttribute("carddetail") CardDetail cardDetail, BindingResult result
	    		,@AuthenticationPrincipal User activeUser ,Model model) {
	    	List<String> cardTypeList = new ArrayList<String>();
	    	cardTypeList.add("Visa-Debit/Credit");
	    	cardTypeList.add("Mastercard");
	    	List<String> expiryMonthList = new ArrayList<String>();
	    	expiryMonthList.add("01");
	    	expiryMonthList.add("02");
	    	expiryMonthList.add("03");
	    	expiryMonthList.add("04");
	    	expiryMonthList.add("05");
	    	expiryMonthList.add("06");
	    	expiryMonthList.add("07");
	    	expiryMonthList.add("08");
	    	expiryMonthList.add("09");
	    	expiryMonthList.add("10");
	    	expiryMonthList.add("11");
	    	expiryMonthList.add("12");
	    	List<String> expiryYearList = new ArrayList<String>();
	    	expiryYearList.add("2016");
	    	expiryYearList.add("2017");
	    	expiryYearList.add("2018");
	    	expiryYearList.add("2019");
	    	expiryYearList.add("2020");
	    	expiryYearList.add("2021");
	    	expiryYearList.add("2022");
	    	expiryYearList.add("2023");
	    	expiryYearList.add("2024");
	    	expiryYearList.add("2025");
	    	expiryYearList.add("2026");
	    	expiryYearList.add("2027");
	    	expiryYearList.add("2028");
	    	expiryYearList.add("2029");
	    	expiryYearList.add("2030");
	    	model.addAttribute("cardTypeList",cardTypeList);
	    	model.addAttribute("expiryMonthList",expiryMonthList);
	    	model.addAttribute("expiryYearList",expiryYearList);
	    	UsersDetail usersDetail = customerServDAO.getUserByUsername(activeUser.getUsername());
	    	Cart cart = cartService.getCartById(cartId);
	    	model.addAttribute("cartId", cartId);
	    	model.addAttribute("grandTotal", cart.getGrandTotal());

	        if (result.hasErrors()) {
	            return "cardDetailError";
	        }

	       
	       
	        cartItemService.removeAllCartItems(cart);
	        cardDetail.setUsersDetail(usersDetail);
	        cardDetail.setCart(cart);
	        cardDetail.setTotalCost(cart.getGrandTotal());
	        cardService.addCardDetail(cardDetail);

	        return "orderCompleted";

	    }
	    
	    
	    
	    
	    
	    
	    @RequestMapping(value = "/add", method = RequestMethod.GET)  
	    public ModelAndView addEmployee(@ModelAttribute("command")Product product,  
	      BindingResult result) {  
	    	System.out.println("product name:"+product.getName());
	    	System.out.println("Inside add employee method..");
	     Map<String, Object> model = new HashMap<String, Object>();  
	     model.put("products",  prepareListofBean(productServDAO.viewAllProducts()));  
	     return new ModelAndView("EditedProducts", model);  
	    }  
	    
	    @RequestMapping("/StoreProduct")
	    ModelAndView storeProduct(HttpServletRequest request,ModelMap model,@RequestParam("file") MultipartFile file,@ModelAttribute("shoes") Product p)
	    {
	    	System.out.println("In Add Product method");
	    	System.out.println("descrip:"+p.getDescription());
	    	String fileName = null,error="";
	    	if (!file.isEmpty()) {
	            try {
	                fileName = file.getOriginalFilename();
	                byte[] bytes = file.getBytes();
	                BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File("C:/Users/SAI/Desktop/Project_TTT/day 12/shoes/src/main/webapp/resources/images/" + fileName)));
	                buffStream.write(bytes);
	                buffStream.close();
	                error= "You have successfully uploaded " + fileName;
	                System.out.println("---------->"+error);
	            } catch (Exception e) {
	            	error="You failed to upload " + fileName + ": " + e.getMessage();
	            	System.out.println(error);
	            }
	        } else {
	        	error="Unable to upload. File is empty.";
	        }
                     
	    	productServDAO.addProduct(p);
	    	
	    	File oldName = new File("C:/Users/SAI/Desktop/Project_TTT/day 12/shoes/src/main/webapp/resources/images/" + fileName);
	        File newName = new File("C:/Users/SAI/Desktop/Project_TTT/day 12/shoes/src/main/webapp/resources/images/"+ p.getId()+fileName.substring(fileName.indexOf(".")));
	        System.out.println("new file name:--------------->"+newName);
	        if(oldName.renameTo(newName)) {
	           System.out.println(p.getId());
	           error=p.getName()+" added Successfully !";
	           System.out.println("");
	        } 
	    	return new ModelAndView("ProductsAdded", "message", "");
	    	
	    }
	    
	    @RequestMapping("/store")
	    ModelAndView store(HttpServletRequest request,ModelMap model,@ModelAttribute("shoes") Customer u)
	    {
	    	System.out.println(u.getHobbies());
	    	customerServDAO.addCustomer(u);
	    	return new ModelAndView("SignUpSuccess", "data", u.getUsername());
	    }
	    
	    @RequestMapping("/edit")  
	    public ModelAndView editProduct(@ModelAttribute("command")Product  p) {  
	      Map<String, Object> model = new HashMap<String, Object>();  
	      model.put("product", prepareProductBean(productServDAO.getProduct(p.getId())));  
	      model.put("products",  prepareListofBean(productServDAO.viewAllProducts()));  
	      return new ModelAndView("EditedProducts", model);  
	     } 
	    
	    @RequestMapping("/refreshCart/{cartId}")
	    public @ResponseBody
	    Cart getCartById (@PathVariable(value = "cartId") int cartId) {
	        return cartService.getCartById(cartId);
	    }
	    /*
	     * addItem method is used to add a item in user cart.
	     */

	    @RequestMapping(value = "/addItem/{itemId}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void addItem (@PathVariable(value ="itemId") int itemId, @AuthenticationPrincipal User activeUser) {

	    	UsersDetail usersDetail = usersDetailService.getUserByUsername(activeUser.getUsername());
	        Cart cart = usersDetail.getCart();
	        Item item = itemService.getItemById(itemId);
	        List<CartItem> cartItems = cart.getCartItems();

	        for (int i=0; i<cartItems.size(); i++) {
	            if(item.getItemId()==cartItems.get(i).getItem().getItemId()){
	                CartItem cartItem = cartItems.get(i);
	                cartItem.setQuantity(cartItem.getQuantity()+1);
	                cartItem.setTotalPrice(item.getItemPrice()*cartItem.getQuantity());
	                cartItemService.addCartItem(cartItem);

	                return;
	            }
	        }

	        CartItem cartItem = new CartItem();
	        cartItem.setItem(item);
	        cartItem.setQuantity(1);
	        cartItem.setTotalPrice(item.getItemPrice()*cartItem.getQuantity());
	        cartItem.setCart(cart);
	        cartItemService.addCartItem(cartItem);
	    }
	    /*
	     * removeItem method is used to remove a item from user cart.
	     */
	    @RequestMapping(value = "/removeItem/{itemId}", method = RequestMethod.PUT)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void removeItem (@PathVariable(value = "itemId") int itemId) {
	        CartItem cartItem = cartItemService.getCartItemByItemId(itemId);
	        cartItemService.removeCartItem(cartItem);

	    }
	    /*
	     * clearCartItems method is used to remove all items from user cart.
	     */
	    @RequestMapping(value = "/clearCartItems/{cartId}", method = RequestMethod.DELETE)
	    @ResponseStatus(value = HttpStatus.NO_CONTENT)
	    public void clearCartItems(@PathVariable(value = "cartId") int cartId) {
	        Cart cart = cartService.getCartById(cartId);
	        cartItemService.removeAllCartItems(cart);
	    }
	    /*
	     * ExceptionHandler for client errors.
	     */
	    @ExceptionHandler(IllegalArgumentException.class)
	    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Illegal request, please verify your payload.")
	    public void handleClientErrors (Exception e) {}
	    /*
	     * ExceptionHandler for server errors.
	     */
	    @ExceptionHandler(Exception.class)
	    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Internal Server Error.")
	    public void handleServerErrors (Exception e) {}
	}


	    
	    private List<Product> prepareListofBean(List<Product> products){  
	    	  List<Product> beans = null;  
	    	  if(products != null && !products.isEmpty()){  
	    	   beans = new ArrayList<Product>();  
	    	   Product bean = null;  
	    	   for( Product product : products){  
	    	    bean = new  Product();  
	    	    bean.setId(product.getId());
	    	    bean.setName(product.getName());
	    	    bean.setPrice(product.getPrice());
	    	    bean.setDescription(product.getDescription());
	    	    beans.add(bean);  
	    	   }  
	    	  }  
	    	  return beans;  
	    	 }  
	    private List<Customer> prepareListofBeans(List<Customer> customers){  
	    	  List<Customer> beans = null;  
	    	  if(customers != null && !customers.isEmpty()){  
	    	   beans = new ArrayList<Customer>();  
	    	  Customer bean = null;  
	    	   for( Customer customer : customers){  
	    	    bean = new  Customer();  
	    	    bean.setEmail(customer.getEmail());
	    	    bean.setUsername(customer.getUsername());
	    	    bean.setPassword(customer.getPassword());
	    	    bean.setHobbies(customer.getHobbies());
	    	    bean.setEnabled(customer.isEnabled());
	    	    beans.add(bean);  
	    	   }  
	    	  }  
	    	  return beans;  
	    	 }  
	    private Product prepareModel(Product p){  
	    	 Product product=new Product();
	    	 product.setId(p.getId());
	    	 product.setName(p.getName());
	    	 product.setPrice(p.getPrice());
	    	 product.setDescription(p.getDescription()); 
	    	  return product;  
	    	 }  
	    private Customer prepareModel(Customer c){  
	    	Customer cust=new Customer();
	    	cust.setId(c.getId());
	    	cust.setUsername(c.getUsername());
	    	cust.setPassword(c.getPassword());
	    	cust.setEmail(c.getEmail());
	    	cust.setEnabled(c.isEnabled());
	    	cust.setHobbies(c.getHobbies());
	    	return cust;
	    	
	    	 }  
	    
	    private Product prepareProductBean(Product product){  
	    	 Product bean = new Product();  
	    	  bean.setId(product.getId()); 
	    	  bean.setName(product.getName());
	    	  bean.setDescription(product.getDescription());
	    	  bean.setPrice(product.getPrice());
	    	  return bean;  
	    	 }  
	    
}
