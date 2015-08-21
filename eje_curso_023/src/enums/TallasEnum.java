package enums;

public enum TallasEnum {

	MINI("S"),
	MEDIANO("M"),
	GRANDE("L"),
	MUY_GRANDE("XL"),
	EXTRA_GRANDE("XXL");
	
	private String tallasCode;
	
	private TallasEnum(String tallas){
		this.tallasCode = tallas;
	}
	
	public String getTallasEnum(){
		
		return tallasCode;
	}
	
}
