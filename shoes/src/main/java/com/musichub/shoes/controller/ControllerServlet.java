package com.musichub.shoes.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/AdminCheck")
	public String printWelcome(ModelMap model,Principal principal)
	{
		System.out.println("In Login Controller");
		String name=principal.getName();
		System.out.println("name:"+name);
		model.addAttribute("username",name);
		model.addAttribute("message","spring security custom example");
		
		return "Admin";
	}
	@RequestMapping("/login")
	public String loginMethod()
	{
		return "login";
	}
	
	 @RequestMapping("/")  
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
	        return new ModelAndView("SignIn", "message", message);  
	    } 
	    @RequestMapping("/AddProduct")  
	    public ModelAndView addProduct() {  
	        String message = "Add Product Page";  
	        System.out.println(message);
	        return new ModelAndView("AddProduct", "command", new Product());  
	    } 
	    @RequestMapping("/delete")  
	    public ModelAndView deleteProduct(HttpServletRequest request,@ModelAttribute("shoes") Product p)
	    {
	    	productServDAO.deleteProduct(prepareModel(p));
	    Map<String,Object> model=new HashMap<String,Object>();
	    model.put("product", null);  
	    model.put("products",  prepareListofBean(productServDAO.viewAllProducts())); 
	    return new ModelAndView("ViewProducts", model).addObject("command", new Product());
	    
	    }
	    @RequestMapping("/ViewProducts")  
	    public ModelAndView viewProducts() {  
	        String message = "View Products Page";  
	        Map<String,Object> model = new HashMap<String,Object>();  
	        model.put("products",  prepareListofBean(productServDAO.viewAllProducts()));  
	        return new ModelAndView("ViewProducts", model);  
	    } 
	    @RequestMapping(value = "/add", method = RequestMethod.GET)  
	    public ModelAndView addEmployee(@ModelAttribute("command")Product product,  
	      BindingResult result) {  
	    	System.out.println("Inside add employee method..");
	     Map<String, Object> model = new HashMap<String, Object>();  
	     model.put("products",  prepareListofBean(productServDAO.viewAllProducts()));  
	     return new ModelAndView("EditedProducts", model);  
	    }  
	    
	    @RequestMapping("/StoreProduct")
	    ModelAndView storeProduct(HttpServletRequest request,ModelMap model,@ModelAttribute("shoes") Product p)
	    {
	    	System.out.println("In Add Product method");
	    	System.out.println(p.getDescription());
	    	productServDAO.addProduct(p);
	    	return new ModelAndView("ProductsAdded", "message", "");
	    	
	    }
	    
	    @RequestMapping("/store")
	    ModelAndView store(HttpServletRequest request,ModelMap model,@ModelAttribute("shoes") Customer u)
	    {
	    	System.out.println(u.getHobbies());
	    	customerServDAO.addCustomer(u);
	    	return new ModelAndView("categories", "data", "");
	    }
	    @RequestMapping("/Product")  
	    public ModelAndView product(HttpServletRequest request,HttpServletResponse response) {  
	    	System.out.println("products Page Called");
	    	 List<Product> asList=null;
	        //String message = "product page called";  
	        ProductDAO p=new ProductDAOImpl();
	        ObjectMapper mapper = new ObjectMapper();
	        String jsonData="";
	        
	        try {
				jsonData=mapper.writeValueAsString("");
				
				
				 
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
	    @RequestMapping("/edit")  
	    public ModelAndView editProduct(@ModelAttribute("command")Product  p) {  
	      Map<String, Object> model = new HashMap<String, Object>();  
	      model.put("product", prepareProductBean(productServDAO.getProduct(p.getId())));  
	      model.put("products",  prepareListofBean(productServDAO.viewAllProducts()));  
	      return new ModelAndView("EditedProducts", model);  
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
	    private Product prepareModel(Product p){  
	    	 Product product=new Product();
	    	 product.setId(p.getId());
	    	 product.setName(p.getName());
	    	 product.setPrice(p.getPrice());
	    	 product.setDescription(p.getDescription()); 
	    	  return product;  
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
