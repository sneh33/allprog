package USbanks;

public class Complaint_data {
	 String daterec;
	 String product;
	 String subproduct;
	 String issue;
	 String subissue;
	 String company;
	 String state;
	 String zip;
	 String submitted;
	 String datesent;
	 String companyrestocust;
	 String timelyresponse;
	 String custdisputed;
	 String compid;
	Complaint_data(){
		
	}
	Complaint_data(String daterec,String product,String subproduct,String issue,String subissue,String company,String state,String zip,String submitted,String datesent,String companyrestocust,String timelyresponse,String custdisputed,String compid){
		this.daterec=daterec;
		this.product=product;
		this.subproduct=subproduct;
		this.issue=issue;
		this.subissue=subissue;
		this.company=company;
		this.state=state;
		this.zip=zip;
		this.submitted=submitted;
		this.datesent=datesent;
		this.companyrestocust=companyrestocust;
		this.timelyresponse=timelyresponse;
		this.custdisputed=custdisputed;
		this.compid=compid;
	}
	public String getDaterec() {
		return daterec;
	}
	public void setDaterec(String daterec) {
		this.daterec = daterec;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getSubproduct() {
		return subproduct;
	}
	public void setSubproduct(String subproduct) {
		this.subproduct = subproduct;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getSubissue() {
		return subissue;
	}
	public void setSubissue(String subissue) {
		this.subissue = subissue;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getSubmitted() {
		return submitted;
	}
	public void setSubmitted(String submitted) {
		this.submitted = submitted;
	}
	public String getDatesent() {
		return datesent;
	}
	public void setDatesent(String datesent) {
		this.datesent = datesent;
	}
	public String getCompanyrestocust() {
		return companyrestocust;
	}
	public void setCompanyrestocust(String companyrestocust) {
		this.companyrestocust = companyrestocust;
	}
	public String getTimelyresponse() {
		return timelyresponse;
	}
	public void setTimelyresponse(String timelyresponse) {
		this.timelyresponse = timelyresponse;
	}
	public String getCustdisputed() {
		return custdisputed;
	}
	public void setCustdisputed(String custdisputed) {
		this.custdisputed = custdisputed;
	}
	public String getCompid() {
		return compid;
	}
	public void setCompid(String compid) {
		this.compid = compid;
	}
	public String toString() {
		return daterec+"\t"+product+"\t"+subproduct+"\t"+issue+"\t"+subissue+"\t"+company+"\t"+state+"\t"+zip+"\t"+submitted+"\t"+datesent+"\t"+companyrestocust+"\t"+timelyresponse+"\t"+custdisputed+"\t"+compid;
	}
	
	
}
