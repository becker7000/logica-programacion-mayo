Proceso calcu_imc
	
	Definir masa Como Real; // Kilogramos 
	Definir estatura Como Real; // Metros
	Definir imc Como Real; 
	
	Imprimir "Escribe tu peso (kg):";
	Leer masa;
	
	Imprimir "Escribe tu estatura (m):";
	Leer estatura;
	
	// Linealizaci�n:
	imc = masa / (estatura*estatura);
	
	Imprimir "Tu �ndice de masa corporal es: ",imc;
	
FinProceso
