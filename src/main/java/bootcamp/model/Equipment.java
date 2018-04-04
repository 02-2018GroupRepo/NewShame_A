package bootcamp.model;

public class Equipment {

	private int skuNumber;
	private String equipmentType;
	private int equipmentId;
	private double price;
	private String location; 
	
//	public Equipment(int skuNumber,String  equipmentType, int equipmentId, double price, String location) {
//		this.skuNumber = skuNumber;
//		this.equipmentType= equipmentType;
//		this.equipmentId = equipmentId;
//		this.price = price;
//		this.location = location;
//	}
	public int getSkuNumber() {
		return skuNumber;
	}
	public void setSkuNumber(int skuNumber) {
		this.skuNumber = skuNumber;
	}
	public String getEquipmentType() {
		return equipmentType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}
	public int getEquipmentId() {
		return equipmentId;
	}
	public void setEquipmentId(int equipmentId) {
		this.equipmentId = equipmentId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
//    private final long id;
//    private final String content;
//
//    public Inventory(long id, String content) {
//        this.id = id;
//        this.content = content;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getContent() {
//        return content;
//    }
}
