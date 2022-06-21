/*
Cristiano Guimarães de Carvalho Fernandes Pinheiro  CB3013111
Patricia Jéssica Santos Fernandes Pinheiro          CB3013073
*/

package Data;

import java.text.DateFormat;
import java.util.Scanner;


  public class Data {
    
    Scanner scanner = new Scanner(System.in);

    DateFormat formaData = DateFormat.getDateInstance(DateFormat.FULL);
    
    private int dia;
     private int mes;
     private int  ano;
    
    public Data()
    {
        dia = 0;
        mes = 0;
        ano = 0;
        entraAno();
        entraMes();
        entraDia();
    }
    
    public Data(int d, int m, int a) 
    {
      //  entraDia(d);
      dia = d;
      mes = m;
      ano = a;
    }
    
    public void entraDia(int d)
    {
        dia = d;
    }
    
    public void entraMes(int m)
    {
        mes = m;
    }
    
    public void entraAno(int a)
    {
        ano = a;
    }
    
    public void entraDia()
    {
        int valorDo_mes = valorDoMes();
        do
        {
            System.out.println("Por favor digite o dia: ");
            dia = scanner.nextInt();
        }
        while(dia > valorDo_mes || dia < 1);
        
    }
    
    public void entraMes()
    {
        do
        {
            System.out.println("Por favor digite o mes: ");
            mes = scanner.nextInt();
        }
        while(mes >12 || mes <1);
    }
    
    public void entraAno()
    {
        do
        {
            System.out.println("Por favor Digite o ano: ");
            ano = scanner.nextInt();
        }
        while(ano < 1);
    }
    
    public int retDia()
    {
        return dia;
    }
    
    public int retMes()
    {
        return mes;
    }
    
    public int retAno()
    {
        return ano;
    }
    
    public String mostra1() {
    return dia + "/" + mes + "/" + ano;
  }

  public String mostra2() {
    String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
        "Outubro", "Novembro", "Dezembro" };

    return dia + "/" + meses[mes - 1] + "/" + ano;
  }
    
    public boolean bissexto()
    {
        boolean valor = false;
        if(ano%4 != 0)
        {
            valor = true;
        }
        
        return valor;
    }
    
    public int valorDoMes()
    {
        boolean valor = bissexto();
        int[] meses = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(valor == true)
        {
            meses[1] = 28;
        }
        
        return meses[mes-1];
    }
    
    public String mesPorExtenso(int m)
    {
        String[] meses = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        
        return meses[m-1];
    }
    
    public int diasTranscorridos()
    {
        boolean valor = bissexto();
        int data = 0;
        int[] meses = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (valor == true)
        {
            meses[1] = 28;
        }
        for(int i = 0; i <mes-1 ; i++)
        {
            data = data+meses[i];
        }
        
        return dia + data;
    }
    
    public void apresentaDataAtual() {
    Data data = new Data();
    String dataApresentavel = DateFormat.getDateInstance(DateFormat.FULL).format(data);

    System.out.println(dataApresentavel);
  }
    
    
    
}