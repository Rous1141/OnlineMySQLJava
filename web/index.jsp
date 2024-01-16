<%-- 
    Document   : index
    Created on : Jan 8, 2024, 1:11:40 PM
    Author     : hendrix
--%>

<%@page import="DAO.PeopleDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DTO.People"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Testing MySQL Connectivity With Java</h1>
        <%
            ArrayList<People> result = new ArrayList<>();
            PeopleDAO peopledao = new PeopleDAO();
            result = peopledao.getAllPeople();
            if (result != null) {
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Job</th>
                </tr>
            </thead>
            <%
                for (People pep : result) {
            %>
            <tr>
                <td>
                    <input type="text" name="ProductID" value="<%= pep.getID()%>" readonly=""/>
                </td>
                <td>
                    <input type="text" name="ProductName" value="<%= pep.getName()%>" readonly=""/>

                </td>
                <td>
                    <input type="text" name="Description" value="<%= pep.getAge()%>" readonly=""/>
                </td>
                <td>
                    <input type="text" name="Price" value="<%= pep.getJob()%>" readonly=""/>
                </td>
            </tr>
            <%
                }
            %>
            <h3>If you see this line, We have successfully connect to MySQL Database and Can Query It. Now try it on C#</h3>       
            <%
                }
            %>

        </table>
    </body>
</html>
