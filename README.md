# ITFB

Теперь DeleteItem выбивает ошибку 500

Вот такой код работает в консоли браузера, но не срабатывает в Jmeter:
fetch("https://moscow.shop.megafon.ru/public-api/checkout/v2/order/ITEM-ID/basket/ITEM-POSITION/remove?clientId=CLIENT-ID&cityId=1817", {
    method: "DELETE"})
