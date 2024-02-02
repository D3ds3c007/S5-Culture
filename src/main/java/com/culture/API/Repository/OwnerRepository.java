package com.culture.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.culture.API.Models.Owner;
import com.culture.API.Models.Wallet;


public interface OwnerRepository extends JpaRepository<Owner, Long> {

        List<Owner> findAll();
        Owner findByidOwner(int idOwner);
        Owner findByEmailAndPwd(String email, String pwd);
        Owner save(Wallet w);
}

