package com.zamuraev.productservice.command;

import com.zamuraev.productservice.core.data.ProductLookupEntity;
import com.zamuraev.productservice.core.data.ProductLookupRepository;
import com.zamuraev.productservice.core.events.ProductCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("product-group")
@RequiredArgsConstructor
public class ProductLookupEventsHandler {

    private final ProductLookupRepository productLookupRepository;

    @EventHandler
    public void on(ProductCreatedEvent event) {
        ProductLookupEntity productLookupEntity = new ProductLookupEntity(event.getProductId(),
                event.getTitle());
        productLookupRepository.save(productLookupEntity);
    }


}
