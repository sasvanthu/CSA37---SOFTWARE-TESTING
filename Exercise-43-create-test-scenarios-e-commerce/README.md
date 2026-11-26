# Exercise 43: Create test scenarios for an e-commerce checkout process for system testing

**Type:** Manual

## Aim

To create test scenarios for an e-commerce checkout process for system testing. System testing checks the complete and integrated application from the point of view of the user, including the alternate and the failure flows.

## Pre-requisites and Test Environment

| **Item** | **Details** |
| --- | --- |
| System under test | E-commerce web site with the cart, the checkout and the payment gateway (test mode) |
| Test data | Registered user, a product in stock and a product out of stock, coupons WELCOME10 (valid) and OLD50 (expired) |
| Payment test data | Test card of the gateway for success and an invalid card number for failure |
| Technique | System testing of the complete flow including the alternate and the failure flows |

## Algorithm

**Step 1:** Start and study the checkout process end to end: cart, address, delivery, coupon, payment and order confirmation.

**Step 2:** Identify the test scenarios of the complete flow including the alternate and the failure flows.

**Step 3:** Write the steps and the expected result of every scenario.

**Step 4:** Execute the scenarios on the integrated system and record the status of every scenario.

**Step 5:** Prepare the test data: users, products with and without the stock, the valid and the expired coupons and the cards for the successful and the failed payments.

**Step 6:** Verify the data stored after every scenario (order record, stock count and payment status), not only the screen displayed to the user.

**Step 7:** Report the failed scenarios as defects and stop.

## Test Cases / Document

***Checkout stages and verification points***

| **Stage** | **Verification points** |
| --- | --- |
| Cart | Items, quantity, price and total are correct |
| Address and delivery | Address is saved; delivery charge and date are shown |
| Coupon | Valid coupon reduces the total; invalid coupon gives a message |
| Payment | Success moves to the confirmation; failure keeps the cart |
| Confirmation | Order number, e-mail or SMS, reduced stock and order history |

***Test scenarios***

| **Scenario Id** | **Scenario** | **Steps** | **Expected result** | **Actual result** | **Status** |
| --- | --- | --- | --- | --- | --- |
| CK01 | Checkout as a registered user | Login, add a product, checkout, pay by card | Order is placed and the confirmation page is displayed | Order is placed and the confirmation page is displayed | Pass |
| CK02 | Checkout as a guest | Add a product, checkout without login, enter the address | Guest order is placed | Guest order is placed | Pass |
| CK03 | Apply a valid coupon | Enter a valid coupon in the cart | Discount is applied to the total | Discount is applied to the total | Pass |
| CK04 | Apply an invalid coupon | Enter an expired coupon | Error message and the total is unchanged | Error message and the total is unchanged | Pass |
| CK05 | Product is out of stock | Proceed to checkout with a product that has no stock | Message "Out of stock" and the order is not placed | Message "Out of stock" and the order is not placed | Pass |
| CK06 | Payment failure | Enter an invalid card number | Payment failure message and the order is not placed | Payment failure message and the order is not placed | Pass |
| CK07 | Change the delivery address | Change the address before payment | New address is shown in the order summary | New address is shown in the order summary | Pass |
| CK08 | Order confirmation | Complete an order | Confirmation e-mail / SMS is sent and the stock is reduced | Confirmation e-mail / SMS is sent and the stock is reduced | Pass |
| CK09 | Cancel an order | Cancel an order before the shipment | Order is cancelled and the amount is refunded | Order is cancelled and the amount is refunded | Pass |
| CK10 | Session timeout | Keep the payment page idle for 15 minutes | Session expires and the cart is retained | Session expires and the cart is retained | Pass |

***Test execution summary (fill after the execution of the test scenarios)***

| **Total designed** | **Executed** | **Passed** | **Failed** | **Blocked** | **Pass %** |
| --- | --- | --- | --- | --- | --- |
| 10 | 10 | 10 | 0 | 0 | 100 % |

## Result

Thus the test scenarios of the e-commerce checkout process were created and executed for system testing, and the output was verified. The normal, the alternate and the failure flows of the checkout were tested.
