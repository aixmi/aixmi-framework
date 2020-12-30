package io.github.aixmi.enums;


import io.github.aixmi.common.web.dto.KVItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public enum EducationEnum implements KVEnum<Integer, String> {
	//
	PRIMARY_SCHOOL(1, "小学"),
	MIDDLE_SCHOOL(2, "中学"),
	HIGHSCHOOL(3, "高中"),
	JUNIORCOLLEGE(4, "大专"),
	UNDERGRADUATE(5, "本科"),
	MASTER(6, "硕士"),
	DOCTOR(7, "博士"),
	GRADUATESTUDENT(8, "研究生");


	private final String message;
	private int code;


	private EducationEnum(int code, String message) {
		this.code = code;
		this.message = message;
	}

	@Override
	public Integer getKey() {
		return code;
	}

	@Override
	public String getValue() {
		return message;
	}

	@Override
	public List<Integer> getKeys() {
		return Arrays.stream(values()).map(EducationEnum::getKey).collect(Collectors.toList());
	}

	@Override
	public List<String> getValues() {
		return Arrays.stream(values()).map(EducationEnum::getValue).collect(Collectors.toList());
	}

	@Override
	public KVEnum<Integer, String> getByKey(Integer key) {
		return Arrays.stream(values()).filter(o -> Objects.equals(o.getKey(), key)).findFirst().orElse(null);
	}

	@Override
	public List<KVItem<Integer, String>> getAll() {
		EducationEnum[] values = values();
		List<KVItem<Integer, String>> results = new ArrayList<>(values.length);
		for (EducationEnum value : values) {
			KVItem<Integer, String> kvItem = new KVItem();
			kvItem.setKey(value.getKey());
			kvItem.setVal(value.getValue());
			results.add(kvItem);
		}
		return results;
	}
}
