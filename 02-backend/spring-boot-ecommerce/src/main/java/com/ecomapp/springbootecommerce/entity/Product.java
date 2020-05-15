package com.ecomapp.springbootecommerce.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private ProductCategory category;

	@NonNull
	@Column(name = "sku")
	private String sku;
	@NonNull
	@Column(name = "name")
	private String name;
	@NonNull
	@Column(name = "description")
	private String description;
	@NonNull
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	@NonNull
	@Column(name = "image_url")
	private String imageUrl;
	@NonNull
	@Column(name = "active")
	private boolean active;
	@NonNull
	@Column(name = "units_in_stock")
	private int unitsInStock;
	@NonNull
	@Column(name = "date_created")
	@CreationTimestamp
	private Date dateCreated;
	@NonNull
	@Column(name = "last_updated")
	@UpdateTimestamp
	private Date lastUpdated;
	
}
