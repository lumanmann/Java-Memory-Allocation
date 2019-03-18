# 變數在記憶體中的配置狀況

- 本專案共有四個 Java 檔
- IDE: Net Bean
- 執行結果：
![](https://i.imgur.com/raKiUPj.png)

## REPO中的程式在記憶體中的分配
#### 一個大概:
![](https://i.imgur.com/2Gga4T9.png)

## Java變數在記憶體中的配置
變數會佔用記憶體，記憶體分三個部份來存這些變數，分別是global、stack與heap。

## Stack 和 Heap的區別

### Stack 
- 用於靜態記憶體配置
- 長度及生命週期都為可知 (程式碼區塊執行完就扔掉)
- 運算速度快
### 
- 優點:存取速度比 Heap還快
- 缺點:所存的數據大小、生命週期都要固定，缺乏靈活性
### Heap 
- 用於動態記憶體配置
- Garbage Collection 機制會自動去清理 Heap 內已經沒有被參考的資料
### 
- 優勢:動態分配內存大小，生命週期不用告訴編譯器
- 缺點:運行時要動態分配內存所以運行速度較慢
- 靈活但運算較耗時
## Java 中的資料型態
分為兩種：

1. Primitive Type 基本型態
- 共有 8 種：int、short、long、byte、float、double、boolean、char
- 這種類型是通過如 int a = 3; long b = 123L;的方式宣告
- 在 Stack 存值

2. Class Type 參考型態
- 其他大都屬於此類別，如 Integer、String以及自行定義的類別。
- 這種類型通常都需要用 new 去創建
- 因為是在執行時才動態創建，所以長度及生命週期都不可預知(GC自動清理)
- 在 Stack 存 reference
- 在 Heap 存實例 

## GOOD REF
https://blog.marksylee.com/2016/09/14/java-interview-02-jvm-stack-heap/
