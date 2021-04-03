package com.muratcelik.repository;

import com.muratcelik.model.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Murat Çelik Pegamis
 */
@Repository
public interface UserRepository extends CouchbaseRepository<User, String> {
}
