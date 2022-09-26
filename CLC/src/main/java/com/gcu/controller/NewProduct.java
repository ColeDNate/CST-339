package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

import org.springframework.validation.BindingResult;

import com.gcu.model.EventModel;
import com.gcu.model.LoginModel;

public class NewProduct {
	private String W;
	private int X;
	private int Y;
	private int Z;
	
	public void setW(String W) {
		this.W = W;
	}
	public void setX(int X) {
		this.X = X;
	}
	public void setY(int Y) {
		this.Y = Y;
	}
	public void setZ(int Z) {
		this.Z = Z;
	}
	
	public List<EventModel> newthing(@Valid LoginModel loginModel, BindingResult bindingResult) {
		
		List <EventModel> nevent = new ArrayList<EventModel>();
			nevent.add(new EventModel(W, X, Y, Z));
			return nevent;
			
	}
}
