## 纸牌判断类问题


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
  

#### 输入:1个数组，有三张牌

1. junit[测试集入口](https://github.com/Feral-Jas/texas-holdem/blob/master/src/test/java/TestRunner.java)
