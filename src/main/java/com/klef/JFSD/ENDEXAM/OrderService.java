package com.klef.JFSD.ENDEXAM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    public void insertOrder(Order order) {
        orderRepo.save(order);
    }
}
