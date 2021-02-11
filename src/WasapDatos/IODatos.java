package WasapDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import Ejwasap.Contenido;

public class IODatos {
	
	private File f;
	private FileReader fr;
	private Scanner leer;
	private FileWriter fw;
	private PrintWriter pw;
	
	
	public IODatos(File f, FileReader fr, Scanner leer, FileWriter fw, PrintWriter pw) {
		super();
		this.f = null;
		this.fr = null;
		this.leer = null;
		this.fw = null;
		this.pw = null;
	}

	public Contenido[] cargarDatos(String nombreFichero) {
		
		Contenido vContenido[] = new Contenido[10];
		
		File f = new File(nombreFichero);
		
		FileReader fr = null;
		Scanner leer = null;
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fr = new FileReader(f);
			leer = new Scanner(fr);
			
			//Leer fichero
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				leer.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return vContenido;
		
		
		
	}
	

	public File getF() {
		return f;
	}


	public void setF(File f) {
		this.f = f;
	}


	public FileReader getFr() {
		return fr;
	}


	public void setFr(FileReader fr) {
		this.fr = fr;
	}


	public Scanner getLeer() {
		return leer;
	}


	public void setLeer(Scanner leer) {
		this.leer = leer;
	}


	public FileWriter getFw() {
		return fw;
	}


	public void setFw(FileWriter fw) {
		this.fw = fw;
	}


	public PrintWriter getPw() {
		return pw;
	}


	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}


	@Override
	public String toString() {
		return "IODatos [f=" + f + ", fr=" + fr + ", leer=" + leer + ", fw=" + fw + ", pw=" + pw + "]";
	}
	
	
	

}
