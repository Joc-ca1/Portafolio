Algoritmo sin_titulo
	acum<-0
	cont<-0
	n<-1
	Escribir "¿Cuantas personas decesa ingresar?"
	Leer k
	Mientras n<=k Hacer
		Escribir "¿Cual es tu nombre?"
		Leer nom
		Escribir "Dame cuanto vendiste en el primer bimestre"
		Leer bim1
		Escribir "Dame cuanto vendiste en el segundo bimestre"
		Leer bim2
		Escribir "Dame cuanto vendiste en el tercer bimestre"
		Leer bim3
		Escribir "Dame cuanto vendiste en el cuarto bimestre"
		Leer bim4
		Escribir "Dame cuanto vendiste en el quinto bimestre"
		Leer bim5
		Escribir "Dame cuanto vendiste en el sexto bimestre"
		Leer bim6
		ventas=bim1+bim2+bim3+bim4+bim5+bim6
		acum<-acum+ventas
		Escribir ,nom, " vendio " ,ventas
		Escribir  "¿Cuanto venderieron entre todos?" ,acum
		n<-n+1
	Fin Mientras
FinAlgoritmo
