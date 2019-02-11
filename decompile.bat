@ECHO
call gradlew.bat setupDecompWorkspace
call gradlew.bat eclipse --refresh-dependencies
PAUSE