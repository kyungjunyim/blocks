package com.jun.blocks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BlocksFile {
	// 파일 아이디
	private String id;
	// 파일 이름
	private String name;
	// 확장자
	private String extension;
	// 파일 크기
	private String size;
	// 작성 날짜
	private String createdDate;
	// 수정 날짜
	private String modifiedDate;
	// 소유자
	private String owner;
	// 파일 실제 경로
	private String path;
	// 드라이브 종류
	private String driveLocation;
	
	public String getFullName() {
		return name + "." + extension;
	}
}
