package by.htp.hometask.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.hometask.bean.*;
import by.htp.hometask.logic.*;
import by.htp.hometask.view.*;

public class DemoCar {

	public static void main(String[] args) {
		CarLogic logic = new CarLogic();
		ViewCarMake view = new ViewCarMake();
		
		Engine disel = new Engine(150);
		
		Wheel frontleftwheel = new Wheel(17);
		Wheel frontrightwheel = new Wheel(17);
		Wheel backleftwheel = new Wheel(17);
		Wheel backrightwheel = new Wheel(17);
		Wheel sparewheel = new Wheel(16);
		
		List<Wheel> wheels = new ArrayList<Wheel>();
		
		wheels.add(frontleftwheel);
		wheels.add(frontrightwheel);
		wheels.add(backleftwheel);
		wheels.add(backrightwheel);
		
		Car car1 = new Car("BMW", 21, wheels, disel);
		
		logic.drive(car1);
		
		view.viewCarMake(car1);
		
		logic.refuel(car1, 100);
		
		logic.changeWheels(car1, 2, sparewheel);

	}

}
