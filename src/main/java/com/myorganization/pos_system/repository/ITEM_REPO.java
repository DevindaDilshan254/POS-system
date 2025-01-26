package com.myorganization.pos_system.repository;

import com.myorganization.pos_system.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface ITEM_REPO extends JpaRepository<Item,Integer> {
    List<Item> getAllByItemNameAndActiveStatusEquals(String itemName,boolean status);
    Page<Item> getAllItemsByActiveStatusEquals(boolean activeStatus, Pageable pageable);//Normal method as other but pass a pageable object
    int countAllByActiveStatusEquals(boolean activeStatus);
}
