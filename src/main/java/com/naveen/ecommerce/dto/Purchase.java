package com.naveen.ecommerce.dto;

import com.naveen.ecommerce.Entity.Address;
import com.naveen.ecommerce.Entity.Customer;
import com.naveen.ecommerce.Entity.Order;
import com.naveen.ecommerce.Entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}