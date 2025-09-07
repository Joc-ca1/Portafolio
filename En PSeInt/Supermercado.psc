Algoritmo sin_titulo
	Escribir "Total de productos comprados"
	Leer productos
	Escribir "Dame el precio del producto"
	Leer precio
	Si productos>36 Entonces
		regalo=(productos/12)
		descuento = (productos*precio)*.15
		total=(productos*precio)-descuento
	SiNo
		descuento=(productos*precio)*.10
		total=(productos*precio)-descuento
	Fin Si
	Escribir "El monto de compra es: " ,productos*precio
	Escribir "El monto del descuento es: " descuento
	Escribir "Total a pagar: " ,total
	Escribir "Total de productos de regalo es: " ,regalo
FinAlgoritmo

