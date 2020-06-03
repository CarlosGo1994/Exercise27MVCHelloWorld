package com.excercise27mvchelloworls.model;

public class UserModel {
	
	public byte edad ;
	public String nombre;
	public int id;
	
	public UserModel() 
	{
		
	}
	
	public byte getEdad()
	{
		return edad;
	}
	public void setEdad(byte edad)
	{
		this.edad= edad;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setEdad(String nombre)
	{
		this.nombre= nombre;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id= id;
	}
}
