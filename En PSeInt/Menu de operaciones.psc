Algoritmo sin_titulo
	op<-0
	Escribir "Menu de operaciones"
	Mientras op<5 Hacer
		Escribir '1- Sumar'
		Escribir '2- Restar'
		Escribir '3- Multiplicar'
		Escribir '4- Dividir'
		Escribir '5- Salir'
		Escribir 'Ingrse la opcion que desea hacer'
		Leer op
		Si op<>5 Entonces
			Si op=1 Entonces
				Escribir "Realizaras una suma"
				Escribir "Digita el primer numero"
				Leer num1
				Escribir "Digita el segundo numero"
				Leer num2
				sum=num1+num2
				Escribir "La suma es ",num1,"+",num2,"=",sum
			Fin Si
			Si op=2 Entonces
				Escribir "Realizaras una resta"
				Escribir "Digita el primer numero"
				Leer num1
				Escribir "Digita el segundo numero"
				Leer num2
				res=num1-num2
				Escribir "La resta es ",num1, "-",num2, "=",res
			Fin Si
			Si op=3 Entonces
				Escribir "Realizaras una multiplicacion"
				Escribir "Digita el primer numero"
				Leer num1
				Escribir "Digita el segundo numero"
				Leer num2
				mul=num1*num2
				Escribir "La multiplicacion es ",num1,"*",num2,"=",mul
			Fin Si
			Si op=4 Entonces
				Escribir "Realizaras una division"
				Escribir "Digita el primer numero"
				Leer num1
				Escribir "Digita el segundo numero"
				Leer num2
				div=num1/num2
				Escribir "La division es ",num1,"/",num2,"=",div
			Fin Si
			Si op=5 Entonces
				Escribir "Hasta luego, adios"
			SiNo
				Escribir "La operacion seleccionada no es valida"
			Fin Si
		Fin Si
	Fin Mientras
 
FinAlgoritmo
