/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cola;

/**
 *
 * @author Administrador
 */
public class ColaLineal {
    private int tamCola;
	private int frente;
	private int fin;
	private Object [] listaCola;
	
	public ColaLineal(){
		frente = 0;
		fin = -1;
		tamCola=99;
		listaCola = new Object [tamCola];
	}

	//operaciones de modificación de la cola
	public void insertar(Object elemento) throws Exception{
		if (!colaLlena()){
			System.out.println("inserto el dato: "+elemento);
			fin++;
			listaCola[fin] = elemento;
		}else
			throw new Exception("Overflow en la cola");
	}
	
	public Object quitar() throws Exception{
		if (!colaVacia()){
			Object dato = listaCola[frente];
			frente++;
			return dato;
		}else
			throw new Exception("Cola vacia ");
	}
		
	//vacía la cola
	public void borrarCola(){
		frente = 0;
		fin = -1;
	}
	
	// método para obtener el frente de la cola
	public Object frenteCola() throws Exception{
		if (!colaVacia()){
			return listaCola[frente];
		}else
			throw new Exception("Cola vacia ");
	}
	
	//Muestra los datos de la cola
	public void mostrar(){
		if(!colaVacia()){
			System.out.println("Mostrando datos de la cola...... fin: "+fin+"  frente: "+frente);
			for (int i = frente; i <= fin; i++) {
				Object object = listaCola[i];
				System.out.println(object);			
			}
		}else{
			System.out.println("La cola se encuentra vacia...");
		}
	}
	
	private void moverAlFrente(){
		
	}
	
	// métodos de verificación del estado de la cola
	public boolean colaVacia(){
		return frente > fin;
	}
	
	public boolean colaLlena(){
		return fin == tamCola-1;
	}
}
