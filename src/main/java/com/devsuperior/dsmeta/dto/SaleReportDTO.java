package com.devsuperior.dsmeta.dto;

import java.time.LocalDate;

public class SaleReportDTO {
	
	private Long id;
	private LocalDate date;
	private Double amount;
	private String name;
	
	public SaleReportDTO() {
	}

	public SaleReportDTO(Long id, LocalDate date, Double amount, String name) {
		this.id = id;
		this.date = date;
		this.amount = amount;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}
}