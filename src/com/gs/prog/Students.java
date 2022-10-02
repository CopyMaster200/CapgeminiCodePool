package com.gs.prog;

public class Students {

	private Integer id;
	private String name;
	private Integer marks;

	public Students() {
	}

	public Students(Integer id, String name, Integer marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Integer getMarks() {
		return this.marks;
	}

	public String toString() {
		return "{" + this.id + "," + this.name + "," + this.marks + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + (id == null ? 0 : id);
		result = result * prime + (name == null ? 0 : name.hashCode());
		result = result * prime + (marks == null ? 0 : marks);
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (id == null) {
			if (other.getId() != null)
				return false;
		} else if (!id.equals(other.getId())) {
			return false;
		}
		if (name == null) {
			if (other.getName() != null)
				return false;
		} else if (!name.equals(other.getName())) {
			return false;
		}
		if (marks == null) {
			if (other.getMarks() != null)
				return false;
		} else if (!marks.equals(other.getMarks())) {
			return false;
		}
		return true;
	}
}
