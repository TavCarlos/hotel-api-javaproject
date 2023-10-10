package com.project.hotelAPI.web.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@Getter
@Setter
public class PageableDTO {

	private List<Object> content = new ArrayList<>();
	private boolean frist;
	private boolean last;
	@JsonProperty("page")
	private int number;
	private int size;
	@JsonProperty("pageElements")
	private int numberOfElements;
	private int totalPages;
	private int totalElements;
}