package com.zamuraev.commands;

import com.zamuraev.model.PaymentDetails;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProcessPaymentCommand {

	@TargetAggregateIdentifier
	private final String paymentId;
	private final String orderId;
	private final PaymentDetails paymentDetails;
	
}
