# coronavirus-tracker-app
Coronavirus tracker application using Spring boot Java app

# Coronavirus Tracker App

![Coronavirus Tracker](https://via.placeholder.com/1200x400.png?text=Coronavirus+Tracker+App)

A web application built to track COVID-19 cases globally. It displays live data about confirmed cases, recoveries, and deaths, allowing users to stay informed during the pandemic.

## Features

- **Global Statistics**: Displays real-time statistics of confirmed cases, recoveries, and deaths worldwide.
- **Country-Specific Data**: Users can view COVID-19 data specific to their country.
- **Graphical Representation**: Charts and graphs to visualize trends in COVID-19 cases.
- **Data Refresh**: Automatically updates data to keep it up-to-date.
- **Responsive Design**: Fully responsive for seamless use on mobile, tablet, and desktop devices.


## Technologies Used

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java, Spring Boot
- **Database**: MySQL
- **API Integration**: COVID-19 API (e.g., [Disease.sh](https://disease.sh/))
- **Build Tool**: Maven
- **Version Control**: Git

## Installation and Setup

To run this project locally, follow these steps:

### Prerequisites

- Java 11 or higher
- Maven
- MySQL Database
- Git

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/kelvinsnir/coronavirus-tracker-app.git
   cd coronavirus-tracker-app
   ```

2. Configure the database:
   - Create a MySQL database named `covid_tracker` (or any preferred name).
   - Update the database connection details in `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/covid_tracker
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

5. Access the app:
   - Open your browser and go to `http://localhost:8080`.

## Project Structure

```
coronavirus-tracker-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/coronavirustracker
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── service/
│   │   │       └── CoronavirusTrackerApplication.java
│   │   ├── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
├── pom.xml
└── README.md
```

## API Reference

This application uses external APIs to fetch real-time COVID-19 data. Ensure you have configured the API endpoint in your `application.properties`:

```properties
covid.api.url=https://disease.sh/v3/covid-19/
```

### Sample API Endpoints

- Global data: `/all`
- Country-specific data: `/countries/{country}`

## Contributing

Contributions are welcome! Here's how you can get involved:

1. Fork the repository.
2. Create a new branch for your feature: `git checkout -b feature-name`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature-name`
5. Open a pull request.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [Disease.sh API](https://disease.sh/) for COVID-19 data.
- Open-source community for providing amazing tools and libraries.

---

If you found this project helpful or inspiring, don't forget to ⭐ the repository!

