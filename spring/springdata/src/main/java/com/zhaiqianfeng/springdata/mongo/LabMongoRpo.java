package com.zhaiqianfeng.springdata.mongo;

import com.zhaiqianfeng.springdata.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

/**
 * @author Chris.zhai
 * @since Oct 14,2017
 */
@Component
public interface LabMongoRpo extends MongoRepository<User,Integer> {
}
