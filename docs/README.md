# 크리스마스 프로모션🎅🏻❄️🎁

<img src="/image.png" width="600" height="400"/>

---
## 🎄12월 이벤트 목록

### 크리스마스 디데이 할인🛷
- 이벤트 기간 : 2023.12.1 ~ 2023.12.25
- 12월 1일 1,000원 할인으로 시작해서, 크리스마스까지 매일 100원씩 할인 금액 증가(25일 3400원 할인)
- 총주문 금액에 할인이 적용됩니다.

### 평일 할인🍰
- 이벤트 기간 : 12월 매주 일요일 ~ 목요일
- 디저트 메뉴🍰 1개당 2,023원 할인
### 주말 할인🍝
- 이벤트 기간 : 12월 매주 금요일, 토요일
- 메인 메뉴🍝 1개당 2,023원 할인
### 특별 할인⭐
- 이벤트 기간 : 12월 내내
- 이벤트 달력에 별⭐이 그려져 있으면 총주문 금액에서 1,000원 할인
### 증정 이벤트🍾
- 이벤트 기간 : 12월 내내
- 할인 전 총주문 금액이 12만원 이상이면 샴페인🍾 1개 증정!

---
## 🍴12월 이벤트 메뉴 

><애피타이저>  
양송이수프(6,000), 타파스(5,500), 시저샐러드(8,000)

><메인>  
티본스테이크(55,000), 바비큐립(54,000), 해산물파스타(35,000), 크리스마스파스타(25,000)

><디저트>  
초코케이크(15,000), 아이스크림(5,000)

><음료>  
제로콜라(3,000), 레드와인(60,000), 샴페인(25,000)

---
## 12월 이벤트 배지 증정!⭐🎄🎅
- 구매 금액 5,000원 이상 : ⭐ 배지 증정
- 구매 금액 10,000원 이상 : 🎄 배지 증정
- 구매 금액 20,000원 이상 : 🎅 배지 증정
### 🤩 `12월 이벤트 배지를 갖고계시면 새해 이벤트 선물🎁 증정!`

---

## ❗이벤트 주의 사항
- 총주문 금액 10,000원 이상부터 이벤트가 적용됩니다.
- 음료만 주문 시, 주문할 수 없습니다.
- 메뉴는 한번에 최대 20개까지만 주문할 수 있습니다.
---

## ▶️프로그램 예시

### 📅1. 날짜를 입력한다.
`안녕하세요! 우테코 식당 12월 이벤트 플래너입니다.`  
`12월 중 식당 예상 방문 날짜는 언제인가요? (숫자만 입력해 주세요!)`  
입력 : 25 

>⛔ `1이상 31이하의 숫자`가 아닌경우  
`"[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요."` 메세지가 출력됩니다.

### 🗒️2. 주문할 메뉴를 입력한다.
`주문하실 메뉴를 메뉴와 개수를 알려 주세요. (e.g. 해산물파스타-2,레드와인-1,초코케이크-1)`  
입력 : 티본스테이크-1,바비큐립-1,양송이수프-3,시저샐러드-1,크리스마스파스타-1,제로콜라-1,레드와인-1,초코케이크-1,아이스크림-1

>⛔ `메뉴판에 없는 메뉴`를 입력하는 경우  
⛔ `주문의 형식(메뉴이름-개수)`이 예시와 다른 경우  
⛔ `메뉴의 개수가 1이상의 숫자`가 아닌경우  
⛔ `중복된 메뉴`를 입력한 경우 (e.g. 티본스테이크-1,티본스테이크-1)  
⛔ `메뉴의 총 개수`가 20개가 넘는 경우  
⛔ `음료`만 주문한 경우  
`"[ERROR] 유효하지 않은 주문입니다. 다시 입력해 주세요."` 메세지가 출력됩니다.

### 🔔3.출력 예시
>12월 25일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!  
> 
><주문 메뉴>  
티본스테이크 1개  
바비큐립 1개  
양송이수프 3개  
시저샐러드 1개  
크리스마스파스타 1개  
제로콜라 1개  
레드와인 1개  
초코케이크 1개  
아이스크림 1개  
> 
><할인 전 총주문 금액>  
243,000원
>
><증정 메뉴>  
샴페인 1개
>
><혜택 내역>  
크리스마스 디데이 할인: -3,400원  
평일 할인: -4,046원  
특별 할인: -1,000원  
증정 이벤트: -25,000원  
>
><총혜택 금액>  
-33,446원
>
><할인 후 예상 결제 금액>  
234,554원  
>
><12월 이벤트 배지>  
산타

---

## ✅ 프로그램 기능 목록

---
### 이벤트 플래너
- [x] 입력 받은 메뉴를 (메뉴이름, 갯수) 형태로 바꾼다
- [x] 입력 받은 메뉴의 할인 전 총주문 금액을 구한다
- [x] 2023.12.1 ~ 2023.12.25 까지 크리스마스 디데이 할인을 적용한다.  
금액은 1000원부터 시작해서 크리스마스 까지 100원씩 증가한다.
- [x] 평일에는 디저트 메뉴를 1개당 2023원 할인한다.
- [x] 주말에는 메인 메뉴를 1개당 2023원 할인한다.
- [x] 이벤트 달력에 별이 있으면 총 주문 금액에서 1000원 할인한다.
- [x] 증정 이벤트를 적용한다. 할인 전 총 주문 금액이 12만원 이상이면 샴페인 1개 증정한다.
- [x] 총혜택 금액에 따라 이벤트 배지를 부여한다.
- 5천원 이상 : 별
- 1만원 이상 : 트리
- 2만원 이상 : 산타
- [x] 총주문 금액이 10,000원 이상일때만 이벤트를 적용한다
- [x] 음료만 주문 시, 주문을 받지 않는다.
- [x] 메뉴 갯수를 최대 20개까지로 제한한다.
### 메뉴
- [x] 입력 받은 메뉴의 가격을 알려준다
- [x] 입력 받은 메뉴의 카테고리를 알려준다
- [x] 메뉴 이름과 수량을 입력하면 총 금액을 반환한다.
### 달력
- [x] 입력받은 날짜가 평일인지 주말인지 계산한다.
- [x] 요일을 알려주면 해당하는 요일이 있는 날짜를 반환한다.
- [x] 이벤트 달력에 별이 있는 날짜를 찾는다.
  - [x] 입력 받은 날짜에 별이 있으면 true, 없으면 false를 반환한다.
- [x] 날짜를 입력받으면 해당 일의 날짜 관련 이벤트(평일,주말 할인, 크리스마스 디데이 할인, 특별 할인)를 모두 반환한다.
### 입력
- [x] 12월 식당 예상 방문 날짜를 입력받는다.
- [x] 주문할 메뉴와 갯수를 입력받는다.
### 출력
- [x] 사용자가 주문한 메뉴를 취합하여 출력한다.
- [x] 할인 전 총 주문 금액을 출력한다.
- [x] 증정 메뉴를 출력한다.
- [x] 혜택 내역을 출력한다.
- [x] 총혜택 금액을 출력한다.
- [x] 할인 후 예상 결제 금액을 출력한다.
- [x] 12월 이벤트 배지를 출력한다.
### 예외처리
- [x] "메뉴이름(한글)-숫자" 형식이 아닐경우 예외처리 한다.
- [x] 메뉴 갯수가 1 ~ 20의 범위가 아니면 예외처리 한다.
- [x] 메뉴에 없는 메뉴를 주문하면 예외처리 한다.
- [x] 메뉴를 중복으로 입력하면 예외처리 한다.