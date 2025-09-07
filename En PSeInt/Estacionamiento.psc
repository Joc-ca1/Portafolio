Algoritmo sin_titulo
	Escribir "¿Cuantas horas duro en el estacionamiento"
	Leer horas
	Escribir "¿Cuantos minutos duro en el estacionamiento"
	Leer minutos
	Si (minutos>0) Entonces
		horas<-horas+1
		total<-horas*10.50
		Escribir "El total a pagar por las: " ,horas-1, "horas y " ,minutos, "minutos"
		Escribir "El total a pagar es " ,total
	Fin Si
	Si (minutos=0) Entonces
		total<-horas*10.50
		Escribir  "El total a pagar por las: " ,horas, "horas y " ,minutos, "minutos"
		Escribir " El total es" ,total
	Fin Si
	FinAlgoritmo