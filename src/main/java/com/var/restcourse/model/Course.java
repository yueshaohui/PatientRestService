package com.var.restcourse.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="course")
public class Course {
	long id;
	String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaughtBy() {
		return taughtBy;
	}

	public void setTaughtBy(String taughtBy) {
		this.taughtBy = taughtBy;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	String taughtBy;
	String price;
	int rate;

}
