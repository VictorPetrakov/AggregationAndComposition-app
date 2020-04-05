package by.htp.hometask.view;

import java.util.List;

import by.htp.hometask.bean.*;

public class PrintInfo {

	public void printInformation(City city) {

		System.out.println(city);

	}

	public void printInformation(int i) {

		System.out.println(i);
	}

	public void printArea(State state) {

		System.out.println(state.getArea());
	}

	public void printInformation(List<City> centers) {
		for (City c : centers) {
			System.out.println(c);
		}

	}
}
