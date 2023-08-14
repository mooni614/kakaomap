package com.kh.spring.kakao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Setter
@Getter
public class MapInfo {

	
	private String name;
	private String address;
	private double x; // 위도
	private double y; // 경도
}
