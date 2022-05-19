package com.sebone.factoryonboardingdumy.service;
import java.util.List;
import java.util.Optional;

import com.sebone.factoryonboardingdumy.dto.FactoryData;
/*
 * @Interface     :   IFactoryOnbarding  
 * @UseMethods    :   findAll,findById,addFactory,deleteFactory,updateFactory,findByCategoryId 
 * @ClassSpecifier:    public
 * @Objective     :
 * Interface class that has the following methods.
 **/
public interface IFactoryonbarding {
		/*  @Method Name  :     findAll 
		 *  @ArgumentType :     no argument 
		 *  @ReturnType   :	    List of factorydata
		 */
	public	List<FactoryData> findAll();
	/*  @Method Name  :     findById 
	 *  @ArgumentType :     long 
	 *  @ReturnType   :	    List of factorydata
	 */
	public Optional<FactoryData> findById(long id);
	/*  @Method Name  :     addFactory 
	 *  @ArgumentType :     long 
	 *  @ReturnType   :	    List of factorydata
	 */
	public FactoryData addFactory(FactoryData factory);
	/*  @Method Name  :     deleteFactory 
	 *  @ArgumentType :     long 
	 *  @ReturnType   :	    void
	 */
	public void deleteFactory(long id);
	/*  @Method Name  :     updateFactory 
	 *  @ArgumentType :     FactoryData,long 
	 *  @ReturnType   :	    void
	 */
	public FactoryData updateFactory(FactoryData factory,long id);
	/*  @Method Name  :     findByCategoryId 
	 *  @ArgumentType :     int 
	 *  @ReturnType   :	    FactooryData
	 */
	public List<FactoryData> findByCategoryId(int categoryId);

}
