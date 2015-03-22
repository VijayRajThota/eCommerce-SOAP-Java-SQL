package user;

import java.util.Date;

public class Confirmation {
 private int confno;
 private Date confdate;
 private Date ddate;
 
 public Confirmation(int confno)
 {
	 this.confno = confno;
	 
 }
 
 public Confirmation()
 {
	 
 }
 public int getConfno()
 {
	 return confno;
 }
 public void setConfno(int confno)
 {
	 this.confno = confno;
 }
 public Date getConfdate()
 {
	 return confdate;
 }
 public void setConfdate(Date confdate)
 {
	 this.confdate = confdate;
 }
 public Date getDdate()
 {
	 return ddate;
 }
 public void setDdate(Date ddate)
 {
	 this.ddate = ddate;
 }
}
