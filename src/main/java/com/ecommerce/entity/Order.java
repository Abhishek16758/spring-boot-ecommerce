package com.ecommerce.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private BigDecimal totalAmount;
    private String status;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Order() {}
    public Order(User user, BigDecimal totalAmount, String status) {
        this.user = user; this.totalAmount = totalAmount; this.status = status;
    }
    public Long getId() { return id; }
    public User getUser() { return user; }
    public BigDecimal getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setId(Long id) { this.id = id; }
    public void setUser(User user) { this.user = user; }
    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }
    public void setStatus(String status) { this.status = status; }
}
