package com.project.hotelAPI.web.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponseDTO {

	private Long id;
	private String name;
	private String cpf;
}
