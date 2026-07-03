package com.example.demo.controllerfignclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.AddressResponse;

@FeignClient(name = "hekllo",url = "${address.url}")
public interface AddressFeignclient {
	@GetMapping("/{id}")
	AddressResponse getaddress(@PathVariable("id") long id);

}
