package com.ecommerce.app.mapper;

import com.ecommerce.app.dto.OrderResponse;
import com.ecommerce.app.model.Order;

public class OrderMapper {
	
	public static OrderResponse toResponse(Order order) {
        return new OrderResponse(
                order.getOrderId(),
                order.getTotalAmount(),
                order.getStatus().name()
        );

}
}
