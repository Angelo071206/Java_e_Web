<html>
	<body>
		<h2><%= "Benvenuto Utente Curioso questa e' la mia prima JSP." %></h2>
		<h2><%= "Oggi e' il giorno:"%> <%= (new java.util.Date()).toLocaleString()%> </h2>
		<h2><%= "Autore:" %> <a href="author.jsp"> link </a> </h2>	
	</body>
</html>
