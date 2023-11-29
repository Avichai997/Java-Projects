to export ZIP using CMD:
powershell -Command "$projectDirectory=\"$PWD\"; $zipFileName='Tirgul_JAVA.zip'; Compress-Archive -Path \"$projectDirectory\src\", \"$projectDirectory\lib\", \"$projectDirectory\bin\" -DestinationPath \"$zipFileName\""
