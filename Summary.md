# ����
### 1. �ڷ� ���� ( Array and Collection )
### 1.1 Array, Set, List ��ȯ 
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
Set, List �� ���빰 ��ü�� �񱳷� equals �� �Ǵ��ϹǷ� ( List�� ��� ���� ���� )
�ߺ� ���� � �״�� ��� ���� 

### 2. ���ڿ� (String ) 
### 2.1 String.join 
String List, Array ���� foreach ������� �ʰ� concat �� ���� 

```
String.join( "���̿� �߰��� ����" , List or Array );
```

### 2.2 CharArray to String 
new String(arr) �� �ٷ� ���� ����
