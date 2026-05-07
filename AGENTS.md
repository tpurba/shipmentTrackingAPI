# AGENTS.md

## Purpose
This file provides essential conventions, build/test commands, and project-specific notes for AI coding agents working on the shipment-tracker Spring Boot project.

---

### Build & Run
- **Build:** `./gradlew build`
- **Test:** `./gradlew test`
- **Run:** `./gradlew bootRun`
- **Java Version:** 17 (required)

---

### Project Structure & Conventions
- **Main package:** `com.takun.shipmenttracker`
- **Entry point:** `ShipmentTrackerApplication.java`
- **REST controllers:** Place in `src/main/java/com/takun/shipmenttracker/controller/`
- **Tests:** Use JUnit 5, place in `src/test/java/com/takun/shipmenttracker/`
- **Lombok:** Use for boilerplate reduction
- **DevTools:** Enabled for hot reload (development only)

---

### Pitfalls & Warnings

  - If you add JPA entities, configure the DataSource manually or re-enable auto-config.
- **Controller currently in wrong directory.**
  - Move `controller/HelloController.java` to `src/main/java/com/takun/shipmenttracker/controller/` and fix its package name.
- **Align all code to `com.takun.shipmenttracker.*` namespace.**

---

### Key Files
- [build.gradle](build.gradle): Gradle build config
- [src/main/java/com/takun/shipmenttracker/ShipmentTrackerApplication.java](src/main/java/com/takun/shipmenttracker/ShipmentTrackerApplication.java): Main class
- [src/main/resources/application.properties](src/main/resources/application.properties): App config

---

### Best Practices
- Use Gradle wrapper for all commands
- Write tests for new features
- Keep configuration minimal and explicit
- Link to documentation instead of duplicating it

---

For more details, see the project source files and configuration.
