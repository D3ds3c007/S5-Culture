package com.culture.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.culture.API.Models.Field;
import com.culture.API.Models.Owner;
import com.culture.API.Models.Plot;



public interface FieldRepository extends JpaRepository<Field, Long> {
         
        Field save(Field field);
        List<Field> findByOwner(Owner o);
        List<Field> findAll();
        Field findByPlots(Plot plot);
        Field findByHashcode(String hashcode);

}

