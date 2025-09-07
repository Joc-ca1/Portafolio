Algoritmo calificaciones
	Escribir "Este pseudocodigo es para verificar calificaciones finales"
	Escribir "¿Cuantas personas va a ingresar?"
	Leer r
	Para vuelta<-1 Hasta r Con Paso 1 Hacer
		Escribir "Proporcionar nombre del alumno"
		Leer nombre
		Escribir "Pedir calificacion 1"
		Leer cal1
		Escribir "Pedir calificacion 2"
		Leer cal2
		Escribir "Pedir calificacion 3"
		Leer cal3
		Escribir "Pedir calificacion 4"
		Leer cal4
		cal_final<-(cal1+cal2+cal3+cal4)/4
		Escribir "Alumno:", nombre
		Escribir "Calificacion 1 es: " ,cal1
		Escribir "Calificacion 2 es: " ,cal2
		Escribir "Calificacion 3 es: " ,cal3
		Escribir "Calificacion 4 es: " ,cal4
		Escribir "calificacion final:" ,cal_final
	Fin Para
FinAlgoritmo
