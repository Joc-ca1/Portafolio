Algoritmo Parimpar
	Escribir "Este pseudocodigo es para verificar si los numeros dados son par o impar y negativos o positivos"
	cont1=0
	cont2=0
	cont3=0
	cont4=0
	Para vuelta<-1 Hasta 8 Con Paso 1 Hacer
		Escribir "Proporcioname un numero"
		Leer num 
		Si num mod 2=0 Entonces
			Escribir "El numero " ,num, " es par"
			cont1=cont1+1
		SiNo
			Escribir "El numero " ,num, " es impar"
			cont2=cont2+1
		Fin Si
		Si num>0 Entonces
			Escribir "Es positivo"
			cont3=cont3+1
		SiNo
			Escribir "Es negativo"
			cont4=cont4+1
		Fin Si
	Fin Para
	
	Escribir "¿Cuantos numeros fueron par? " ,cont1
	Escribir "¿Cuantos numeros fueron impares? " ,cont2
	Escribir "¿Cuantos numeros fueron positivos? " ,cont3
	Escribir "¿Cuantos numeros fueron negativos? " ,cont4
FinAlgoritmo
