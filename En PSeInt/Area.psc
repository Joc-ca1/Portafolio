Algoritmo sin_titulo
	area=1
	Mientras area<>5 Hacer
		Escribir '1. Area del triángulo'
		Escribir '2. Area del cuadrado'
		Escribir '3. Area del círculo'
		Escribir '4. Area del rectángulo'
		Escribir '5. Salir'
		Escribir "Ingrese la opcion que desea hacer"
		Leer area
		Segun area Hacer
			1:
				Escribir "Realizaras la operacion para saber el area del triangulo"
				Escribir "Dame la medida de la base del tringulo"
				Leer base
				Escribir "Dame la altura del triangulo "
				Leer altura
				a=base*altura/2
				Escribir "El area del triangulo es de " ,a
			2:
				Escribir "Realizaras la operacion para saber la area de un cuadrado"
				Escribir "Dame la medida de los lados"
				Leer lado
				a=lado*lado
				Escribir "El area del cuadro es de " ,a
			3:
				Escribir "Realizaras la operacion para saber la area de un circulo"
				Escribir "Dame el radio del circulo"
				Leer r
				a=PI*r^2
				Escribir "El area del circulo es de " ,a
			4:
				Escribir "Realizaras la peracion pra saber la area de un rectangulo"
				Escribir "Dame la medida de la base del rectangulo"
				Leer base
				Escribir " Dame la altura del rectangulo"
				Leer altura
				a=base*altura
				Escribir "El area del rectangulo es de " ,a
			5:
				Escribir "Hasta luego, adios"
			De Otro Modo:
				Escribir "Opcion no valida"
		FinSegun
	FinMientras
FinAlgoritmo
