<%@ page import="java.sql.*,java.io.*,java.util.*" %>
<%
  int id =  Integer.parseInt(request.getParameter("imgid"));
  try{     
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/itmd523","root","jack1991");     
    Statement st=con.createStatement();
    String strQuery = "select main_pic from news_pics where pic_id="+id;
    ResultSet rs = st.executeQuery(strQuery);

    String imgLen="";
   while(rs.next()){
      imgLen = rs.getString(1);
       } 
    rs = st.executeQuery(strQuery);
    if(rs.next()){
      int len = imgLen.length();
      byte [] rb = new byte[len];
      response.setContentType("image/png");
      InputStream readImg = rs.getBinaryStream(1);
      //InputStream readImg1 = rs.getBinaryStream(2);
      int index=readImg.read(rb, 0, len); 
      st.close();
      response.reset();
      response.getOutputStream().write(rb,0,len);
      response.getOutputStream().flush();
     
     
     
     
    }
  }
  catch (Exception e){
    e.printStackTrace();
  }
%>