public class Ejercicios
{
	//deveulve true si "numero" es par y false de lo contrario
	static boolean esPar(int numero)
	{
		if (numero%2==0)//evalua si el residuo de num es cero
		return true;//si lo es devuelve quqe es par (true)
		else //sino
		return false;//devuelve que no es par (false) 
	}
	
	//devuelve "paquetillo" si lempiras es menor que 50
	//devuelve "paquetin" si lempiras es menor que 100
	//devuelve "paquetote" si lempiras es menor que 200
	//de lo contrario devuelve paqueton
	//nota: solo aceptan minusculas
	static String churches(int lempiras)
	{
		if (lempiras<50)//evalua si lempiras es menor que 50
		return "paquetillo";// si lo es devuelve paquetillo 
		if (lempiras<100)//evalua si lempiras es menor que 100
			return "paquetin";//si lo es devuelve paquetin
		if (lempiras<200)//evalua si lempiras es menor que 200
			return "paquetote";//si lo es devuelve paquetin
		else // si no es ninguna d elas anteriores 
			return "paqueton";//devuelve paqueton  
	}
	
	//devuelve el factorial de "num"
	static int factorial(int num)
	{
		 if ( num <= 1 ) {//evalua si el numero es menor o igual a 1 
             return 1;//devuelve 1
         } else {//sino
             return num*factorial(num-1);//devuelve el calculo matematico 
         }
		 //ayuda obtenida de:
		 //http://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Funciones_recursivas
	}
	
	//devuelve el elemento de "arr" en la posicion "pos"
	static int getElemento(int arr[],int pos)
	{
		return arr[pos];//se coloca pos dentro del parametro arr para devolver el elemento de arr en la posion pos 
	}
	
	//devuelve el elemento de "arr" en la posicion ["col"] ["fila"]
	static int getElemento(int arr[][],int col,int fila)
	{
		return arr[col][fila];//se coloca col y fila dentro de los parametros arr para devolver el elemento de arr en la posion col y fila 
	}
	
	//devuelve el atributo "x" de "MiClase"
	static int getX(MiClase mi_clase)
	{
		return mi_clase.x;//devuelve el atributo x obtenido de la clase "miclase"
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXPor2(MiClase mi_clase)
	{
		return mi_clase.getXPor2();//devuelve el metodo getXPor2() obtenido de  "mi clase"
	}
	
	//implementar la funcion "getXPor2()" descrita en la clase "MiClase"
	//No modificar esta funcion
	static int implementarGetXMasY(MiClase mi_clase, int y)
	{
		return mi_clase.getXMasY(y);//devuelve el metodo getXMasY(y) obtenido de  "mi clase"
	}
	
	//devuelve la funcion fibonacci de "num"
	//nota: puedes consultar la funcion en http://es.wikipedia.org/wiki/Sucesi%C3%B3n_de_Fibonacci
	static int fibonacci(int num){
	if (num==0){//evalua la primera posibilidad dada si num es igual a cero 
		return 0;//devuelve cero
	}
		else //sino 
	if (num==1){//evalua la segunda posibilidad dada si num es igual a uno 
	return 1;//devuelve uno
	}
		else //sino 
		return fibonacci(num-1)+fibonacci(num-2); //devuelve el calculo matematico 
	}
	
	//realizar la siguiente funcion recursiva:
	//funcionRecursiva(n) = funcionRecursiva(n-1)*2+1
	//donde: funcionRecursiva(0) = 0 y funcionRecursiva(1) = 2
	static int funcionRecursiva(int num)
	{
		if(num==0){//evalua la primera posibilidad dada si num es igual a cero 
			return 0;//devuelve cero
		}
		if (num==1){//evalua la primera posibilidad dada si num es igual a uno 
			return 2;//devuelve 2
		}
		else//sino
	
		return  funcionRecursiva(num-1)*2+1;// devuelve el calculo matematico 
			 
	}
	
	
	public static void main(String[] args)
	{

	}

}
