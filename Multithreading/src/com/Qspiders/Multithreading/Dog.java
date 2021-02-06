package com.Qspiders.Multithreading;

public abstract class Dog implements Animal,movable,Swimmable {
public void move()
{
	System.out.println("moving adn swimming");
}
public void noise()
{
	System.out.println("barking");
}
}
