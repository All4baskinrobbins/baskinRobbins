package com.example.baskinrobbins;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
	
	private String user_id;
	private String user_pw;
	private String name;
	private int birth;
	private String email;
	private String phone_number;

	
}