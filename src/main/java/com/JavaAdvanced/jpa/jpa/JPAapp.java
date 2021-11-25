package com.JavaAdvanced.jpa.jpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAapp {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence.xml");

        EntityManager entityManager = factory.createEntityManager();











        }
}
