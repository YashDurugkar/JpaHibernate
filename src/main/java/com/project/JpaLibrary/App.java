package com.project.JpaLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	Scanner sc = new Scanner(System.in);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TP");
        EntityManager em = emf.createEntityManager();
        
        
        System.out.println("1.Insert the Library Data.");
        System.out.println("2.Insert the Student Data.");
        System.out.println("3.Update the Data.");
        System.out.println("4.Find the Data.");
        System.out.println("5.Delete the Data.");
        System.out.println("6.Exit.");
        
        int choice = sc.nextInt();
       
        switch (choice) {
		case 1:{
			em.getTransaction().begin();
	        
			Student obj1=new Student(101, "Yash", "Pune", "Loggipool");
			Student obj2=new Student(102, "Jay", "Pune", "Loggipool");
			Student obj3=new Student(102, "Amit", "Pune", "Loggipool");
	        
	        List<Student> list = new ArrayList<>();
	        list.add(obj1);
	        list.add(obj2);
	        list.add(obj3);
	        
	        Library obj = new Library(1, "ABCD", "IT", list);
	        
	        em.getTransaction().commit();
			break;
		}
		case 2:{
			em.getTransaction().begin();
			
			Student obj1 = em.find(Student.class,102);
			System.out.println("Enter Student name");
			String sname = sc.next();
			
			System.out.println("Enter Student Address");
			String address = sc.next();
			
			System.out.println("Enter Student College");
			String college = sc.next();
			
	        em.getTransaction().commit();
		}
		default:
			break;
		}
        
    }
}
