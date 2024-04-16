package com.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.CloudVender;

@RestController
@RequestMapping("/cloudvender")
public class CloudVenderAPIService {
	
	CloudVender cloudVender;
	
	@GetMapping("{venderId}")
	public CloudVender getCloudVenderDetails(String venderId) {
		
		return  cloudVender;
				//new CloudVender("C1", "Sanap", "Pune", "XXXX");
		}
	
	@PostMapping
	public String createCloudVenderDetails(@RequestBody CloudVender cloudVender) {
		this.cloudVender=cloudVender;
		return "Cloud Vender Create Successfully";
	}
	
	@PutMapping
	public String updateCloudVenderDetails(@RequestBody CloudVender cloudVender) {
		this.cloudVender=cloudVender;
		return "Cloud Vender Updated Successfully";
	}
	
	@DeleteMapping("{venderId}")
	public String deleteCloudVenderDetails(String venderId) {
		
		this.cloudVender=null;
		return "Cloud Vender Deleted Successfully";
	}
}
