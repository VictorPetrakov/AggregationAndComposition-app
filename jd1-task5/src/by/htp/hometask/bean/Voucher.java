package by.htp.hometask.bean;

public class Voucher {
	
	public enum Recreation{
		
		EGYPT("Египет", "Автобус", "Все включено", 14),
		TURKEY("Турция", "Самолет", "Все включено", 9),
		CYPRUS("Кипр", "Самолет", "Завтрак", 12),
		GOA("ГОА", "Корабль", "Без питания", 10);
		
		String country;
		String typeOfTransport;
		String food;
		int numberOfDays;

		Recreation(String country, String typeOfTransport, String food, int numberOfDays){
			this.country = country;
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		}

		public String getCountry() {
			return country;
		}
		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return getCountry() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
		
			

	}

	public enum Treatment{
		
		MONTENEGRO("Черногория", "Самолет", " Завтрак,Обед", 20),
		KISLOVODSK("Кисловодск", "Автобус", "Все включено", 25),
		SOCHI("Сочи", "Поезд", " Завтрак,Обед", 14),
		BELARUS("сан. Беларусь", "Автобус", "Все включено", 23);
		
		String country;
		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Treatment(String country, String typeOfTransport, String food, int numberOfDays){
			this.country = country;
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}

		public String getCountry() {
			return country;
		}
		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return getCountry() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Excursion{
		
		PARIS("Париж", "Самолет", "Завтрак", 5),
		LONDON("Лондон", "Самолет", "Завтрак", 7),
		AMSTERDAM("Амстердам", "Автобус", "Все включено", 5),
		PRAHA("Прага", "Поезд", "Все включено", 8);
		
		String country;
		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Excursion(String country, String typeOfTransport, String food, int numberOfDays){
			this.country = country;
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
	}

		public String getCountry() {
			return country;
		}
		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return getCountry() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Shopping{
		
		PARIS("Париж", "Самолет", "Без питания", 4),
		ROME("Рим", "Поезд", "Завтрак", 5),
		MONTECARLO("Монтекарло", "Автобус", "Все включено", 2),
		LONDON("Лондон", "Самолет", "Завтрак", 6);
		
		String country;
		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Shopping(String country, String typeOfTransport, String food, int numberOfDays){
			this.country = country;
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}

		public String getCountry() {
			return country;
		}
		
		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		@Override
		public String toString() {
			return getCountry() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
	
	public enum Cruise{
		
		KINGOFSEA("Король моря", "Лайнер", "Все включено", 5),
		BLUEOCEAN("Голубой океан", "Лайнер", "Завтрак", 4),
		PIRATESOFTHECARIBIAN("Пираты Карибского моря", "Лайнер", "Завтрак,Обед", 10);
		
		String nameOfCruise;
		String typeOfTransport;
		String food;
		int numberOfDays;
		
		Cruise(String nameOfCruise, String typeOfTransport, String food, int numberOfDays){
			this.nameOfCruise = nameOfCruise;
			this.typeOfTransport = typeOfTransport;
			this.food = food;
			this.numberOfDays = numberOfDays;
		
		}

		public String getNameOfCruise() {
			return nameOfCruise;
		}

		public String getTypeOfTransport() {
			return typeOfTransport;
		}

		public String getFood() {
			return food;
		}

		public int getNumberOfDays() {
			return numberOfDays;
		}
		
		
		@Override
		public String toString() {
			return getNameOfCruise() + " [Вид транспорта :" + this.getTypeOfTransport() + ", питание :" + this.getFood() + ", количество дней :"
					+ this.getNumberOfDays() + "]";
		}
	}
		
}
