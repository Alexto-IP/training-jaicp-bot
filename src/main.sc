require: slotfilling/slotFilling.sc
  module = sys.zb-common

theme: /

    state: /hello
        intent!: /hello
        a: Привет! Рад тебя видеть 👋 Чем могу помочь?

    state: /weather
        intent!: /weather
        a: Хочешь узнать прогноз погоды? В каком городе?

    state: /currency
        intent!: /currency
        a: Интересует курс валют? Какая валюта (USD, EUR и т.д.)?

    state: /NoMatch
        event!: noMatch
        a: Извини, не понял. Попробуй сказать: привет, погода или курс валют.

    state: Start
        q!: $regex</start>
        a: Привет! Я простой бот. Могу рассказать про погоду и курсы валют.