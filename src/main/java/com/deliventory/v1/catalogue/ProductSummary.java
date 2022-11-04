package com.deliventory.v1.catalogue;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@JsonInclude(JsonInclude.Include.NON_NULL)
@Document(collection = "product_summary")
public class ProductSummary {
    @Id
    private Long id;
    private String itemId;
    private String name;
    private String description;
    private String type;
    private Status status;
    private String gtin;
    private String createdOn;
    private String updatedOn;
}
