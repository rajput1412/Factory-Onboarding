package com.sebone.factoryonboardingdumy.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sebone.factoryonboardingdumy.dao.IFactoryOnboardingDAO;
import com.sebone.factoryonboardingdumy.dto.Compliance;
import com.sebone.factoryonboardingdumy.dto.FactoryData;
/* 
 *So overall @Service annotation is used with classes that provide some business functionalities.Spring context will
 * autodetect these classes when annotation-based configuration and classpath scanning is used. 
 */
@Service
/*
 * @ClassName     :    FactoryOnboardingImpl(Service)
 * @UseMethods    :    Implement all method of IFactoryOnbarding interface
 * @ClassSpecifier:    public
 * @Objective     :    FactoryOnboardingImpl class is providing implements of IFactoryOnbarding interface,this class is responsible for processing incoming
 *  REST API requests, preparing a model,and returning the view to be rendered as a response. 
 *  The service classes in Spring are annotated either by the @@Service annotation.
 */

public class FactoryOnboardingIMPL implements IFactoryonbarding {
	
//	FactoryData samsung = new FactoryData( 115,1012, "Samsung", "Hyderabad", "sbh1021514ges", "141295841411", "sebone", "samsung@gmail.com","1045481414", "Telangana","filmcity hyderabad",
//			"01/05/1998", "active", "01/05/2022","01/04/2022", 1,
//		   Arrays.asList(
//                    new Compliance("regular",1002,"10214","20/10/2025","active" ),
//                    new Compliance("Corporate",1002,"10214","20/10/2025","active")
//            )
//    );
//
//	FactoryData ibis = new FactoryData(116,
//		   1014,
//		    "Philips",
//		    "Hyderabad",
//		    "sbh1021514ges",
//		     "141295841411",
//		     "sebone",
//		 "samsung@gmail.com",
//		    "1045481414",
//		  "Telangana",
//		    "filmcity hyderabad",
//		   "01/05/1998",
//		    "active",
//		    "01/05/2022",
//		    "01/04/2022",
//		    1,
//            
//            
//            Arrays.asList(
//                    new Compliance("regular",1004,"10215","20/10/2025","active"),
//                    new Compliance("Corporate",1006,"102124","20/10/2025","active")
//
//            )
//    );
	@Autowired
	//referenc of IFactoryOnboardingDao interface
	private IFactoryOnboardingDAO ifactdao;
	
    List<FactoryData> factories =  new ArrayList<>(Arrays.asList());
    
    /*  @Method Name  :     findAll 
	 *  @ArgumentType :     no argument 
	 *  @ReturnType   :	    List of factorydata
	 *  @Objective    :     Crate Method for get all  factory Data. 
	 */
	@Override
	public List<FactoryData> findAll() {
		//return factories;
		return ifactdao.findAll();
	}
	/*  @Method Name  :     findById 
	 *  @ArgumentType :     long 
	 *  @ReturnType   :	    List of factorydata
	 *  @Objective    :     Implement Method of IFactoryOnbarding interface for get factory Data. 
	 */
	@Override
	public Optional<FactoryData> findById(long id) {
		//return factories.stream().filter(e->e.getId()==id).findFirst().get() ;
		 return ifactdao.findById(id);
	}
	/*  @Method Name  :     addFactory 
	 *  @ArgumentType :     FactoryData 
	 *  @ReturnType   :	    void
	 *  @Objective    :     Implement Method of IFactoryOnbarding interface for add factory Data. 
	 */
	@Override
	public FactoryData addFactory(FactoryData factory) {
		return ifactdao.save(factory);
		
	}

	/*  @Method Name  :     deleteFactory 
	 *  @ArgumentType :     long 
	 *  @ReturnType   :	    void
	 *  @Objective    :     Implement Method of IFactoryOnbarding interface for deleteFactory. 
	 */
    @Override
	public void deleteFactory(long id) {
		
		//factories.removeIf(e->e.getId()==id);
		ifactdao.deleteById(id);
	}

    /*  @Method Name  :     updateFactory 
	 *  @ArgumentType :     long 
	 *  @ReturnType   :	    void
	 *  @Objective    :     Implement Method of IFactoryOnbarding interface for updateFactory. 
	 */
	@Override
	public FactoryData updateFactory( FactoryData factory, long id) {
//		for(int i=0;i<factories.size();i++) {
//			FactoryData newfactory=factories.get(i);
//			if(newfactory.getId()==id) {
//				factories.set(i, factory);
//				return ;
//			}
		 return ifactdao.save(factory);
		}
	/*  @Method Name  :     findByCategoryId 
	 *  @ArgumentType :     int 
	 *  @ReturnType   :	    List
	 *  @Objective    :     Implement Method of IFactoryOnbarding interface for find factory by CategoryId. 
	 */
     @Override
	public List<FactoryData> findByCategoryId(int categoryId) {
		return ifactdao.findByCategoryId(categoryId);
	}
		
	}


