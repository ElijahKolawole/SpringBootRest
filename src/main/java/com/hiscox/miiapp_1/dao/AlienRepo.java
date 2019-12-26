package com.hiscox.miiapp_1.dao;

import com.hiscox.miiapp_1.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

    List<Alien> findByLang(String lang);
   // List<Alien> findByAidGreaterThan(int aid);
    @Query("from Alien where lang=?1 order by aName asc ")
    List<Alien> findByLangSorted(String aName);
}
