package EjercicioPrimos;

import java.util.Date;

public class HiloPrimo extends Thread{
	boolean esPrimo=true;
	long tiempoEjecucion;
	int num;
	public boolean isEsPrimo() {
		return esPrimo;
	}
	public void setEsPrimo(boolean esPrimo) {
		this.esPrimo = esPrimo;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public long getTiempoEjecucion() {
		return tiempoEjecucion;
	}
	public void setTiempoEjecucion(int tiempoEjecucion) {
		this.tiempoEjecucion = tiempoEjecucion;
	}
	public HiloPrimo(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public void run() {
		Date tiempoStart=new Date();
			int contador = 2;
		  while ((esPrimo) && (contador!=num)){
		    if (num % contador == 0)
		      esPrimo = false;
		    contador++;
		  }
		  if(esPrimo) {
			  System.out.println("El numero "+num+" es primo");
		  }else {
			  System.out.println("El numero "+num+" no es primo");
		  }
		  Date tiempoFin=new Date();
		  tiempoEjec(tiempoStart,tiempoFin);
		  System.out.println("El hilo "+Thread.currentThread().getName()+" ha tardado "+tiempoEjecucion + "ms en ejecutarse");
	}
	
	public void tiempoEjec(Date tiempoStart, Date tiempoFin) {
		long fin = tiempoFin.getTime();
		long ini = tiempoStart.getTime();
		tiempoEjecucion=fin-ini;
	}
}
