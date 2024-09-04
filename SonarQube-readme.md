## SonarQube

SonarQube is a popular tool for continuous inspection of code quality, providing a range of reports to help developers improve their code. The different types of reports SonarQube generates include:

### 1. **Issues Report**
   - **Description**: This report highlights specific problems in the code, categorized as Bugs, Vulnerabilities, Code Smells, or Security Hotspots.
   - **Example**: 
     - **Bugs**: Issues that will affect the behavior of the application. E.g., a null pointer dereference.
     - **Vulnerabilities**: Security-related issues, such as SQL injection risks.
     - **Code Smells**: Maintainability issues, like duplicate code or overly complex methods.
     - **Security Hotspots**: Areas of code that require manual review to ensure they are secure.

### 2. **Duplications Report**
   - **Description**: This report identifies duplicated code in the project, which can lead to maintenance challenges.
   - **Example**: 
     - If the same logic or method is repeated across multiple files, SonarQube will flag this as code duplication.

### 3. **Code Coverage Report**
   - **Description**: Shows the percentage of code covered by automated tests. This is crucial for ensuring that the code is tested adequately.
   - **Example**: 
     - If a project has 75% code coverage, it means that 75% of the code is executed during the test runs.

### 4. **Complexity Report**
   - **Description**: Provides metrics related to the complexity of the codebase, including Cyclomatic Complexity.
   - **Example**: 
     - A method with a Cyclomatic Complexity of 20 is considered more complex and harder to understand than one with a complexity of 3.

### 5. **Quality Gate Report**
   - **Description**: A summary of whether the project passes or fails the quality gate criteria, which is a set of conditions defined in SonarQube.
   - **Example**: 
     - A project might fail the quality gate if the number of critical vulnerabilities exceeds a certain threshold.

### 6. **Security Reports**
   - **Description**: Focuses specifically on security-related issues, providing insights into vulnerabilities, potential exploit points, and compliance with security standards.
   - **Example**: 
     - Detection of hardcoded credentials in the code or improper use of encryption algorithms.

### 7. **Technical Debt Report**
   - **Description**: Estimates the effort required to fix all the maintainability issues (code smells) in the codebase.
   - **Example**: 
     - If a project has 5 days of technical debt, it means it would take an estimated 5 days to fix all the maintainability issues.

### 8. **Maintainability Report**
   - **Description**: Provides metrics on how easy it is to maintain the code. This often includes issues like code smells and potential areas that could become problematic.
   - **Example**: 
     - If a method is very large and has multiple responsibilities, it will be flagged as a maintainability concern.

### 9. **Reliability Report**
   - **Description**: Focuses on the likelihood of the application behaving as expected without failures.
   - **Example**: 
     - Critical bugs that can cause application crashes or erroneous behavior are highlighted in this report.

### 10. **Portability Report**
   - **Description**: Highlights issues related to the portability of the code across different environments.
   - **Example**: 
     - Hardcoded file paths that work on one operating system but not on others.


## Code Quality Check with SonarQube
----------------------

Download From
----------------
Version compatible with JDK 11 :
-------------------------------
https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-8.9.10.61524.zip


Steps :
--------

1. Download SonarQube

1. Extract and Run StartSonar.bat

1. Visit localhost:9000 and change the security settings

1. Make the following changes

![image](https://i.ibb.co/mCy9stc/sonar-s1.png)

![image](https://i.ibb.co/nsjkffD/sonar-s2.png)

##### Maven Configuration
- Add the following dependencies and plugins to your maven project

###### pom.xml

```xml

	<properties>
		<maven.compiler.source>11</maven.compiler.source>
		<maven.compiler.target>11</maven.compiler.target>

		<!-- JaCoCo Properties -->
		<jacoco.version>0.8.6</jacoco.version>
		<sonar.java.coveragePlugin>jacoco</sonar.java.coveragePlugin>
		<sonar.dynamicAnalysis>reuseReports</sonar.dynamicAnalysis>
		<sonar.coverage.jacoco.xmlReportPaths>${project.basedir}/../target/jacoco.exec</sonar.coverage.jacoco.xmlReportPaths>
		<sonar.language>java</sonar.language>

	</properties>


	<dependencies>

		<dependency>
			<groupId>org.jacoco</groupId>
			<artifactId>jacoco-maven-plugin</artifactId>
			<version>0.8.8</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/org.sonarsource.scanner.maven/sonar-maven-plugin -->
		<dependency>
			<groupId>org.sonarsource.scanner.maven</groupId>
			<artifactId>sonar-maven-plugin</artifactId>
			<version>3.9.1.2184</version>
		</dependency>



		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-api</artifactId>
			<version>5.8.2</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.8.2</version>
			<scope>test</scope>
		</dependency>




	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<version>${jacoco.version}</version>
				<executions>
					<execution>
						<id>jacoco-initialize</id>
						<goals>
							<goal>prepare-agent</goal>
						</goals>
					</execution>
					<execution>
						<id>jacoco-site</id>
						<phase>package</phase>
						<goals>
							<goal>report</goal>
						</goals>
					</execution>
				</executions>
			</plugin>
			<plugin>
				<groupId>org.jacoco</groupId>
				<artifactId>jacoco-maven-plugin</artifactId>
				<executions>
					<execution>
						<id>report</id>
						<goals>
							<goal>report-aggregate</goal>
						</goals>
						<phase>verify</phase>
					</execution>
				</executions>
			</plugin>

			<plugin>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>2.19</version>
				<dependencies>
					<dependency>
						<groupId>org.junit.platform</groupId>
						<artifactId>junit-platform-surefire-provider</artifactId>
						<version>1.0.0</version>
					</dependency>
				</dependencies>
			</plugin>
		</plugins>
	</build>

```



Run your project as Maven Build with goal
---------------------------------------
clean verify sonar:sonar

Visit localhost:9000

