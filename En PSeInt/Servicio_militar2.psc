Algoritmo sin_titulo
	Escribir "Este pseudocodigo es para verificar quien hara el servicio militar"
	cont1=0
	cont2=0
	cont3=0
	cont4=0
	cont5=0
	hombre=1
	mujer=2
	Escribir "¿Cuantas personas desea ingresar?"
	Leer m
	Para vuelta<-1 Hasta m Con Paso 1 Hacer
		Escribir "Dame tu nombre"
		Leer nombre
		Escribir "Dame tu edad"
		Leer edad
		Escribir "Ingresa tu sexo hombre=1 o mujer=2"
		Leer genero
		Si genero=2 Entonces
			Escribir "Tu genero es " ,genero, "no puedes hacer servicio por ser mujer "
			cont1=cont1+1
		SiNo
			genero=1
			cont2=cont2+1
		Fin Si
		Si edad>=18 Entonces
			Escribir "Te tocara hacer servicio"
			cont3=cont3+1
		SiNo años=18-edad
			Escribir "No puedes hacer el servicio porque te faltan " ,años, " años " ,nombre
			cont4=con4+1
			cont5=cont5+1
		Fin Si
	Fin Para
	Escribir "¿Cuantas personas haran el servicio? " ,cont3
	Escribir "¿Cuantas persoans no haran el servicio? " ,cont5
	Escribir "¿Cuantas mujeres fueron registradas? " ,cont1
	Escribir "¿Cuantos hombres dueron registrados? " ,cont2 
	Escribir "¿Cuantos menores de edad fueron registrados? " ,cont4
FinAlgoritmo
