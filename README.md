# ITFB

Теперь DeleteItem выбивает ошибку 500

Вот такой код работает в консоли браузера, но не срабатывает в Jmeter:
fetch("https://moscow.shop.megafon.ru/public-api/checkout/v2/order/34744625/basket/1/remove?clientId=8874675&cityId=1817", {
    method: "DELETE"})
