# Exercise 37: Implement data-driven testing using the CSV Data Set Config in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to implement data-driven testing using the CSV Data Set Config.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Create the file users.csv with three lines (user name, password and expected message) and save it in the bin folder of JMeter.

**Step 3:** Set Number of Threads = 1 and Loop Count = 3 so that every iteration reads one line of the file.

**Step 4:** Add Config Element > CSV Data Set Config. Enter the file name, the variable names username,password,expected and the delimiter comma. Set Recycle on EOF = False and Stop thread on EOF = True.

**Step 5:** Add the HTTP Cookie Manager (select Clear cookies each iteration) and an HTTP Request POST /authenticate with the parameters ${username} and ${password}.

**Step 6:** Add a Response Assertion with the pattern ${expected}, add View Results Tree and Summary Report and run the plan.

**Step 7:** Stop.

## Test Plan Configuration

***File users.csv***

| **Line** | **Content** |
| --- | --- |
| 1 | tomsmith,SuperSecretPassword!,You logged into a secure area! |
| 2 | tomsmith,wrongpass,Your password is invalid! |
| 3 | baduser,SuperSecretPassword!,Your username is invalid! |

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 1 |
|  | Ramp-up period (seconds) | 1 |
|  | Loop Count | 3 |
| CSV Data Set Config | Filename | users.csv |
|  | Variable Names | username,password,expected |
|  | Delimiter | , |
|  | Recycle on EOF? / Stop thread on EOF? | False / True |
| HTTP Cookie Manager | Clear cookies each iteration? | Selected |
| HTTP Request | Method / Path | POST /authenticate (Follow Redirects) |
|  | Parameters | username = ${username}, password = ${password} |
| Response Assertion | Pattern (Contains) | ${expected} |

> Build this plan in Apache JMeter and save it as `Exercise37.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report Label          # Samples   Error % POST /authenticate     3     0.00%  View Results Tree : the three samples show the three data rows (tomsmith / SuperSecretPassword!, tomsmith / wrongpass, baduser / SuperSecretPassword!) and every assertion passes.
```

## Result

Thus Apache JMeter was used to implement data-driven testing using the CSV Data Set Config and the results were verified.
