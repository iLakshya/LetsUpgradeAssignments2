/* eslint-disable no-unused-vars */
class WeatherAPI {
    constructor(apiKey) {
      this.apiKey = apiKey;
    }
    getWeather(city) {
      return axios.get(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${this.apiKey}`);
    }
  }