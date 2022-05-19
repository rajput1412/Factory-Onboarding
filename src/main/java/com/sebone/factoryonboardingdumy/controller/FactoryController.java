package com.sebone.factoryonboardingdumy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sebone.factoryonboardingdumy.dto.FactoryData;
import com.sebone.factoryonboardingdumy.exception.ResourceNotFoundException;
import com.sebone.factoryonboardingdumy.service.IFactoryonbarding;



/**
* This is Controller  class   implements an application that
* simply controller the whole application and rest api to the standard output.
* controller class is responsible for processing incoming
  REST API requests, preparing a model
*
* @author  Mohit
* @version 1.0
* @since    
*/


/*
 * @ClassName     :    FactoryController(RestController)
 * @UseMethods    :    
 * @ClassSpecifier:    public
 * @Objective     :    controller class is responsible for processing incoming
 *  REST API requests, preparing a model,and returning the view to be rendered as a response. 
 *  The controller classes in Spring are annotated either by the @Controller or 
 *  the @RestController annotation.
 */
@RestController
@RequestMapping("/factoryonbaording/factories")
public class FactoryController  {
   /* use  auto wired annotation Autowired annotation is used for automatic dependency injection.
      Spring framework is built on dependency injection and
	  we inject the class dependencies through spring bean configuration file.
	*/
	@Autowired
	/* create refrence of IFactoryonboarding interface*/
	public IFactoryonbarding ifactoryonboarding;
		
	/* The @GetMapping annotated methods in the @Controller annotated classes handle
	 *  the HTTP GET requests matched with given URI expression.
	 */
	
	/*  @Method Name  :     getFactoryData 
	 *  @ArgumentType :     no argument 
	 *  @ReturnType   :	    List of factorydata
	 *  @Objective    :     Crate Method for get all  factory Data. 
	 */
	@GetMapping("/getFactories")
	 public List<FactoryData> getFactoryDataList()throws ResourceNotFoundException{
		List<FactoryData>factory=(List<FactoryData>) ifactoryonboarding.findAll();
		  	if(factory.isEmpty())  
		  	{
		  		throw new ResourceNotFoundException("data not exist");
		  	}
		  return factory;
		
	} 
	/* The @GetMapping annotated methods in the @Controller annotated classes handle
	 *  the HTTP GET requests matched with given "getFactory/{id}" URI expression show factory data by id.
	 */
	
	/*  @Method Name  :     getFactoryData 
	 *  @ArgumentType :     id 
	 *  @ReturnType   :	    List of factorydata
	 *  @Objective    :     Crate Method for get factory Data by given id. 
	 */
	@GetMapping("/getFactory/{id}")
	public Optional<FactoryData> getFactorydata(@PathVariable long id) throws ResourceNotFoundException{
		return Optional.of(ifactoryonboarding.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("id does not exist"+""+id)));
		}
	/* 
	 * @PostMapping annotation maps HTTP POST requests onto specific handler methods. 
	 * It is a composed annotation that acts as a shortcut for 
	 * @RequestMapping(method = RequestMethod. POST).
     */
	 
	/* 
	 *  @Method Name  :     addFactory 
	 *  @ArgumentType :     object of FactoryData 
	 *  @ReturnType   :	    void
	 *  @Objective    :     Crate Method for add  factory . 
	 */
	@PostMapping("/addFactory")
	public String addFactory(@RequestBody FactoryData factory)throws ResourceNotFoundException
   {
	FactoryData factory1=	ifactoryonboarding.addFactory(factory);
	if(factory1.getName().isEmpty()) 
	{
  		throw new ResourceNotFoundException("name field should be not empty");

	}
		return "Added factory with id : " + factory1.getId();
	}
	 
	/*
	 * Annotation for mapping HTTP PUT requests onto specific handler methods. 
	 * Specifically, @PutMapping is a composed annotation that acts as a shortcut
	 *  for @RequestMapping(method = RequestMethod.PUT).
    */
	    /* 
		 *  @Method Name  :     updateFactory 
		 *  @ArgumentType :     object of FactoryData,long  
		 *  @ReturnType   :	    FactoryData
		 *  @Objective    :     Crate Method for update factory. 
		 */
	@RequestMapping(method=RequestMethod.PUT,value= "/getFactory/{id}")
	public FactoryData updateFactory( @RequestBody FactoryData factory ,@PathVariable("id") long id) {
		return  ifactoryonboarding.updateFactory(factory,id);
	
	}
	/*
	 * The DELETE HTTP method is used to delete the resource
	 *  and @DeleteMapping annotation maps the HTTP DELETE requests onto specific handler methods of a Spring controller.
	 */
	
	/* 
	 *  @Method Name  :     deleteFactory 
	 *  @ArgumentType :     long  
	 *  @ReturnType   :	    void
	 *  @Objective    :     Crate Method for delete factory. 
	 */
	@RequestMapping(method=RequestMethod.DELETE,value="/getFactory/{id}")
	public  String deleteFactory(@PathVariable long id) {
		ifactoryonboarding.deleteFactory(id);
		return "Delete Factory With Id"+":"+id;
	}
	
	
	/*  @Method Name  :     getFactoryDataByCategory 
	 *  @ArgumentType :     int  
	 *  @ReturnType   :	    List of factorydata
	 *  @Objective    :     Crate Method for get factory Data by given categoryId. 
	 */
	@GetMapping("/getFactory/category/{categoryId}")
	public List<FactoryData> getFactorydataByCategory(@PathVariable int categoryId)throws ResourceNotFoundException{
		
		return ifactoryonboarding.findByCategoryId(categoryId);
		
	}
	 
}
