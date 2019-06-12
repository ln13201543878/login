package entity;

public class User {
	private Integer uid;
	private String ucount;
	private String upwd;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUcount() {
		return ucount;
	}

	public void setUcount(String ucount) {
		this.ucount = ucount;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public User(Integer uid, String ucount, String upwd) {
		super();
		this.uid = uid;
		this.ucount = ucount;
		this.upwd = upwd;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", ucount=" + ucount + ", upwd=" + upwd + "]";
	}

}
