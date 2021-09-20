<%-- 
    Document   : calculatorJSP
    Created on : 20-sep-2021, 10:27:45
    Author     : juand
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css" />
    </head>
</head>
<body>
    <h1>Calculadora</h1>
    <h2>*Los botones numericos no funcionan* Digite dos cifras en los espacios de la pantalla de la calculadora y presione el boton
        de una operación para calcular su valor.</h2>
    <div id="case">
        <form action="CalcServlet" method="POST">
            <div id="screen">
                <div id="result">
                    <input type="text" class="query" name="valueA"/>
                    <span>&#160 &#160 &#160</span>
                    <input type="text" class="query" name="valueB"/>
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
        </form>
    </div>
    <footer>Creado por Juan Mateo</footer>
</body>
</html>
