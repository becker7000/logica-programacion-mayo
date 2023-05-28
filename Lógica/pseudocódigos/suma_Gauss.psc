Proceso suma_Gauss
	
	// 1 + 2 + 3 + 4 + ... + maximo = suma
	Definir maximo Como Entero;	
	Definir suma Como Entero;
	Definir i Como Entero;
	
	Imprimir "Escribe el valor máximo:";
	Leer maximo;
	
	suma <- 0;
	
	Para i<-1 Hasta maximo Con Paso 1 Hacer
		suma <- suma + i;
	FinPara
	
	Imprimir "La suma del 1 al ",maximo," es: ",suma;
	
FinProceso
