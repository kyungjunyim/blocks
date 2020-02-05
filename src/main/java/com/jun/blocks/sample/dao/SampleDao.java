package com.jun.blocks.sample.dao;

import com.jun.blocks.sample.Sample;

public interface SampleDao {
	public int add(Sample sample);
	public Sample get(int sequence);
	public int delete(int sequence);
	public int deleteAll();
}
