package java_collections;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private String stream;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", stream=" + stream + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, stream);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(stream, other.stream);
	}
	
	
}
