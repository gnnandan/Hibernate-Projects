package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Certificate;

public class ICertificateRepositoryImpl implements ICertificateRepository
{
		//Step-1 Begin JPA Life Cycle
		private EntityManager entityManager;
		//begin JPA Life Cycle
		public ICertificateRepositoryImpl() 
		{
			entityManager = JPAUtil.getEntityManager();
		}
		
		//adding 
		@Override
		public Certificate addCertificate(Certificate certificate) 
		{
			entityManager.persist(certificate);
			return certificate;
		}
		
		//update
		@Override
		public Certificate updateCertificate(Certificate certificate)
		{
			entityManager.merge(certificate);
			return certificate;
		}
		
		//search
		@Override
		public Certificate searchCertificate(int id)
		{
			Certificate certificate = entityManager.find(Certificate.class, id);
			return certificate;
		}
		
		//delete 
		@Override
		public Certificate deleteCertificate(int id)
		{
			Certificate certificate = entityManager.find(Certificate.class, id);
			entityManager.remove(certificate);
			return certificate;
		}
		
		//begin trasaction
		@Override
		public void beginTransaction()
		{
			entityManager.getTransaction().begin();
			
		}
		
		//commiting the trasaction
		@Override
		public void commitTrasaction()
		{
			entityManager.getTransaction().commit();
			
		}
}
