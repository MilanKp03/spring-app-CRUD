package cdom.milan.todo;

import java.util.Date;

import javax.validation.constraints.Size;

public class Todo {
	private int id;
	private String user;
	
	@Size(min=6,message="eneter at leats 6 characters")
	private String desc;
	private Date targetDate;
	private boolean itsDone;
	
	
	public Todo(int id, String user, String desc, Date targetDate, boolean itsDone) {
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.targetDate = targetDate;
		this.itsDone = itsDone;
	}
	public Todo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isItsDone() {
		return itsDone;
	}
	public void setItsDone(boolean itsDone) {
		this.itsDone = itsDone;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", user=" + user + ", desc=" + desc + ", targetDate=" + targetDate + ", itsDone="
				+ itsDone + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
