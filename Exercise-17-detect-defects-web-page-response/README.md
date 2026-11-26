# Exercise 17: Detect defects in a web page response using the Response Assertion in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to detect defects in a web page response using the Response Assertion.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Set Number of Threads = 3, Ramp-up period = 3 seconds and Loop Count = 1.

**Step 3:** Add two HTTP Request samplers for the path /login: the first named "Login Page - correct text" and the second named "Login Page - wrong text".

**Step 4:** Add a Response Assertion to the first sampler: Field to Test = Text Response, Pattern Matching Rule = Contains, Pattern = Login Page.

**Step 5:** Add a Response Assertion to the second sampler with the pattern Dashboard (this text is not in the page, so it represents a defect).

**Step 6:** Add the listeners Assertion Results and Summary Report, run the plan and observe that the second sampler fails in every iteration.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| Thread Group | Number of Threads (users) | 3 |
|  | Ramp-up period (seconds) | 3 |
|  | Loop Count | 1 |
| HTTP Request 1 | Name | Login Page - correct text |
|  | Server Name | the-internet.herokuapp.com |
|  | Protocol / Method / Path | https / GET / /login |
| Response Assertion 1 | Field to Test | Text Response |
|  | Pattern Matching Rule | Contains |
|  | Patterns to Test | Login Page |
| HTTP Request 2 | Name | Login Page - wrong text |
|  | Protocol / Method / Path | https / GET / /login |
| Response Assertion 2 | Field to Test | Text Response |
|  | Pattern Matching Rule | Contains |
|  | Patterns to Test | Dashboard |

> Build this plan in Apache JMeter and save it as `Exercise17.jmx` in this folder.

## Output

```
student@lab: ~ Assertion Results Login Page - correct text   : no failure message (assertion passed) Login Page - wrong text     : Test failed: text expected to contain /Dashboard/  Summary Report Label                       # Samples   Error % Login Page - correct text           3     0.00% Login Page - wrong text             3   100.00% TOTAL                               6    50.00%
```

## Result

Thus Apache JMeter was used to detect defects in a web page response using the Response Assertion and the results were verified.
