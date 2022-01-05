package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.ICertificateRepository;
import com.cg.placement.repository.ICertificateRepositoryImpl;

public class ICertificateServiceImpl implements ICertificateService 
{
		// Step 1: Establishing connection between Service and Repo
		private ICertificateRepository dao;
		
		public ICertificateServiceImpl() 
		{
			dao = new ICertificateRepositoryImpl();
		}

		//adding 
		@Override
		public Certificate addCertificate(Certificate certificate)
		{
			dao.beginTransaction();
			dao.addCertificate(certificate);
			dao.commitTrasaction();
			return certificate;
		}

		//update
		@Override
		public Certificate updateCertificate(Certificate certificate) 
		{
			dao.beginTransaction();
			dao.updateCertificate(certificate);
			dao.commitTrasaction();
			return certificate;
		}

		//search
		@Override
		public Certificate searchCertificate(int id)
		{
			dao.beginTransaction();
			Certificate certificate = dao.searchCertificate(id);
			dao.commitTrasaction();
			return certificate;
		}
		
		//delete
		@Override
		public Certificate deleteCertificate(int id)
		{
			dao.beginTransaction();
			Certificate certificate = dao.deleteCertificate(id);
			dao.commitTrasaction();
			return certificate;
		}
}
