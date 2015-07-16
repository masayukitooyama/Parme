<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>本の検索</title>
</head>
<body>
    <div class="header">
      <div class="logo">Liberty & Library</div>
    </div>
    <div class="leftnav">
      <ul>
        <li> <a href="../">トップ画面</a></li>
        <li> <a href="">本の検索</a></li>
        <li> <a href="../mypage">マイページ</a></li>
      </ul>
    </div>
    <div class="body">
      <div class="content">
        <p>書籍を検索します</p>
        <input name="search"/>
        <div class="listTable">
          <table border="1">
            <thead>
              <tr>
                <th>表紙</th>
                <th>題名</th>
                <th>貸出状況</th>
              </tr>
            </thead>
            <tbody></tbody>
          </table>
        </div>
      </div>
    </div>
    <div class="footer">
      <div class="rights">
        <p>All Rights Reserved by Seattle Consulting Team15.</p>
      </div>
    </div>
  </body>
</html>