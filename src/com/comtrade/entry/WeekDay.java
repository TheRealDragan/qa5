package com.comtrade.entry;

public enum WeekDay {	
	MONDAY(1, "Monday"),
	TUESDAY(2, "Monday"),
	WEDNESDAY(3, "Monday"),
	THURSDAY(4, "Monday"),
	FRIDAY(5, "Monday"),
	SATURDAY(6, "Monday"),
	SUNDAY(7, "Monday");
	
	private int ordinalNumber;
	private String nonCapitalizedName;
	
	private WeekDay(int ordinalNumber, String nonCapitalizedName)
	{
		this.ordinalNumber = ordinalNumber;
		this.nonCapitalizedName = nonCapitalizedName;
	}
	
	public String getNonCapitalizedName() {
		return nonCapitalizedName;
	}
	
	

}
