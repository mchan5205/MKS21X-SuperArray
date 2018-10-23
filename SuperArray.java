public class SuperArray{
	private String[] data;
	private int size;
	public SuperArray{
		data = new String[10];
		size = 0;
	}
	public void clear(){
		size = 0;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public boolean add(String a){
		data[size] = a;
		size += 1;
		return true;
	}
	public String toString(){
		String newstring = "[";
		for (int i = 0; i < size; i += 1){
			newstring += data[i];
			if (i < size - 1){
				newstring += ", "
			}
		}	
		newstring += "]";
		return newstring;
	}
	public String toStringDebug{
		String newstring = "[";
		for (int i = 0; i < data.length; i += 1){
			newstring += data[i];
			if (i < data.length - 1){
				newstring += ", "
			}
		}	
		newstring += "]";
		return newstring;
	public String get(int i){
		if (i < 0 || i >= size()){
			return null;
		}
		else{
			return data[i];
		}
	}
	public String set(int i, String a){
		if (i < 0 || i >= size()){
			return null;
		}
		else{
			data[i] = String a;
		}
	}
}
