# 정리
### 1. 자료 구조 ( Array and Collection )
### 1.1 Array, Set, List 변환 
#### Array ---> List, Set 
```
Set<Integer> set = Arrays.stream(array).collect(Collectors.toSet());
List<Integer> list = Arrays.stream(array).collect(Collectors.toList());
```
- Stream??

#### List <----> Set 
```
Set<Integer> set = new HashSet<>(list);
List<Integer> list = new ArrayList<>(set);
```

### 1.2 Set, List equals
Set, List 는 내용물 자체의 비교로 equals 를 판단하므로 ( List의 경우 순서 포함 )
중복 제거 등에 그대로 사용 가능 

### 2. 문자열 (String ) 
### 2.1 String.join 
String List, Array 에서 foreach 사용하지 않고 concat 이 가능 

```
String.join( "사이에 추가할 문자" , List or Array );
```

### 2.2 CharArray to String 
new String(arr) 로 바로 생성 가능
