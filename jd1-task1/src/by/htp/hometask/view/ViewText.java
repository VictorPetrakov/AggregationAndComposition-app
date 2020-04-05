package by.htp.hometask.view;

import by.htp.hometask.bean.*;

public class ViewText {

	public void viewText(Text text) {

		for (Sentence x : text.getText()) {
			for (Word y : x.getSentence()) {
				System.out.println(y);
			}

		}
		System.out.println();
	}

	public void viewTitle(Text text) {

		System.out.println("Название текста: " + text.getTitle());

		System.out.println();
	}

}
