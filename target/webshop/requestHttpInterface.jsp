<%--
  Created by IntelliJ IDEA.
  User: Jarby
  Date: 4/13/2017
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.text.SimpleDateFormat"  contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<style>
  .table-c {
    position:relative;
    margin-top:80px;
    text-align:center;
  }
  .table-c table{text-align:center; border-right:1px solid #080808;border-bottom:1px solid #080808 ;margin:0 auto;}
  .table-c table td{text-align: left ; border-left:1px solid #080808;border-top:1px solid #080808;padding:2px;}

  select {
    width:40%;
  }
  input.setInput {
    width:40%;
  }
  .odd {
    background-color:#FCFCF2;
  }
  .eve {
    background-color:#EDFAED;
  }
  .tabHead {
    padding-button:-10em;
  }
  /*
  css注释：设置table背景为红色，td背景为白色 */
</style>
<html>
<head>
  <title>单笔代付接口调用测试示例 </title>
</head>
<body style="text-align: center;">
<%
  String dealTime="";
  SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
  dealTime=format.format(new Date());
%>
<form action="http://localhost:9887/pay/singlePay.do" method="post">
  <div class="table-c">
    <h2 align="center" class="tabHead" >单笔代付接口调用测试示例 </h2>
    <table  border="0" cellspacing="1" cellpadding="0" >
      <tr class="odd">
        <td>客户号</td>
        <td>
          <input type="text" name="batchBizid" class="setInput"  readonly="false"  value="100000000001985">
        </td>
      </tr>
      <tr class="eve">
        <td>字符编码</td>
        <td>
          <select  name="parameter">
            <option value ="UTF-8">UTF-8</option>
            <option value ="GBK">GBK</option>
          </select>
        </td>
      </tr>
      <tr class="odd">
        <td>交易日期</td>
        <td>
          <input type="text" name="dealTime" class="setInput" value="<%=dealTime%>" >
        </td>
      </tr>
      <tr class="odd">
        <td>商户批次号</td>
        <td>
          <input type="text" name="merTxSerNo" class="setInput" value="12345" >
        </td>
      </tr>
      <tr class="odd">
        <td>交易数量</td>
        <td>
          <input type="text" name="batchCount"   class="setInput" value="1" >
        </td>
      </tr>
      <tr class="odd">
        <td>交易金额</td>
        <td>
          <input type="text" name="batchAmount" class="setInput" value="3.00" >
        </td>
      </tr>
      <tr class="eve">
        <td>明细报文</td>
        <td>
          <textarea rows="5" cols="70" required="true"  name="message">123456</textarea>
        </td>
      </tr>
      <tr class="odd">
        <td colspan="2" style="padding-left:19%;">
          <input type="reset" value="清空" >
          <input type="submit" value="提交">
        </td>
      </tr>
    </table>
  </div>
</form>
</body>
</html>

