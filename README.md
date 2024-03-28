<p align="center">
  <img src="https://raw.githubusercontent.com/PKief/vscode-material-icon-theme/ec559a9f6bfd399b82bb44393651661b08aaf7ba/icons/folder-markdown-open.svg" width="100" alt="project-logo">
</p>
<p align="center">
    <h1 align="center">MICROMETER-TRACING-DEMO</h1>
</p>
<p align="center">
    <em>Trace, monitor, and boost performance effortlessly!</em>
</p>
<p align="center">
	<img src="https://img.shields.io/github/last-commit/rahul-ojha-07/micrometer-tracing-demo?style=default&logo=git&logoColor=white&color=0080ff" alt="last-commit">
	<img src="https://img.shields.io/github/languages/top/rahul-ojha-07/micrometer-tracing-demo?style=default&color=0080ff" alt="repo-top-language">
	<img src="https://img.shields.io/github/languages/count/rahul-ojha-07/micrometer-tracing-demo?style=default&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
	<!-- default option, no dependency badges. -->
</p>

<br><!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary><br>

- [ Overview](#-overview)
- [ Features](#-features)
- [ Repository Structure](#-repository-structure)
- [ Modules](#-modules)
- [ Getting Started](#-getting-started)
  - [ Installation](#-installation)
  - [ Usage](#-usage)
  - [ Tests](#-tests)
- [ Project Roadmap](#-project-roadmap)
- [ Contributing](#-contributing)
- [ License](#-license)
- [ Acknowledgments](#-acknowledgments)
</details>
<hr>

##  Overview

The micrometer-tracing-demo project showcases the integration of Micrometer for enhanced performance monitoring and tracing in a Spring Boot application. It offers functionalities like scheduling tasks, logging, and endpoint handling to demonstrate observability features. By leveraging Micrometers capabilities, this project enables efficient tracking of performance metrics, method execution, and scheduled task monitoring, thereby enhancing overall application observability and troubleshooting ease.

---

##  Features

|    |   Feature         | Description |
|----|-------------------|---------------------------------------------------------------|
| ⚙️  | **Architecture**  | *The project follows a standard Spring Boot architecture with clearly defined components. It utilizes AOP for instrumentation and scheduling tasks for monitoring. The architecture enables easy extension and integration of monitoring tools.* |
| 🔩 | **Code Quality**  | *The codebase maintains consistent style and structure. It follows best practices for Java development, with clear naming conventions and well-organized code. Comments and documentation help understand the logic easily.* |
| 📄 | **Documentation** | *The project includes detailed comments and JavaDoc entries for classes and methods. The README provides setup instructions and usage guidelines, enhancing usability for developers. Documentation is thorough and helps newcomers onboard quickly.* |
| 🔌 | **Integrations**  | *Key integrations include Micrometer for monitoring and Spring Boot for application development. External dependencies include Maven for build automation. These integrations enhance performance monitoring and traceability of the application.* |
| 🧩 | **Modularity**    | *The codebase is modular and follows a separation of concerns. Components like controllers, schedulers, and aspects are well-segmented, promoting code reusability and maintainability. This modularity simplifies testing and future enhancements.* |
| ⚡️  | **Performance**   | *Efficiency and speed are optimized in the codebase. The project leverages Micrometer for monitoring performance metrics, enabling real-time insights into resource usage. The scheduling tasks are designed for optimal execution, balancing resource utilization effectively.* |
| 📦 | **Dependencies**  | *Key dependencies include Java for application development and Maven for build automation. Micrometer is crucial for monitoring application performance. The project minimizes external dependencies to maintain a lightweight and efficient codebase.* |

---

##  Repository Structure

```sh
└── micrometer-tracing-demo/
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    └── src
        ├── main
        └── test
```

---

##  Modules

<details closed><summary>.</summary>

| File                                                                                      | Summary                                                                                                                                                                                                                         |
| ---                                                                                       | ---                                                                                                                                                                                                                             |
| [mvnw](https://github.com/rahul-ojha-07/micrometer-tracing-demo/blob/master/mvnw)         | Enables Maven wrapper setup for project bootstrap and dependency retrieval. Dynamically downloads the maven-wrapper.jar if missing, establishing a consistent project setup and reducing manual dependency management overhead. |
| [mvnw.cmd](https://github.com/rahul-ojha-07/micrometer-tracing-demo/blob/master/mvnw.cmd) | Facilitates Maven setup by validating and initializing project directories, handling Java environments, and dynamically downloading dependencies when missing. It ensures a smooth project start-up and configuration.          |

</details>

<details closed><summary>src.test.java.in.rahulojha.micrometertracingdemo</summary>

| File                                                                                                                                                                                                           | Summary                                                                                           |
| ---                                                                                                                                                                                                            | ---                                                                                               |
| [MicrometerTracingDemoApplicationTests.java](https://github.com/rahul-ojha-07/micrometer-tracing-demo/blob/master/src/test/java/in/rahulojha/micrometertracingdemo/MicrometerTracingDemoApplicationTests.java) | Verifies Spring Boot application context loading by running tests with SpringBootTest annotation. |

</details>

<details closed><summary>src.main.java.in.rahulojha.micrometertracingdemo</summary>

| File                                                                                                                                                                                                 | Summary                                                                                                                                                                                                                                                                 |
| ---                                                                                                                                                                                                  | ---                                                                                                                                                                                                                                                                     |
| [MicrometerTracingDemoApplication.java](https://github.com/rahul-ojha-07/micrometer-tracing-demo/blob/master/src/main/java/in/rahulojha/micrometertracingdemo/MicrometerTracingDemoApplication.java) | Ensures microservice readiness** by bootstrapping the application and enabling scheduling. Part of the micrometer-tracing-demo repository architecture, this file facilitates Spring Boot's functionality for enhanced performance monitoring and tracing capabilities. |

</details>

<details closed><summary>src.main.java.in.rahulojha.micrometertracingdemo.aop</summary>

| File                                                                                                                                                                           | Summary                                                                                                                                                                                                                             |
| ---                                                                                                                                                                            | ---                                                                                                                                                                                                                                 |
| [ScheduledSpanAspect.java](https://github.com/rahul-ojha-07/micrometer-tracing-demo/blob/master/src/main/java/in/rahulojha/micrometertracingdemo/aop/ScheduledSpanAspect.java) | Enables wrapping scheduled tasks in spans for tracing with Micrometer, enhancing observability in the micrometer-tracing-demo repository. AOP aspect intercepts scheduled methods, creating spans with method names for monitoring. |

</details>

<details closed><summary>src.main.java.in.rahulojha.micrometertracingdemo.scheduler</summary>

| File                                                                                                                                                                     | Summary                                                                                                                                                                                                          |
| ---                                                                                                                                                                      | ---                                                                                                                                                                                                              |
| [DemoScheduler.java](https://github.com/rahul-ojha-07/micrometer-tracing-demo/blob/master/src/main/java/in/rahulojha/micrometertracingdemo/scheduler/DemoScheduler.java) | Implements a scheduled task with logging functionality in the Micrometer Tracing Demo repository. Executes a task every 30 seconds, displaying iterative progress messages with thread sleeps for demonstration. |

</details>

<details closed><summary>src.main.java.in.rahulojha.micrometertracingdemo.controller</summary>

| File                                                                                                                                                                        | Summary                                                                                                                                                                                                                                    |
| ---                                                                                                                                                                         | ---                                                                                                                                                                                                                                        |
| [DemoController.java](https://github.com/rahul-ojha-07/micrometer-tracing-demo/blob/master/src/main/java/in/rahulojha/micrometertracingdemo/controller/DemoController.java) | Demonstrate logging and endpoint for performance testing in the micrometer-tracing-demo. The code in DemoController.java handles requests to /test route, logging each iteration and inducing a waiting period for performance evaluation. |

</details>

---

##  Getting Started

**System Requirements:**

* **Java**: `version 17`

###  Installation

<h4>From <code>source</code></h4>

> 1. Clone the micrometer-tracing-demo repository:
>
> ```console
> $ git clone https://github.com/rahul-ojha-07/micrometer-tracing-demo
> ```
>
> 2. Change to the project directory:
> ```console
> $ cd micrometer-tracing-demo
> ```
>
> 3. Install the dependencies:
> ```console
> $ mvn clean install
> ```

###  Usage

<h4>From <code>source</code></h4>

> Run micrometer-tracing-demo using the command below:
> ```console
> $ java -jar target/myapp.jar
> ```

###  Tests

> Run the test suite using the command below:
> ```console
> $ mvn test
> ```

---
