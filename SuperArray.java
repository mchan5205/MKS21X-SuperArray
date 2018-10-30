public class SuperArray{
	private String[] data;
	private int size;
	public SuperArray(){
		data = new String[10];
		size = 0;
	}
	public SuperArray(int startingCapacity){
		if (startingCapacity < 0){
			throw new IllegalArgumentException();
		}
		data = new String[startingCapacity];
		size = 0;
	}
	public void clear(){
		String[] newarray = new String[data.length];
		data = newarray;
		size = 0;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public boolean add(String a){
		if (data.length == size()){
			resize();
		}
		data[size] = a;
		size += 1;
		return true;
	}
	public String toString(){
		String newstring = "[";
		for (int i = 0; i < size; i += 1){
			newstring = newstring + data[i];
			if (i < size - 1){
				newstring = newstring + ", ";
			}
		}
		newstring += "]";
		return newstring;
	}
	public String toStringDebug(){
		String newstring = "[";
		for (int i = 0; i < data.length; i += 1){
			newstring += data[i];
			if (i < data.length - 1){
				newstring += ", ";
			}
		}
		newstring += "]";
		return newstring;
	}
	public String get(int i){
		if (i < 0 || i >= size()){
			throw new IndexOutOfBoundsException();
		}
		else{
			return data[i];
		}
	}
	public String set(int i, String a){
		if (i < 0 || i >= size()){
			throw new IndexOutOfBoundsException();
		}
		else{
			String oldstring = data[i];
			data[i] = a;
			return oldstring;
		}
	}
	private void resize(){
		String[] newarray = new String[size() * 2 + 1];
		for (int i = 0; i < size(); i +=1){
			newarray[i] = data[i];
		}
		data = newarray;
	}
	public boolean contains(String target){
		for (int i  = 0; i < size(); i += 1){
			if (data[i].equals(target)){
				return true;
			}
		}
		return false;
	}
	public int indexOf(String target){
		for (int i = 0; i < size(); i += 1){
			if (data[i].equals(target)){
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(String target){
		int x = -1;
		for (int i = 0; i < size(); i += 1){
			if (data[i].equals(target)){
				x = i;
			}
		}
		return x;
	}
	public void add(int index, String element){
		if (index < 0 || index > size()){
			throw new IndexOutOfBoundsException();
		}
		else{
			if (data.length == size()){
				resize();
			}
			String[] newarray = new String[data.length];
			for (int i = 0; i < size() + 1; i += 1){
				if (i < index){
					newarray[i] = data[i];
				}
				if (i == index){
					newarray[i] = element;
				}
				if (i > index){
					newarray[i] = data[i - 1];
				}
			}
			data = newarray;
			size += 1;
		}
	}
	public String remove(int index){
		if (index < 0 || index >= size){
			throw new IndexOutOfBoundsException();
		}
		else{
			String removed = data[index];
			String[] newarray = new String[data.length];
			for (int i = 0; i < data.length; i += 1){
				if (i < index){
					newarray[i] = data[i];
				}
				if (i > index){
					newarray[i - 1] = data[i];
				}
			}
			data = newarray;
			size = size - 1;
			return removed;
		}
	}
	public boolean remove(String element){
		if (indexOf(element) == -1){
			return false;
		}
		else{
			remove(indexOf(element));
			return true;
		}
	}
}
