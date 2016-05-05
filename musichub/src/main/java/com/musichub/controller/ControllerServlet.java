package com.musichub.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import com.musichub.dao.ProductDAO;
import com.musichub.dao.ProductDAOImpl;
import com.musichub.model.Product;  
@Controller  
public class ControllerServlet {  
    @RequestMapping("/")  
    public ModelAndView index() {  
        String message = "index page called";  
        System.out.println(message);
        return new ModelAndView("index", "message", message);  
    }  
    @RequestMapping("/SignUp")  
    public ModelAndView signUp() {  
        String message = "Sign Up Page called";  
        System.out.println(message);
        return new ModelAndView("SignUp", "message", message);  
    }  
    @RequestMapping("/AboutUs")  
    public ModelAndView aboutUs() {  
        String message = "about us page called";  
        System.out.println(message);
        return new ModelAndView("AboutUs", "message", message);  
    }  
    @RequestMapping("/Login")  
    public ModelAndView login() {  
        String message = "Login page called";  
        System.out.println(message);
        return new ModelAndView("Login", "message", message);  
    }  
    @RequestMapping("/AddtoCart")  
    public ModelAndView addToCart() {  
        String message = "add to cart called";  
        System.out.println(message);
        return new ModelAndView("AddtoCart", "message", message);  
    }  
    @RequestMapping("/product")  
    public ModelAndView product(HttpServletRequest request,HttpServletResponse response) {  
    	 List<Product> asList=null;
        //String message = "product page called";  
        ProductDAO p=new ProductDAOImpl();
        ObjectMapper mapper = new ObjectMapper();
        String jsonData="";
        
        try {
			jsonData=mapper.writeValueAsString(p.getProducts());
			
			asList = mapper.readValue(jsonData, new TypeReference<List<Product>>(){});
			 
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
        
        return new ModelAndView("product","productm",jsonData);
    }  
}  