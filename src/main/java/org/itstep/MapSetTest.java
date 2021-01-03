package org.itstep;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.*;

public class MapSetTest {

  public static void main(String[] args)
  {
      Scanner scanner= new Scanner(System.in);
      Map<String, Set<String>> networkMap= new HashMap<>();
      System.out.println("Введите количество каналов :");
      int size=Integer.parseInt(scanner.nextLine());
      int stap=0;
      while (size<10){
      if(size<10)
      { System.out.println("Слишком малое число каналов"); size=Integer.parseInt(scanner.nextLine());}
      }
      while (stap<size) {
          System.out.println("Каналы были добалвенны");
          System.out.println("Введите ТВ сеть: ");
          String channel = scanner.nextLine();
          System.out.println("Введите ТВ Шоу: ");
          String show = scanner.nextLine();
      stap++;
          if(!networkMap.containsKey(channel)){
              networkMap.put(channel,new TreeSet<>());
          }
          networkMap.get(channel).add(show);
          System.out.println(networkMap.toString());

      }
  }
}



