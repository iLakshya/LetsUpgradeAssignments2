/* eslint-disable no-unused-vars */
// eslint-disable-next-line no-undef
class Weather extends React.Component {
    state = {
      weather: null,
    };
  
    componentDidMount() {
      this.weatherAPI.getWeather(this.props.city).then((response) => {
        this.setState({
          weather: response.data,
        });
      });
    }
  
    render() {
      const { weather } = this.state;
  
      if (!weather) {
        return <div>Loading...</div>;
      }
  
      return (
        <div>
          <h1>Current Weather Conditions</h1>
          <p>
            Temperature: {weather.main.temp}°C
          </p>
          <p>
            Humidity: {weather.main.humidity}%
          </p>
          <p>
            Wind Speed: {weather.wind.speed} m/s
          </p>
          <p>
            Description: {weather.weather[0].description}
          </p>
        </div>
      );
    }
  }  