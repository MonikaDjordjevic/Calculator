package kalkulator;

public class DynamicStringArray {
	private String[] array;
	
	DynamicStringArray(){
		this.array = new String[0];
	}
	
	public void add(String v){
		String[] newarr = new String[this.array.length+1];
		for (int i=0; i<this.array.length; i++) {
			newarr[i] = this.array[i];
		}
		newarr[this.array.length] = v;
		this.array = newarr;
	}
	public String[] toArray(){
		return this.array.clone();
	}
	
	public String get(int i){
		return this.array[i];
	}
	public void set(int i, String v){
		this.array[i] = v;
	}
	public void remove(int in){
		String[] newarr = new String[this.array.length-1];
		int j=0;
		for (int i=0; i<this.array.length; i++) {
			if(i != in){
				newarr[j] = this.array[i];
				j++;
			}
		}
		this.array = newarr;
	}
}
