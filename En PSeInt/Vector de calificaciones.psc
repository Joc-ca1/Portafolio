Algoritmo sin_titulo
	Dimension nom[10]
	Dimension cal[10]
	Dimension call[10]
	Dimension calll[10]
	Dimension prom[10]
	Para x<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "Dame tu nombre"
		Leer nomb
		nom[x]<-nomb
		cal1<-azar(100)
		cal[x]<-cal1
		cal2<-azar(100)
		call[x]<-cal2
		cal3<-azar(100)
		calll[x]<-cal3
		prom[x]<-(cal[x]+call[x]+calll[x])/3
	FinPara
	Escribir "*****************************************"
	Para j<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "Te llamas: " ,nom[j]
		Escribir "Calificacion I: " ,cal[j]
		Escribir "Calificacion II: " ,call[j]
		Escribir "Calificacion III: " ,calll[j]
		Escribir "Promedio: " prom[j]
		Escribir "*****************************************"
	Fin Para
FinAlgoritmo
