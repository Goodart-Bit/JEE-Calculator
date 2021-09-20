<%-- 
    Document   : newjsp
    Created on : 20-sep-2021, 11:44:08
    Author     : juand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>Calculator</h1>
    <div id="case">
            <div id="screen">
                <div id="result">
                    <jsp:useBean id="resultbean" scope="session" class="calc_Logic.calculator"/>
                    <jsp:getProperty name="resultbean" property="result" />
                </div>
            </div>
            <div id="keyboard">
                <div id="numbers">
                    <input type="button" class="calcButton" value="7">
                    <input type="button" class="calcButton" value="8">
                    <input type="button" class="calcButton" value="9">
                    <input type="button" class="calcButton" value="4">
                    <input type="button" class="calcButton" value="5">
                    <input type="button" class="calcButton" value="6">
                    <input type="button" class="calcButton" value="1">
                    <input type="button" class="calcButton" value="2">
                    <input type="button" class="calcButton" value="3">
                </div>
                <div id="operands">
                    <input type="submit" class="calcButton" name="op" value="+">
                    <input type="submit" class="calcButton" name="op" value="-">
                    <input type="submit" class="calcButton" name="op" value="*">
                    <input type="submit" class="calcButton" name="op" value="/">
                    <input type="submit" class="calcButton" name="op" value="%">
                    <input type="submit" class="calcButton" name="op" value="^">
                </div>
            </div>
    </div>
    <footer>Created by Juan Mateo</footer>
</body>
</html>
