package com.klef.JFSD.ENDEXAM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  @Autowired
  private OrderService orderService;

  @PostMapping("/insert")
  public String insert(@RequestBody Order order) {
    orderService.insertOrder(order);
    return "Order inserted successfully!";
  }
}
