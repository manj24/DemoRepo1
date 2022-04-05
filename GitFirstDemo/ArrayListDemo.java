package com.cg;
import java.util.ArrayList;
public class ArrayListDemo
{
public static void main(String[] args)
{
ArrayList<String> cities=new ArrayList<String>();
cities.add("Pune");
cities.add("Delhi");
cities.add("Chennai");
cities.add("Mumbai");
cities.add("Hyderabad");
cities.add(2, "Banglore");
cities.add(null);

System.out.println(cities);

ArrayList<String> topCities= new ArrayList<String>();
topCities.add("Nagpur");
topCities.addAll(1, cities);
System.out.println("Top cities in India are - "+topCities);
}
}
