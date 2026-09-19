package CustomArrayList;

import java.util.Objects;

public class ListArray<E> {

	private Object[] arr;
	private int size;
	private final int INITIAL_CAP = 10;

	public ListArray() {
		arr = new Object[INITIAL_CAP];
	}

	public ListArray(int intialcap) {
		arr = new Object[intialcap];
	}

	public ListArray(ListArray<E> lr){
    	size = lr.size;
    	arr = new Object[size];
    	for(int i = 0; i < size; i++) {
    		arr[i] = lr.arr[i];
    	}
    	
    }


	public boolean add(E ele) {

		if (size < arr.length) {
			arr[size] = ele;
		} else {
			grow();
			arr[size] = ele;
		}

		size++;

		return true;
	}

	private void grow() {

		Object[] newArr = new Object[(int) (arr.length + (arr.length * 0.5))];

		for (int i = 0; i < size; i++) {
			newArr[i] = arr[i];
		}

		arr = newArr;
	}

	public void add(int index, E ele) {

		if (index >= 0 && index <= size) {

			if (size + 1 < arr.length) {

				for (int i = size; i > index; i--) {
					arr[i] = arr[i - 1];
				}

				arr[index] = ele;
				size++;

			} else {

				grow();

				for (int i = size; i > index; i--) {
					arr[i] = arr[i - 1];
				}

				arr[index] = ele;
				size++;
			}

		} else {

			throw new IndexOutOfBoundsException("Index not in range!");
		}
	}

	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < size; i++) {

			if (i < size - 1) {
				s.append(arr[i] + ", ");
			} else {
				s.append(arr[i]);
			}
		}

		s.append("]");
 
		return new String(s);
	}

	public int size() {

		return size;
	}

	public boolean remove(E o) {

		if (o == null) {

			int index = 0;

			for (; index < size; index++) {

				if (arr[index] == null) {
					break;
				}
			}

			remove(index);

			return true;

		} else {

			int index = 0;

			for (; index < size; index++) {

				if (o.equals(arr[index])) {
					break;
				}
			}

			if (index < size) {

				remove(index);

				return true;
			}

			return false;
		}
	}

	public Object remove(int index) {

		if (!isEmpty() && index < size) {

			Object ele = arr[index];

			for (int i = index; i < size - 1; i++) {
				arr[i] = arr[i + 1];
			}

			arr[size - 1] = null;

			size--;

			return ele;
		}

		return null;
	}

	public boolean removeAll(ListArray<E> list) {

		if (list != null) {

			boolean flag = false;

			for (int i = 0; i < list.size; i++) {

				if (remove(list.get(i))) {
					flag = true;
				}
			}

			return flag;
		}

		return false;
	}

	public boolean isEmpty() {

		return size == 0;
	}

	public boolean equals(Object o) {

		if (o != null) {

			ListArray<E> temp = (ListArray<E>) o;

			if (temp instanceof ListArray<E>) {

				if (this.size == temp.size) {

					for (int i = 0; i < size; i++) {

						if (!this.arr[i].equals(temp.arr[i])) {
							return false;
						}
					}

					return true;
				}
			}
		}

		return false;
	}

	public int hashCode() {

		return Objects.hash(arr);
	}

	public int indexOf(E ele) {

		for (int i = 0; i < size; i++) {

			if (arr[i].equals(ele)) {
				return i;
			}
		}

		return -1;
	}

	public boolean contains(E ele) {

		return indexOf(ele) >= 0;
	}

	public boolean addAll(ListArray<E> list) {

		for (int i = 0; i < list.size; i++) {
			add(list.get(i));
		}

		return true;
	}

	public E get(int index) {

		if (index >= 0 && index < size) {
			return (E) arr[index];
		}

		throw new IndexOutOfBoundsException("Index out of range!");
	}

	public boolean retainAll(ListArray<E> list) {

		if (list != null) {

			boolean flag = false;

			for (int i = 0; i < this.size;) {

				if (!list.contains(get(i))) {

					remove(get(i));

					flag = true;

				} else {

					i++;
				}
			}

			return flag;
		}

		return false;
	}

	public void clear() {

		arr = new Object[arr.length];

		size = 0;
	}
}