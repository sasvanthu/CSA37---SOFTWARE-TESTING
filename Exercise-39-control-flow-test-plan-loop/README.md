# Exercise 39: Control the flow of a test plan using Loop, Once Only and If controllers in JMeter

**Type:** Apache JMeter

## Aim

To use Apache JMeter to control the flow of a test plan using the Loop, Once Only and If controllers.

## Algorithm

**Step 1:** Start Apache JMeter (jmeter.bat or jmeter.sh) and rename the Test Plan. Right click Test Plan, select Add > Threads (Users) > Thread Group.

**Step 2:** Add Config Element > User Defined Variables with the variable run = yes. Set Number of Threads = 1 and Loop Count = 2 in the Thread Group.

**Step 3:** Add Logic Controller > Once Only Controller with the HTTP Request GET /login inside it. It runs only in the first iteration.

**Step 4:** Add Logic Controller > Loop Controller (Loop Count = 3) with the HTTP Request GET /checkboxes inside it.

**Step 5:** Add Logic Controller > If Controller with the condition ${__jexl3("${run}" == "yes")} (select Interpret Condition as Variable Expression) and the HTTP Request GET /dropdown inside it.

**Step 6:** Add Summary Report and run the plan. Change run to no and run again to see that the If Controller skips its request.

**Step 7:** Stop.

## Test Plan Configuration

***Test plan configuration***

| **Element** | **Property** | **Value** |
| --- | --- | --- |
| User Defined Variables | run | yes |
| Thread Group | Number of Threads (users) | 1 |
|  | Ramp-up period (seconds) | 1 |
|  | Loop Count | 2 |
| Once Only Controller | Child | HTTP Request GET /login |
| Loop Controller | Loop Count | 3 |
|  | Child | HTTP Request GET /checkboxes |
| If Controller | Condition | ${__jexl3("${run}" == "yes")} |
|  | Interpret Condition as Variable Expression? | Selected |
|  | Child | HTTP Request GET /dropdown |

> Build this plan in Apache JMeter and save it as `Exercise39.jmx` in this folder.

## Output

```
student@lab: ~ Summary Report (run = yes) Label      # Samples /login             1      (Once Only Controller) /checkboxes        6      (3 per iteration x 2 iterations) /dropdown          2      (1 per iteration x 2 iterations) TOTAL              9  With run = no the /dropdown request is skipped and the total becomes 7.
```

## Result

Thus Apache JMeter was used to control the flow of a test plan using the Loop, Once Only and If controllers and the results were verified.
