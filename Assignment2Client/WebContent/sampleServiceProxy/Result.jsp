<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceProxyid" scope="session" class="connection.ServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        connection.Service getService10mtemp = sampleServiceProxyid.getService();
if(getService10mtemp == null){
%>
<%=getService10mtemp %>
<%
}else{
        if(getService10mtemp!= null){
        String tempreturnp11 = getService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String brand_1id=  request.getParameter("brand20");
            java.lang.String brand_1idTemp = null;
        if(!brand_1id.equals("")){
         brand_1idTemp  = brand_1id;
        }
        user.Quantity amount13mtemp = sampleServiceProxyid.amount(brand_1idTemp);
if(amount13mtemp == null){
%>
<%=amount13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">count:</TD>
<TD>
<%
if(amount13mtemp != null){
java.lang.String typecount16 = amount13mtemp.getCount();
        String tempResultcount16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecount16));
        %>
        <%= tempResultcount16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">brand:</TD>
<TD>
<%
if(amount13mtemp != null){
java.lang.String typebrand18 = amount13mtemp.getBrand();
        String tempResultbrand18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebrand18));
        %>
        <%= tempResultbrand18 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 22:
        gotMethod = true;
        String confno_2id=  request.getParameter("confno25");
        int confno_2idTemp  = Integer.parseInt(confno_2id);
        int confirm22mtemp = sampleServiceProxyid.confirm(confno_2idTemp);
        String tempResultreturnp23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(confirm22mtemp));
        %>
        <%= tempResultreturnp23 %>
        <%
break;
case 27:
        gotMethod = true;
        String cid_3id=  request.getParameter("cid30");
        int cid_3idTemp  = Integer.parseInt(cid_3id);
        String cname_4id=  request.getParameter("cname32");
            java.lang.String cname_4idTemp = null;
        if(!cname_4id.equals("")){
         cname_4idTemp  = cname_4id;
        }
        String cnumber_5id=  request.getParameter("cnumber34");
            java.lang.String cnumber_5idTemp = null;
        if(!cnumber_5id.equals("")){
         cnumber_5idTemp  = cnumber_5id;
        }
        String caddress_6id=  request.getParameter("caddress36");
            java.lang.String caddress_6idTemp = null;
        if(!caddress_6id.equals("")){
         caddress_6idTemp  = caddress_6id;
        }
        String cvv_7id=  request.getParameter("cvv38");
            java.lang.String cvv_7idTemp = null;
        if(!cvv_7id.equals("")){
         cvv_7idTemp  = cvv_7id;
        }
        java.lang.String entry27mtemp = sampleServiceProxyid.entry(cid_3idTemp,cname_4idTemp,cnumber_5idTemp,caddress_6idTemp,cvv_7idTemp);
if(entry27mtemp == null){
%>
<%=entry27mtemp %>
<%
}else{
        String tempResultreturnp28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(entry27mtemp));
        %>
        <%= tempResultreturnp28 %>
        <%
}
break;
case 40:
        gotMethod = true;
        String brand_8id=  request.getParameter("brand47");
            java.lang.String brand_8idTemp = null;
        if(!brand_8id.equals("")){
         brand_8idTemp  = brand_8id;
        }
        String count_9id=  request.getParameter("count49");
            java.lang.String count_9idTemp = null;
        if(!count_9id.equals("")){
         count_9idTemp  = count_9id;
        }
        user.Quantity increment40mtemp = sampleServiceProxyid.increment(brand_8idTemp,count_9idTemp);
if(increment40mtemp == null){
%>
<%=increment40mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">count:</TD>
<TD>
<%
if(increment40mtemp != null){
java.lang.String typecount43 = increment40mtemp.getCount();
        String tempResultcount43 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecount43));
        %>
        <%= tempResultcount43 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">brand:</TD>
<TD>
<%
if(increment40mtemp != null){
java.lang.String typebrand45 = increment40mtemp.getBrand();
        String tempResultbrand45 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typebrand45));
        %>
        <%= tempResultbrand45 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 51:
        gotMethod = true;
        String membershipId_10id=  request.getParameter("membershipId54");
        int membershipId_10idTemp  = Integer.parseInt(membershipId_10id);
        String firstname_11id=  request.getParameter("firstname56");
            java.lang.String firstname_11idTemp = null;
        if(!firstname_11id.equals("")){
         firstname_11idTemp  = firstname_11id;
        }
        String lastname_12id=  request.getParameter("lastname58");
            java.lang.String lastname_12idTemp = null;
        if(!lastname_12id.equals("")){
         lastname_12idTemp  = lastname_12id;
        }
        String emailId_13id=  request.getParameter("emailId60");
            java.lang.String emailId_13idTemp = null;
        if(!emailId_13id.equals("")){
         emailId_13idTemp  = emailId_13id;
        }
        String username_14id=  request.getParameter("username62");
            java.lang.String username_14idTemp = null;
        if(!username_14id.equals("")){
         username_14idTemp  = username_14id;
        }
        String password_15id=  request.getParameter("password64");
            java.lang.String password_15idTemp = null;
        if(!password_15id.equals("")){
         password_15idTemp  = password_15id;
        }
        java.lang.String signUp51mtemp = sampleServiceProxyid.signUp(membershipId_10idTemp,firstname_11idTemp,lastname_12idTemp,emailId_13idTemp,username_14idTemp,password_15idTemp);
if(signUp51mtemp == null){
%>
<%=signUp51mtemp %>
<%
}else{
        String tempResultreturnp52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signUp51mtemp));
        %>
        <%= tempResultreturnp52 %>
        <%
}
break;
case 66:
        gotMethod = true;
        String username_16id=  request.getParameter("username81");
            java.lang.String username_16idTemp = null;
        if(!username_16id.equals("")){
         username_16idTemp  = username_16id;
        }
        String password_17id=  request.getParameter("password83");
            java.lang.String password_17idTemp = null;
        if(!password_17id.equals("")){
         password_17idTemp  = password_17id;
        }
        user.User signin66mtemp = sampleServiceProxyid.signin(username_16idTemp,password_17idTemp);
if(signin66mtemp == null){
%>
<%=signin66mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">password:</TD>
<TD>
<%
if(signin66mtemp != null){
java.lang.String typepassword69 = signin66mtemp.getPassword();
        String tempResultpassword69 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typepassword69));
        %>
        <%= tempResultpassword69 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">lastName:</TD>
<TD>
<%
if(signin66mtemp != null){
java.lang.String typelastName71 = signin66mtemp.getLastName();
        String tempResultlastName71 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typelastName71));
        %>
        <%= tempResultlastName71 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">emailId:</TD>
<TD>
<%
if(signin66mtemp != null){
java.lang.String typeemailId73 = signin66mtemp.getEmailId();
        String tempResultemailId73 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemailId73));
        %>
        <%= tempResultemailId73 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">membershipId:</TD>
<TD>
<%
if(signin66mtemp != null){
%>
<%=signin66mtemp.getMembershipId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">firstName:</TD>
<TD>
<%
if(signin66mtemp != null){
java.lang.String typefirstName77 = signin66mtemp.getFirstName();
        String tempResultfirstName77 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefirstName77));
        %>
        <%= tempResultfirstName77 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">username:</TD>
<TD>
<%
if(signin66mtemp != null){
java.lang.String typeusername79 = signin66mtemp.getUsername();
        String tempResultusername79 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeusername79));
        %>
        <%= tempResultusername79 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 85:
        gotMethod = true;
        String confno_18id=  request.getParameter("confno94");
        int confno_18idTemp  = Integer.parseInt(confno_18id);
        user.Confirmation delivery85mtemp = sampleServiceProxyid.delivery(confno_18idTemp);
if(delivery85mtemp == null){
%>
<%=delivery85mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">confdate:</TD>
<TD>
<%
if(delivery85mtemp != null){
java.util.Calendar typeconfdate88 = delivery85mtemp.getConfdate();
        java.text.DateFormat dateFormatconfdate88 = java.text.DateFormat.getDateInstance();
        java.util.Date dateconfdate88 = typeconfdate88.getTime();
        String tempResultconfdate88 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatconfdate88.format(dateconfdate88));
        %>
        <%= tempResultconfdate88 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">confno:</TD>
<TD>
<%
if(delivery85mtemp != null){
%>
<%=delivery85mtemp.getConfno()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ddate:</TD>
<TD>
<%
if(delivery85mtemp != null){
java.util.Calendar typeddate92 = delivery85mtemp.getDdate();
        java.text.DateFormat dateFormatddate92 = java.text.DateFormat.getDateInstance();
        java.util.Date dateddate92 = typeddate92.getTime();
        String tempResultddate92 = org.eclipse.jst.ws.util.JspUtils.markup(dateFormatddate92.format(dateddate92));
        %>
        <%= tempResultddate92 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>