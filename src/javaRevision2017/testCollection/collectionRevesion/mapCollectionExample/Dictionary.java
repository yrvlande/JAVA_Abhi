package javaRevision2017.testCollection.collectionRevesion.mapCollectionExample;

public class Dictionary  implements Comparable<Object>{
	
	private String city;
	private long pinCode;

//	public Dictionary(String city, long pinCode) {
//		this.city = city;
//		this.pinCode = pinCode;
//	  }
	
	
	public void setCity (String cityName) {
		this.city = cityName;
	}
	public String getCity () {
		return this.city;
	}
	
	public void setPinCode (long pinCode) {
		this.pinCode = pinCode;
	}
	public long getPinCode () {
		return this.pinCode;
	}
	//@Override
	public int compareTo(Object arg0) {
      Dictionary dic = (Dictionary) arg0;
      
      if (this.getPinCode() == dic.getPinCode()) {
    	  return 0;
      }
      else if (this.getPinCode() < dic.getPinCode()) {
    	  return -1;
      }
      else {
    	  return 1;
      }

	}
	


}
