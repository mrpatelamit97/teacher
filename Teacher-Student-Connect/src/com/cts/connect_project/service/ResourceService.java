package com.cts.connect_project.service;

import java.util.List;

import com.cts.connect_project.bean.Resource;

public interface ResourceService {
	public int addResource(Resource resource);
	public List<Resource> getAllResource();
	public List<Resource>filterResources(String query);
	public Resource searchDocuments(String subject,String title,String author,String year);
	public List<Resource> searchResources(Resource resource);

}
