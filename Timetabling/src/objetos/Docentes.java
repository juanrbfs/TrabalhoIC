package objetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import timetabling.Filetomem;

public class Docentes {
    
	public static Hashtable <String, String> docentesigla;
	public static Hashtable <String, String> docentenome;
	public static Hashtable <String, String> docentedisc1;
	public static Hashtable <String, String> docentedisc2;	
	public static Hashtable <String, String> docentedisc3;
	public static Hashtable <String, String> docentedisc4;
	public static Hashtable <String, String> docentedisc5;
	BufferedReader buffR=Filetomem.buffR;
        
       //Lista de docente com restricao
        private static List<DocenteRestricao> docenteRestricao= new ArrayList<DocenteRestricao>();
       
        
	public Docentes(){
		docentesigla=new Hashtable <String,String>();
		docentenome=new Hashtable <String,String>();
		docentedisc1=new Hashtable <String,String>();
		docentedisc2=new Hashtable <String,String>();
		docentedisc3=new Hashtable <String,String>();
		docentedisc4=new Hashtable <String,String>();
		docentedisc5=new Hashtable <String,String>();
	
		try {
			buffR.readLine();
			buffR.readLine();
			String str,str1,str2,str3;
			int virg=0,i;
			do{
				virg=0;
			str=buffR.readLine();
			if(str.charAt(0)!='/'){
			str1=str.substring(0,str.indexOf(","));
			str2=str.substring(str.indexOf(",")+1,str.length());
			str3=str2.substring(0,str2.indexOf(","));
			docentesigla.put(str1, str3);
			str2=str.substring(str.indexOf(",")+1,str.length());
			str3=str2.substring(0,str2.indexOf(","));
			docentenome.put(str1, str3);
			str2=str2.substring(str2.indexOf(",")+1,str2.length());
			for(i=0;i<str2.length();i++){
				if((str2.charAt(i))==',')
					virg++;
			}
			for(i=0;i<=virg;i++){
				if(i==virg)
					str3=str2.substring(0,str2.length());
				else{
					str3=str2.substring(0,str2.indexOf(","));
					str2=str2.substring(str2.indexOf(",")+1,str2.length());}
					switch(i){
				case 0:docentedisc1.put(str1, str3);
					break;
				case 1:docentedisc2.put(str1, str3);
					break;
				case 2:docentedisc3.put(str1, str3);
					break;
				case 3:docentedisc4.put(str1, str3);
					break;
				case 4:docentedisc5.put(str1, str3);
					break;
				}
					
					
			}
			}
			}while(str.charAt(0)!='/');
			buffR.readLine();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	}
        
    public static void gerarListaDocenteRestricao(){
        //do something
    }
        
    public static List<DocenteRestricao> getDocenteRestricao(){
        return docenteRestricao;
    }
}
