package enumeration;

public enum City {

	YANGON(1, 10000000L),
	MANDALAY(2, 2000000L),
	NAYPYIDAW(3, 800000L),
	SAGAING(4, 500000L),
	TAUNGGYI(5, 300000L);
	
	private final Integer rank;
	private final Long population;
	private City(Integer rank, Long population) {
		this.rank = rank;
		this.population = population;
	}
	
	public Integer getRank() {
		return rank;
	}
	public Long getPopulation() {
		return population;
	}
	
	static void description() {
		System.out.println("City Enumeration with Associated Value");
	}
}
