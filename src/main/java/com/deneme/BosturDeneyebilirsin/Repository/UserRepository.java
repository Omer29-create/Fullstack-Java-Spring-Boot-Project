package com.deneme.BosturDeneyebilirsin.Repository;

import com.deneme.BosturDeneyebilirsin.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getUserById(Long id);

    User updateUserById(User user);
  
    User deleteById(Long id);
}
