dependencies {
  implementation(project(":common"))
  implementation("org.springframework.boot:spring-boot-starter-web")
  implementation("org.springframework.boot:spring-boot-starter-webflux")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
  implementation("org.flywaydb:flyway-core")
  runtimeOnly("mysql:mysql-connector-java")
  testImplementation("io.projectreactor:reactor-test")
}