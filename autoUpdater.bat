@echo off
title auto update Android Studio to Git
color 1F
ECHO               File updater app
ECHO Close app when done coding/editting related files.

:: Replace <filePath>
SET CURRENT_FILE_1="<filePath>"
SET CURRENT_FILE_2="<filePath>"
SET FILE_TO_UPDATE_1="<filePath>"
SET FILE_TO_UPDATE_2="<filePath>"

:LOOP
FOR %%i IN (%CURRENT_FILE_1%) DO SET DATE_1=%%~ti
FOR %%i IN (%FILE_TO_UPDATE_1%) DO SET DATE_2=%%~ti
IF "%DATE_1%" NEQ "%DATE_2%" GOTO UPDATE_FILE_1
:CONTINUE
FOR %%i IN (%CURRENT_FILE_2%) DO SET DATE_1=%%~ti
FOR %%i IN (%FILE_TO_UPDATE_2%) DO SET DATE_2=%%~ti
IF "%DATE_1%" NEQ "%DATE_2%" GOTO UPDATE_FILE_2

GOTO WAIT

:WAIT
:: wait 1 minute before checking again
ping -n 61 localhost >nul 2>nul
GOTO LOOP

:UPDATE_FILE_1
:: copy file1 to file2 /y
copy %CURRENT_FILE_1% %FILE_TO_UPDATE_1% /y
GOTO CONTINUE

:UPDATE_FILE_2
:: copy file1 to file2 /y
copy %CURRENT_FILE_2% %FILE_TO_UPDATE_2% /y
GOTO WAIT
 