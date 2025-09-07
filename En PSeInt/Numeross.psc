Algoritmo sin_titulo
	Escribir "Ingresa un numero"
	Leer numero1
	Escribir "Ingrese un segundo numero"
	Leer numero2
	Escribir "Ingrse un tercer numero"
	Leer numero3
	total<-numero1+numero2+numero3
	Si (numero1=numero2)Y(numero1=numero3) Entonces
		Escribir "Todos son iguales"
	SiNo
		Si (numero1=numero2)Y(numero1<nuemero3) Entonces
			Escribir "El primer y segundo son menores" 
		SiNo
			Si (numero1=numero3)Y(numero1<numero2) Entonces
				Escribir "El primero y tercero son menores"
			SiNo
				Si (numero2=numero3)Y(numero2<numero1) Entonces
					Escribir "El segundo y el tercero son menores"
				SiNo
					Si (numero1<numero2)Y(numero1<numero3) Entonces
						Escribir "El menor menor es el primero" ,numero1
					SiNo
						Si (numero2<numero1)Y(numero2<numero3) Entonces
							Escribir "El menor es el segundo numero" ,numero2
						SiNo
							Si (numero3<numero1)y(numero3<numero2) Entonces
								Escribir "El menor es el tercer numero" ,numero3
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	Escribir "La suma es:" ,total
FinAlgoritmo
