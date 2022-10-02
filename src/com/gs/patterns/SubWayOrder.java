package com.gs.patterns;

public class SubWayOrder {

	private final String bread;
	private final String dressing;
	private final String toppins;
	private final String meat;

	private SubWayOrder(Builder builder) {
		this.bread = builder.bread;
		this.dressing = builder.dressing;
		this.toppins = builder.toppins;
		this.meat = builder.meat;
	}

	public String getBread() {
		return bread;
	}

	public String getDressing() {
		return dressing;
	}

	public String getToppins() {
		return toppins;
	}

	public String getMeat() {
		return meat;
	}

	public static class Builder {
		private String bread;
		private String dressing;
		private String toppins;
		private String meat;

		public Builder() {
		}

		public SubWayOrder build() {
			return new SubWayOrder(this);
		}

		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder dressing(String dressing) {
			this.dressing = dressing;
			return this;
		}

		public Builder toppins(String toppins) {
			this.toppins = toppins;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}
	}
}
