package com.zamuraev.productservice.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="productlookup")
@NoArgsConstructor
@AllArgsConstructor
public class ProductLookupEntity implements Serializable {

    private static final long serialVersionUID = -5692756860568442326L;
    @Id
    private String productId;
    @Column(unique = true)
    private String title;


}
