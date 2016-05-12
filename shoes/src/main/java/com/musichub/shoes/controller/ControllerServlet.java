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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
	                BufferedOutputStream buffStream = new BufferedOutputStream(new FileOutputStream(new File("C:/Users/SAI/workspace/shoes/src/main/webapp/resources/images/" + fileName)));
	                buffStream.write(bytes);
	                buffStream.close();
	                error= "You have successfully uploaded " + fileName;
	                System.out.println("---------->"+error);
	            } catch (Exception e) {
	            	error="You failed to upload " + fileName + ": " + e.getMessage();
	            	System.out.println(e);
	            }
	        } else {
	        	error="Unable to upload. File is empty.";
	        }
                     
	    	productServDAO.addProduct(p);
	    	
	    	File oldName = new File("C:/Users/SAI/workspace/shoes/src/main/webapp/resources/images/" + fileName);
	        File newName = new File("C:/Users/SAI/workspace/shoes/src/main/webapp/resources/images/" + p.getId()+fileName.substring(fileName.indexOf(".")));
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
