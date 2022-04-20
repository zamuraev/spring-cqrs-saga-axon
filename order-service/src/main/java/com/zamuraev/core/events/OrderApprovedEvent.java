package com.zamuraev.core.events;

import com.zamuraev.core.model.OrderStatus;
import lombok.Value;

@Value
public class OrderApprovedEvent {

	private final String orderId;
	private final OrderStatus orderStatus = OrderStatus.APPROVED;
	
}
