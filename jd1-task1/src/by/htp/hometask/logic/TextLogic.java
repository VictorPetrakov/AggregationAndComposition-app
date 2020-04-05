package by.htp.hometask.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.hometask.bean.*;

public class TextLogic {
	
	public Text increaseText(Text text, String word){
		
		Word words = new Word(word);
		
		List<Word> listWords = new ArrayList<Word>();
		
		listWords.add(words);
		
		Sentence sentence1 = new Sentence(listWords);
		
		List<Sentence> newSentence = new ArrayList<Sentence>();
		
		newSentence.add(sentence1);
		
		List<Sentence> finalList = new ArrayList<Sentence>(newSentence);
		
		finalList.addAll(text.getText());
		
		text.setText(finalList);
		
		return text;
		
	} 

}
