package com.example.swaggerApplication.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@ToString
@NoArgsConstructor
@ApiModel(description = "detail about the book")
public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7487536042940952644L;
	@Id
	@GeneratedValue
	@ApiModelProperty(notes = "the unique id of the book")
	private int bookId;
	@ApiModelProperty(notes = "name of the book")
	private String bookName;
	@ApiModelProperty(notes = "price of the book")
	private double price;
}
