package org.uofm.tools;

//	TECH 2251
//	Advanced Programming Technology
//	Fall 2019
//	The University of Memphis
//
//	Assignment:		In Class Exercise Lecture 8
//	Developer:		Todd S. Canaday
//	Version:		1.0
//	Compiler:		Java ver. 1.8.0_221
//	Date:			October 12, 2019
//
//	Class Description:
//
//	EncapsulationTest Class.  Used to
//	demonstrate the use of encapsulation
//	within a Java program.

/**
 * EncapsulationTest Class.  Used to
 * demonstrate the use of encapsulation
 * within a Java program.
 *  
 * @author Todd S. Canaday
 * <br />Adjunct Professor
 * <br />Herff College of Engineering
 * <br />The University of Memphis
 * @since 1.0
 */
public class EncapsulationTest
{
	//	member variables...
	private String name;
	private String idNum;
	private int age;

	/**
	 * A 'Getter' method used
	 * to return the age.
	 * @return age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * A 'Getter' method used
	 * to return the name.
	 * @return name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * A 'Getter' method used to
	 * return the ID number.
	 * @return id number
	 */
	public String getIdNum()
	{
		return idNum;
	}

	/**
	 * A 'Setter' method used to
	 * set the age.
	 * @param newAge
	 */
	public void setAge(int newAge)
	{
		age = newAge;
	}

	/**
	 * A 'Setter' method used to
	 * set the name.
	 * @param newName
	 */
	public void setName(String newName)
	{
		name = newName;
	}

	/**
	 * A 'Setter' method used to
	 * set the id.
	 * @param newId
	 */
	public void setIdNum(String newId)
	{
		idNum = newId;
	}
}