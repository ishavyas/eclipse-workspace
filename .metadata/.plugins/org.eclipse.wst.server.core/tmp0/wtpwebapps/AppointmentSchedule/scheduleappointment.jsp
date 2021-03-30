<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body bgcolor="beige">
<center><h1>Welcome to Patient Portal
<br><br><br><br>
<a href = "patientprofile.jsp">Patient Profile</a> | <a href = "scheduleappointment.jsp">Schedule Appointment</a> |
<a href = "patientappointmentview.jsp">View Appointment</a> | <a href = "index.html">Logout</a></h1>
<br><br><br><br>
<form action="./addappointment.jsp" method="post">
<input type="text" name = "PatName" placeholder="Patient Name">
<input type="date" name = "AppmntDate" placeholder="Date">
<input type="time" name = "AppmntTime" placeholder="Time">
<input type="text" name = "DrName" placeholder="Dr Name">
<select name = "DrSpl">
<option value="ENT">ENT</option>
<option value="Cardiologist">Cardiologist</option>
<option value="Dermatologist">Dermatologist</option>
<option value="Orthopedic">Orthopedic</option>
<option value="Ophthalmologist">Ophthalmologist</option>
<option value="Infection Specialist">Infection Specialist</option>
<option value="Nutritionist">Nutritionist</option>
<option value="Pediatrition">Pediatrition</option>
<option value="Neurologist">Neurologist</option>
<option value="Psychatrist">Psychatrist</option>		
</select>
<input type="hidden" name = "Status" placeholder="Pending">
<input type="submit" value = "Schedule">
</form>

</center>
</body>
</html>