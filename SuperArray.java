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
			String oldstring = data[i];
			data[i] = String a;
			return oldstring;
		}
	}
	private void resize(){
		String[] newarray = new newarray[size() * 2];
		for (int i = 0; i < data.length; i +=1){
			newarray[i] = data[i];
		}
		data = newarray;
	}
	public boolean contains(String target){
		for (int i  = 0; i < data.length; i += 1){
			if (data[i].equals(target)){
				return true;
			}
		}
		return false;
	}
	public int indexOf(String target){
		for (int i = 0; i < data.length; i += 1){
			if (data[i].equals(target)){
				return i; 
			}
		}
		return -1;
	}
	public int lastIndexOf(String target)P
		int x = -1;
		for (int i = 0; i < data.length; i += 1){
			if (data[i].equals(target)){
				x = i;
			}
		}
		return x;
	}	
	public void add(int index, String element){
		if (index < 0 || index > size()){
			System.out.println("error index out of range");
		}
		else{
			String[] newarray = new newarray[data.length];
			for (int i = 0; i < newarray.length; i += 1){
				if (i < index){
					newarray[i] = data[i]
				}
				if (i = index){
					newarray[i] = element;
				}
				if (i > index){
					newarray[i + 1] = data[i]
				}
			}
			size += 1;
		}
	}
	public String remove(int index){
		if (index < 0 || index >= size){
			System.out.println("error index out of range");
			return null;
		}
		else{
			String removed = data[index];
			String[] newarray = new newarray[data.length];
			for (int i = 0; i < data.length; i += 1){
				if (i < index){
					newarray[i] = data[i];
				}
				if (i >= index){
					newarray[i] = data[i + 1];
				}
			}
			data = newarray;
			return removed;
		}
	}
}
