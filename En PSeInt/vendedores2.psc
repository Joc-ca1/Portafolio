Algoritmo sin_titulo
	n<-1
	h<-0
	Mientras n<=3 Hacer
		Escribir "Dame tu nombre"
		Leer nom
		j<-1
		sum<-0
		Mientras (j<=6) Hacer
			ven<-azar(100)
			Escribir "Vendedor genero " ,j, "$" ,ven
			sum<-sum+ven
			j<-j+1
		Fin Mientras
		Escribir "Ventas total $" ,sum
		h<-h+sum
		n<-n+1
	Fin Mientras
	totalven<-h/3
	Escribir "Ventas entre todos $" ,totalven
FinAlgoritmo
