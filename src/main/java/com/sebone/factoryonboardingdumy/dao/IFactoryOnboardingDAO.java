package com.sebone.factoryonboardingdumy.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sebone.factoryonboardingdumy.dto.FactoryData;
/*
 * @Repository Annotation is a specialization of @Component annotation 
 * which is used to indicate that the class provides the mechanism for storage,
 *  retrieval, update, delete and search operation on objects.
 */
@Repository
/*
 * @Interface     :    IFactoryOnboardingDao(Repository)
 * @UseMethods    :    findByCategoryId
 * @ClassSpecifier:    public
 * @Extends		  :    MongoRepository,MongoRepository provides all the necessary methods which help to create a CRUD application and
 * 					   it also supports the custom derived query methods
 * @Objective     :    The Data Access Object (DAO) support in Spring is aimed at making it easy to work with data access technologies 
 *                     like JDBC, Hibernate, JPA or JDO in a consistent way.
 */
public interface IFactoryOnboardingDAO extends MongoRepository<FactoryData, Long> {
	 
	public List<FactoryData> findByCategoryId(int categoryId);
}
