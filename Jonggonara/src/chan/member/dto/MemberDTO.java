package chan.member.dto;

public class MemberDTO {
	private String phonenumber;
	private String company;
	private String idnumber;
	private String name;
	

	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MemberDTO [phonenumber=" + phonenumber + ", company=" + company + ", idnumber=" + idnumber + ", name="
				+ name + "]";
}
}