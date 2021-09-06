/**
 * 
 */
package com.rajesh.learner.repository;

import org.springframework.data.repository.CrudRepository;

import com.rajesh.learner.model.UserRecord;

/**
 * @author rkumar4
 *
 */
public interface UserRepository extends CrudRepository<UserRecord, String>{

}
