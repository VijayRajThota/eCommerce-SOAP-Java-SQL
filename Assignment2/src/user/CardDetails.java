package user;

public class CardDetails {
    
    private String cname;
    private String cnumber;
    private String caddress;
    private String cvv;
	private int cid;
    

 public CardDetails(int cid, String cname, String cnumber, String caddress, String cvv)   
   {
	 this.cnumber = cnumber;
	 this.cname = cname;
     this.caddress = caddress;
     this.cvv = cvv;
     this.cid = cid;
   }
  
 public CardDetails() {
  }
public int getCid(){
	return cid;
}
public void setCid(int cid)
{
	this.cid = cid;
}
 public String getCname() {
      return cname;
  }
 public void setCname(String cname) {
     this.cname = cname;
  }
 public String getCnumber() {
      return cnumber;
  }
 public void setCnumber(String cnumber) {
     this.cnumber = cnumber;
  }

 public String getCaddress() {
      return caddress;
  }
 public void setCaddress(String caddress) {
     this.caddress = caddress;
  }
 public String getCvv() {
      return cvv;
  }
 public void setCvv(String cvv) {
     this.cvv = cvv;
  }
}
