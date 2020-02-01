# kotlin-ktor-bootstrap

Clone this repository to have Kotlin + Ktor + Gradle up and running in no time!

## Tool Versions

| Tool   | Version | Notes                                                                                          |
| ------ | ------- | ---------------------------------------------------------------------------------------------- |
| Kotlin | 1.3.61  |                                                                                                |
| Gradle | 6.0.1   | Use the wrapper -- no need to install locally                                                  |
| Ktor   | 1.3.0   | |                                                                                        |

## Usage

The following instructions are for command line interaction. IntelliJ has tight integration with Gradle if you prefer the GUI.

### Compile

From the project root run: `./gradlew build`

### Run

From the project root run:

```bash
$ ./gradlew run
```

You can now hit `http://localhost:8080/health` and receive an HTTP 200 response.
