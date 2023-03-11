<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title></title>
      <link rel="stylesheet" href="resources/style.css">
  </head>
  <body id="testi">
    
    <h1 class="tj">WELCOME TO THE TESTIMONAL SECTION</h1>
    <div class="right-col ">

<p>Click Here To Listen</p>
<img id="play" src="images/icon.jpg" alt="">



  </div>
  <audio  id="nMusic"controls>
  <source src="audio/music.mp3" type="audio/mpeg">
  </audio>

    <script>
var mySong= document.getElementById("n-music");
var icon= document.getElementById("play");
play.onclick = function(){
nMusic.play();
}



</script>

      <table>
      <tr>
     
        <td>  <h1 class="head1">"Great prices, better than competitors, relatively easy website to navigate."</h1>
          <p class="name">-Lalit Kumar</p></td>
             </tr>
      </table>

      <table>
         <tr>
      
        <td>  <h1 class="head2">"Cheaper than other sites"</h1>
          <p class="name">-Aman Rao</p></td>
             </tr>
      </table>

      <table>
         <tr>
      
        <td>  <h1 class="head1">"I was impressed with the ease I experienced when I ordered."</h1>
          <p class="name">-Anitha Puri</p></td>
             </tr>
      </table>

      <table>
         <tr>
       
        <td>  <h1 class="head3">"My experiences with Magic Paws has always been 5 star!"</h1>
          <p class="name1">-Naina Chawla</p></td>
             </tr>
      </table>

      <table>
         <tr>
       
        <td>  <h1 class="head1">Works great for my aging dogs arthritis. I recommend it for all aging pets.</h1>
          <p class="name">-Nandani Garg</p></td>
             </tr>
      </table>
      
  <c:forEach var="Testimonal" items="${Testi}">
			<table>
			<tr>
			
				<td><h1 class="head1">${Testimonal.review }</h1></td>
				<td> <p class="name">${Testimonal.t_name }</p></td>
				
				</tr>
			</table>	
			
		</c:forEach>
      
   
      <form:form action="insert" method="post" modelAttribute="Testimonal">
	
	<label for="review">Review(*)</label>
	<form:input type="Text" path="review" /> 
	<form:errors path="review" cssClass="error"/><br><br> 
	
	<label for="t_name">Name(*)</label>
	<form:input type="text" path="t_name" /> 
	<form:errors path="t_name" cssClass="error"/><br><br>
	<input type="submit" value="submit" />
	</form:form><br><br> 
	
  </body>
</html>
    