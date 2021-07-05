## Texas Hold'em
 

- 3张牌，牌型大小判断
    - rank1 豹子（AAA最大，222最小）。三张牌一样
    - rank2 同花顺（AKQ最大，A23最小）。相同花色+顺子
    - rank3 同花（AKJ最大，352最小）。w
    - rank4 顺子（AKQ最大，A23最小）。
    - rank5 对子（AAK最大，223最小）。两张牌一样
    - rank6 单张（AKJ最大，352最小）。
  

 - 牌型 2 3 4 5 6 7 8 9 10 11 12 13 14
 - 牌型 2 3 4 5 6 7 8 9 10 J  Q  K  A

 #### 花色 黑桃1 红桃2 方块3 梅花4
  

### 输入:1个数组，有三张牌
  

 - 测试用例：
    - int [] intA[] ={{14,1},{14,2},{14,3}};  // 豹子
    - int [] intA[] ={{14,1},{13,1},{12,1}};  // 同花顺
    - int [] intA[] ={{14,1},{12,1},{10,1}};  // 同花
    - int [] intA[] ={{14,1},{13,2},{12,3}};  // 顺子
    - int [] intA[] ={{14,1},{14,2},{10,3}};  // 对子
    - int [] intA[] ={{6,1},{6,2},{7,3}};     // 对子
    - int [] intA[] ={{2,1},{3,2},{5,3}};     // 单张

 - 测试用例：
    - li =[(14,1),(14,2),(14,3)];  // 豹子
    - li =[(14,1),(13,1),(12,1)];  // 同花顺
    - li =[(14,1),(12,1),(10,1)];  // 同花
    - li =[(14,1),(13,2),(12,3)];  // 顺子
    - li =[(14,1),(14,2),(10,3)};  // 对子
    - li =[(6,1),(6,2),(7,3)];     // 对子
    - li =[(2,1),(3,2),(5,3)];     // 单张

题目扩展:
1) 能区分出豹子，顺子，单张
2) 同样是豹子，比较大小
3) 将牌型变为5张，提升coding复杂度，用德扑的规则比较
4) 可以考察functional programming函数式编程的代码技巧
5) 如果比牌频次比较高，是否考虑计算排列组合数 52 * 51 * 50/6, 用字典存