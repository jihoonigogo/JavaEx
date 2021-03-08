package com.javaex.api.generics.v2;


// 제네릭은 설계 시 내부타입을 지정하지 않음
// 인스턴스화 할때 데이터 타입을 지정해준다. (T) 식으로
// T: type 
// R : Return Type
// K : Key
// V : Value 등 다양한 형태 가능 .

public class GenericBox<K,V>	 { // 내부에서 사용할시 key와 Value 타입을 미정으로 설계
		K key;
		V content; // 데이터타입은 나중에 정의
		public K getKey() {
			return key;
		}
		public void setKey(K key) {
			this.key = key;
		}
		public V getContent() {
			return content;
		}
		public void setContent(V content) {
			this.content = content;
		}
		
		
		
}
