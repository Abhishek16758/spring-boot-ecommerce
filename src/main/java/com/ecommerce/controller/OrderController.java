package com.ecommerce.controller;
import com.ecommerce.entity.Order;
import com.ecommerce.entity.Role;
import com.ecommerce.entity.User;
import com.ecommerce.repository.OrderRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderRepository orderRepository;
    public OrderController(OrderRepository orderRepository) { this.orderRepository = orderRepository; }

    @GetMapping
    public ResponseEntity<List<Order>> getOrders(@AuthenticationPrincipal User user) {
        if (user.getRole() == Role.ROLE_ADMIN) return ResponseEntity.ok(orderRepository.findAll());
        return ResponseEntity.ok(orderRepository.findByUser(user));
    }
}
