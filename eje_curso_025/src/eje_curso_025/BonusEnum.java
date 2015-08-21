package eje_curso_025;

public enum BonusEnum {

	BONUS_BASE(1500.00);
	
	private double montoBonus;
	
	private BonusEnum(double monto){
		this.montoBonus = monto;
	}
	
	public double getBonusMto(){
		return montoBonus;
	}
}
