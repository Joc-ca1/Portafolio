Algoritmo sin_titulo
	Escribir "Proporcioname calificacion de materia 1"
	Leer materia1
	Escribir "Proporcioname calificacion de materia 2"
	Leer materia2
	Escribir "Proporcioname calificacion de materia 3"
	Leer materia3
	Escribir "Proporcioname calificacion de materia 4"
	Leer materia4
	Prom<-(materia1+materia2+materia3+materia4)/4
	Si Prom=70 Entonces
		Escribir "Apenas pasaste:" ,Prom
	Fin Si
	Si Prom<70 Entonces
		Escribir "Ponte a estudiar:" ,Prom
	Fin Si
	Si (Prom>70)Y(70<=80) Entonces
		Escribir "Alumno regular:" ,Prom
	Fin Si
	Si (Prom>80)Y(80<90) Entonces
		Escribir "Buen alumno:" ,Prom
	Fin Si
	Si (Prom>90)Y(90<=100)  Entonces
		Escribir "Alumno execelente:" ,Prom
	Fin Si
	FinAlgoritmo
