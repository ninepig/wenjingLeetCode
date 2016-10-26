package wenjing.interview.cc150.dataStructrueAndSorting;

public class ZipHashMap {

	//eacg entry in the table is a linked list, by using the next !
	transient Entry[] table;
	int modCount = 0;
	
	/*
	 * when we do the put operation
	 * int hash = key.hashCode();
	 * int index = hash%table.length; 
	 * Entry[index] = value;
	 * 
	 * 
	 * when we do put , the new coming one will always be the first of the entry linked list
	 * a first come . b.next = a ; entry[index] = b;
	 * if a value is equal b's . b will replace a
	 * hash �жϵ�ʱ�� һ�ǱȽ����ǵ�key��hashcode�Ƿ���ͬ�����ǱȽ������Ƿ�һ����Ҫ��equal����==��
	 */
	
	//�� boolean�᲻����á���
	public String put(String key, String value){
		if(key == null){
			
			return putFullNullKey(value);
		}
		//better to have your own hash to do hash(key.hashcode())
		int hash = key.hashCode();
		int i = indexFor(hash,table.length);
		
		for(Entry e = table[i];e!=null;e=e.next){
			Object k;
			if(e.hashCode == hash&& (e.key == key||key.equals(e.key))){
				String oldValue = e.value;
				e.value = value;
				//��¼����Ƿ�����������Ƿ񱻷��ʹ�
				e.recordAccess(this);
				return oldValue;
			}
		}
		modCount++;
		addEntry(hash,key,value,i);
		return null;
	}
	
	
	private void addEntry(int hash, String key, String value, int bucketIndex) {
		// TODO Auto-generated method stub
		
		Entry e = table[bucketIndex];
		// e �������table[bucketIndex]�����e��entry.next
		table[bucketIndex] = new Entry(hash,key,value,e);
		
		//dynamic resize the hash table��ȻHashMap����Ҳ����һЩ�Ż������ʵ�֣�����Ҳ˵һ�¡����磺Entry[]�ĳ���һ��������map�������ݵ�Խ��Խ��������ͬһ��index�����ͻ�ܳ����᲻��Ӱ�����ܣ�HashMap��������һ�����ӣ�����map��sizeԽ��Խ��Entry[]����һ���Ĺ���ӳ�����
//		if(size++>=threshold){
//			resize(2*table.length);
//		}
	}


	static int indexFor(int h, int length) {
        return h & (length-1);
    }
	
	//better to do hash(key.hashcode())
	public String get(String key){
		
		if(key == null){
			return getForNullKey();
		}
		int hash  = key.hashCode();
		int index = indexFor(hash, table.length);
		
		for(Entry e = table[index]; e!=null ;e =e.next){
			
			String k = e.key;
			if(e.hashCode == hash&&(e.key == key)||key.equals(k)){
				
				return e.value;
			}
			
		}
		return null;
		
		
	}
	
	
	
	
	



	private String getForNullKey() {
		// TODO Auto-generated method stub
		for(Entry e = table[0];e!=null;e=e.next){
			if(e.key == null){
				return e.value;
				
			}
		}
		return null;
	}


	// null key always be at the table[0]
	private String putFullNullKey(String value) {
		// TODO Auto-generated method stub
		for(Entry e = table[0];e!=null;e=e.next){
			if(e.key == null){
				String oldValue = e.value;
				e.value = value;
				e.recordAccess(this);
				return oldValue;
				
			}
		}
		modCount++;
		addEntry(0, null, value, 0);
		
		return null;
	}












	/*
	 * when we do the get operation
	 * int hash = key.hashCode();
	 * int index = hash&Entry[].length;
	 * return Entry[index]
	 */
	
	
	
	
	
	
	
	
	
	
	
	public class Entry{
		
		String key;
		String value;
		Entry next;
		int hashCode;
		public Entry(int hash, String key2, String value2, Entry nextEntry) {
			// TODO Auto-generated constructor stub
		}
		public void recordAccess(ZipHashMap zipHashMap) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	
	
}
