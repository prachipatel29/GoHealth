package com.uwindsor.gohealth.repository;

import com.uwindsor.gohealth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    User findByMobileNo(long mobileNo);
}
