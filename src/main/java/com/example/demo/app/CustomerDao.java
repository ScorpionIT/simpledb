package com.example.demo.app;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerDao {
    private final NamedParameterJdbcTemplate template;

    public CustomerDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.template = namedParameterJdbcTemplate;
    }

    public Long createCustomer(Customer customer){
        String sql = "INSERT INTO CUSTOMER (fio, phone, address) VALUES (:fio, :phone, :address) RETURNING ID";
        Map<String, Object> map = new HashMap<>();
        map.put("fio",customer.getFio());
        map.put("phone",customer.getPhone());
        map.put("address",customer.getAddress());
        return template.queryForObject(sql,map,Long.class);
    }
}
