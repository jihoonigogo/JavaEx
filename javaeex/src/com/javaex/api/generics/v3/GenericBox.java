package com.javaex.api.generics.v3;


// 제네릭은 설계 시 내부타입을 지정하지 않음
// 인스턴스화 할때 데이터 타입을 지정해준다. (T) 식으로

public class GenericBox<T>	 { // <템플릿문자>

		private T content;

		public T getContent() {
			return content;
		}

		public void setContent(T content) {
			this.content = content;
		}
		
		
}
